package cn.jbit.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer id;//学生id
	private String name;//学生名字
	private Integer age;//学生年龄
	//分装实体类
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
