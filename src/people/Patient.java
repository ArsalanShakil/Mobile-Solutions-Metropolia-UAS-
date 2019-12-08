/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author dell
 */
//1. Who is the super class inherited
public class Patient extends Person {
    //3.New instance variable
    private String treatment;
    public Patient(String name,String treatment){
        super(name);//2. super class sets the given value
                    //inherited instance variable by 
                    //calling super class constructor
                    //super is in this case Person
       this.treatment=treatment;
    }
                    //4. override inherited method if functionality is needed
    @Override
    public String getInfo(){
         return super.getInfo() + this.treatment;
        }
    
}
 