package cn.jbit.service;

import java.util.List;

import cn.jbit.pojo.Student;

public interface StudentService {
	/**
	 * 查询全部学生信息
	 * @return
	 */
	List <Student> getAll();
	/**
	 * 添加
	 */
	int add(Student stu);
	/**
	 * 刪除
	 */
	int delete(int id);
	/**
	 * 根据id查询信息
	 */
	Student getStuById(int id);
	/**
	 * 修改
	 */
	int update(Student stu);
}
