/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author ducth
 */
public class Dog {
    private final int dogId;
    private String name;
    private double age;
    private char sex;
    private boolean foundHome = false;
    
    public Dog (int dogId, String name, double age, char sex) {
        this.dogId = dogId;
        this.name = name;
        this.age = age;
        this.sex = sex;
        foundHome = false;
    }
    
    public int getId () {
        return dogId;
    }
    
    public String getName () {
        return name;
    }
    
    public double getAge () {
        return age;
    }
    
    public char getSex () {
        return sex;
    }
    
    public boolean getStatus () {
        return foundHome;
    }
    
    public String ViewAll () {
        return "Id: " + getId() + " Name: " + getName() + " Age: " + getAge() + " Sex: " + getSex() + " Found Home: " + getStatus();
    }
    
    /*public String ViewAllAvailable () {
        
    }*/
    
    public void Update (boolean foundHome) {
        this.foundHome = foundHome;
    }
}
