package com.dyb.pojo;



public class User {
	private Integer id;  //默认值 null
	private String name;
	private String pwd;
	private String sex;
	private int age;  //默认值 null
	private String info;
	
	public User() {
	}
	
	public User(String name, String pwd, String sex, int age, String info) {
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.age = age;
		this.info = info;
	}
	
	public User(int id, String name, String pwd, String sex, int age, String info) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
		this.age = age;
		this.info = info;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", sex=" + sex + ", age=" + age + ", info=" + info
				+ "]";
	}
}
