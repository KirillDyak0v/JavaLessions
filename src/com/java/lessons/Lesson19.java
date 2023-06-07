package com.java.lessons;

public class Lesson19 {
    public static void main (String[] args){
        Human human1 = new Human("Vasea", 23);
        human1.getInfo();
        
    
    }
}class Human{
    String name;
    int age;
    public Human(String name, int age){
        System.out.println("Привет из первого конструктора");
        this.name = "Player01";
        this.age = 18;
    }
    public Human(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
       

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void getInfo(){
        System.out.println(this.name +","+this.age);
    }
}