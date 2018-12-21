package com.chc.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

/*
 * 访问数据库
 */
public interface StudentDao {
	
	//查询学生信息
//	List<Student> selectAll(String number, String password) throws SQLException;
	List<Student> selectAll() throws SQLException;
	
	//插入学生
	void insertStudent(Student student) throws SQLException;
	
	//登录匹配
	Student selectLogin(String number, String password);
	
	//取出学生信息到编辑页
	Student editStudent(int id) throws SQLException;
	
	//更新学生信息到数据库
	void updateStudent(Student student) throws SQLException;
	
	//删除学生信息
	void deleteStudent(int id) throws SQLException;
}
