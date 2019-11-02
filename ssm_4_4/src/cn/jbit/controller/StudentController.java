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
	 * 修改第一步
	 * @return
	 */
	@RequestMapping("/upd1/{id}")
	public String upd1(@PathVariable Integer id, org.springframework.ui.Model model){
		Student stu=studentService.getStuById(id);
		model.addAttribute("stu",stu);
		return "update";
	}
	/**
	 * 修改第二步
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
	
	
	//,produces={"application/json;charset=UTF-8"}解决JSON乱码，比较灵活，但每一个方法都需要添加，比较麻烦
		@ResponseBody//将返回值存在HTTP ResponseBody里面，异步请求的时候需要添加此注解，不然会出404错误
		@RequestMapping(value="/getAll")
		public String getAll() {
			List<Student> stus = studentService.getAll();
			return JSON.toJSONString(stus);
		}
		
	
	/**
	 * 添加
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
	 * 跳转到add.jsp页面
	 */
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "add";
	}
	/**
	 * 跳转到welcome頁面
	 * @return
	 */
	@RequestMapping("/toWelcome")
	public String toWelcome(){
		return "welcome";
	}
}
