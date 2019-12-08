/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *  Blueprint for persons with name given.
 * Blueprint : model, "drawing" what kind of objects can be created.
 * @author dell
 */
public class Person {
    // instance vairable 
    private String name;
    //constructor
    public Person(String name){
        this.name = name ;
    }
    //method
    public String getInfo(){
        return this.name;
    }
            
}
