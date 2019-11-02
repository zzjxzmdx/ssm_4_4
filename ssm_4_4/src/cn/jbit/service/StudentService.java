package cn.jbit.service;

import java.util.List;

import cn.jbit.pojo.Student;

public interface StudentService {
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
	int delete(int id);
	/**
	 * ����id��ѯ��Ϣ
	 */
	Student getStuById(int id);
	/**
	 * �޸�
	 */
	int update(Student stu);
}
