package cn.jbit.controller;

import java.util.List;

import javax.annotation.Resource;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jbit.pojo.Student;
import cn.jbit.service.StudentService;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Resource(name="studentService")
	private StudentService studentService;
	
	
	/**
	 * �޸ĵ�һ��
	 * @return
	 */
	@RequestMapping("/upd1/{id}")
	public String upd1(@PathVariable Integer id, org.springframework.ui.Model model){
		Student stu=studentService.getStuById(id);
		model.addAttribute("stu",stu);
		return "update";
	}
	/**
	 * �޸ĵڶ���
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/upd2")
	public String upd1(Student stu){
		int res=studentService.update(stu);
		return JSON.toJSONString(res);
	}
	
	@ResponseBody
	@RequestMapping("/del/{id}")
	public String del(@PathVariable Integer id){
		int res=studentService.delete(id);
		return JSON.toJSONString(res);
	}
	
	
	//,produces={"application/json;charset=UTF-8"}���JSON���룬�Ƚ�����ÿһ����������Ҫ��ӣ��Ƚ��鷳
		@ResponseBody//������ֵ����HTTP ResponseBody���棬�첽�����ʱ����Ҫ��Ӵ�ע�⣬��Ȼ���404����
		@RequestMapping(value="/getAll")
		public String getAll() {
			List<Student> stus = studentService.getAll();
			return JSON.toJSONString(stus);
		}
		
	
	/**
	 * ���
	 * @param stu
	 * @return
	 */
//	@RequestMapping("/add")
//	public String add(Student stu){
//		int res=studentService.add(stu);
//		if(res>0){
//			return "welcome";
//		}else{
//			return "add";
//		}
//	}
		@ResponseBody
		@RequestMapping("/add")
		public String add(Student stu){
			int res=studentService.add(stu);
			return JSON.toJSONString(res);
		}
	
	/**
	 * ��ת��add.jspҳ��
	 */
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "add";
	}
	/**
	 * ��ת��welcome���
	 * @return
	 */
	@RequestMapping("/toWelcome")
	public String toWelcome(){
		return "welcome";
	}
}
