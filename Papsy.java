/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papsy;

/**
 *
 * @author philipfynn
 */
public class Papsy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student();
        Student2 p = new Student2();
        p.name = "Sam";
        p.phonenumber=("0557536632");
        p.roll_no = 5;
        p.address = "Prampram";
        
        s.name = "John";
        s.phonenumber=("0243179088");
        s.address = ("Tema Community 25");
        s.roll_no = 2;
        System.out.println("His name is " + s.name + " ,roll number is " + s.roll_no + " his phone number is "+ s.phonenumber + " snd he lives at "+s.address);
        System.out.println("His name is " + p.name + " ,roll number is " + p.roll_no + " his phone number is "+ p.phonenumber + " snd he lives at "+p.address);
        // TODO code application logic here
    }
    
}
