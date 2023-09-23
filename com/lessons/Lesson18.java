package com.lessons;

public class Lesson18 {
    public static void main (String[] args){
        Personal personal1 = new Personal();
        personal1.setAge(18);
        personal1.setName("Kirill");
        personal1.getInfo();
        Personal personal2 = new Personal();
        personal2.setAge(23);
        personal2.setName("Vasea");
        personal2.getInfo();


    }
}
class Human{
    String name;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println(name +","+age);
    }
}
    

