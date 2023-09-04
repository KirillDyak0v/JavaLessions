package com.java.lessons;

public class Lesson20 {
    public static void main(String[] args){
    SawPerson h1 = new SawPerson("Vasea",10);
    SawPerson h2 = new SawPerson("Lolka", 15);
    h1.info();
    h2.info();
}
}
 class SawPerson{
        private int age;
        private String name;
        public static int numberPerson;
    public SawPerson(String name, int age){
        this.age = age;
        this.name = name;
        numberPerson++;
    }public void info(){
        System.out.println(this.name +","+this.age+" Num: "+numberPerson);
    }
    
}
    

