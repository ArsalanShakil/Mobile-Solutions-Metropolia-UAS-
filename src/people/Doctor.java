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
public class Doctor extends Person {
    private String title;
    public Doctor(String name, String title){
        super (name);
        this.title=title;
    }
    public String getInfo(){
        return super.getInfo()+","+this.title;
    }
    
}
