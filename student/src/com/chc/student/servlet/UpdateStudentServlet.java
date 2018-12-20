package com.chc.student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chc.student.service.StudentDaoService;
import com.chc.student.service.StuedntDaoServiceImpl;
import com.chc.student.student.Student;

/**
 * 更新新的学生信息到数据库
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//获取表单数据
				String sname=request.getParameter("sname");
				String number=request.getParameter("number");
				String sex=request.getParameter("sex");
				String sage=request.getParameter("age");
				String phone=request.getParameter("phone");
				String hobby=request.getParameter("hobby");
				String info=request.getParameter("info");
				Integer age = Integer.valueOf(sage);
				
				
				//数据入库
				Student student=new Student(sname,number,sex,phone,age,hobby,info);
				StudentDaoService service=new StuedntDaoServiceImpl();
				service.updateStudent(student);
				
				//插入成功， 重定向到show.jsp
				response.sendRedirect(request.getContextPath()+"/StudentAllStudent");
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
