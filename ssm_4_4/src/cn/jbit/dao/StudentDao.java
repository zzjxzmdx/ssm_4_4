package cn.jbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jbit.pojo.Student;

public interface StudentDao {
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
	int delete(@Param("id") int id);
	/**
	 * 根据id查询信息
	 */
	Student getStuById(@Param("id") int id);
	/**
	 * 修改
	 */
	int update(Student stu);
	
}
