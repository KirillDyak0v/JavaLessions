package com.lessons;

public class Lesson19 {
    public static void main (String[] args){
        Personal personal1 = new Personal();
        personal1.getInfo();
        
    
    }
}class Personal {
    String name;
    int age;
    public Personal(){
        System.out.println("Привет из первого конструктора");
        this.name = "Player01";
        this.age = 18;
    }
    public Personal(String name, int age){
        System.out.println("Привет из второго конструктора");
        this.name = name;
        this.age = age;

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