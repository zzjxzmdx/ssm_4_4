package cn.jbit.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.jbit.dao.StudentDao;
import cn.jbit.pojo.Student;
import cn.jbit.service.StudentService;
@Service("studentService")
public class StudentServiceImpl implements StudentService{
	
	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentDao.getAll();
	}

	@Override
	public int add(Student stu) {
		// TODO Auto-generated method stub
		return studentDao.add(stu);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return studentDao.delete(id);
	}

	@Override
	public Student getStuById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStuById(id);
	}

	@Override
	public int update(Student stu) {
		// TODO Auto-generated method stub
		return studentDao.update(stu);
	}

	
	

}
