package cn.jbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.jbit.pojo.Student;

public interface StudentDao {
	/**
	 * ��ѯȫ��ѧ����Ϣ
	 * @return
	 */
	List <Student> getAll();
	/**
	 * ���
	 */
	int add(Student stu);
	/**
	 * �h��
	 */
	int delete(@Param("id") int id);
	/**
	 * ����id��ѯ��Ϣ
	 */
	Student getStuById(@Param("id") int id);
	/**
	 * �޸�
	 */
	int update(Student stu);
	
}
