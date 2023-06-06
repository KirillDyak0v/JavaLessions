package com.java.lessons;
public class Lesson17 {
    public static void main (String[] args){
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(0);
        person1.speak();

    }
    }
    class Person{
        private String name;
        private int age;
        public void setName(String userName){
            if (userName.isEmpty()){
                System.out.println("Вы ввели пустое значение");
            }else{
            name = userName;}
        }
        public String getName(){
            return name;}
        public void setAge(int userAge){
            if (userAge<1){
            System.out.println("Вы ввели отрицательное значение");
            }else{
            age = userAge;} 
        }
        public int getAge(){
            return age;}
    void speak(){
        System.out.println("Меня зовут "+name + "\nИ мне  " +age);

    }

    }