package cn.jbit.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer id;//ѧ��id
	private String name;//ѧ������
	private Integer age;//ѧ������
	//��װʵ����
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
