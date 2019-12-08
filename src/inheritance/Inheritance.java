/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import people.Person;
import people.Patient;
import people.Doctor;

/**
 *
 * @author dell
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person teacher = new Person("Kake");
        System.out.println(teacher.getInfo());
        Person student = new Person("Maija");
        System.out.println(student.getInfo());
        // TODO code application logic here
        //Create Patient type objects
        Patient pat1 = new Patient("Sick 1","lobotomy");
        System.out.println(pat1.getInfo());
        
          Doctor doc = new Doctor("harry","eye surgeon");
        System.out.println(doc.getInfo());
    }
    
}
