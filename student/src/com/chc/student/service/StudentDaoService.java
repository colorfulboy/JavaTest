package com.chc.student.service;
/*
 * 学生类的业务处理
 */
import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

public interface StudentDaoService {
	
	//查询所有学生信息
	List<Student> selectAll() throws SQLException;
	
	//插入学生
	void insertStudent(Student student) throws SQLException;

	Student checkLogin(String number, String password);


	
}
