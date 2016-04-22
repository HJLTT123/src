package com.briup.ch12;

/**
  教师类是用来创建学生对象的，教师对象是用来存储该学生的信息的
*/
public class Teacher{
	private long id;
	private String name;
	private int age;

	public Teacher(){
	
	}
	public Teacher(long id,String name,int age){
			this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void setId(long id){
		this.id = id;
	}
	public long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}

	public String toString(){
		return "Teacher[id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
	}
}
