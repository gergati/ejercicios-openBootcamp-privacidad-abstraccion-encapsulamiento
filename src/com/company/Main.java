package com.company;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setName("German");
        System.out.println("Hola mi nombre es " + persona.getName());

        persona.setAge(27);
        System.out.println("Tengo " + persona.getAge());


        persona.setPhone(162654104);
        System.out.println("Mi numero de celular es: " + persona.getPhone());
    }
}

class Persona {
    private int age;
    private String name;
    private int phone ;

    public int setAge (int age){
       return this.age = age;
    };
    public int getAge(){
        return this.age;
    }
    public String setName(String name){
        return this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int setPhone(int phone){
        return this.phone = phone;
    }
    public int getPhone(){
        return this.phone;
    }
}