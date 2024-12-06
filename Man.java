/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Man {
    private String name;
    private int age;

    //default constractor (more than one constractor is constractor over loading)
    public Man() {
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //private & setters, getters is encapsulation
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age; // shadowing
    }
    public void sayHello(){
        System.out.println("Hello my name is "+name+" and my age is "+age+"");//+--+ (is concatination)
    }
}