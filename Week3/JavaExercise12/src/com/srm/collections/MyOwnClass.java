package com.srm.collections;

class MyOwnClass {
String name;
int age;
public MyOwnClass(String name,int age) {
	this.name=name;
	this.age=age;
}
@Override
public String toString() {
	return "MyOwnClass [name=" + name + ", age=" + age + "]";
}

}
