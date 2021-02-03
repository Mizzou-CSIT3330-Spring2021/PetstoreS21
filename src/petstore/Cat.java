/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

/**
 *
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
 */
public class Cat extends Pet {
    
    // constructors are special methods 
    // same name as class, no return type
    public Cat(String name, int age, Gender gender){
        super("Cat", name, age, gender); 
        
        // 1) call superclass constructor 
        // 2) invoke superclass methods 
        // 3) manipulate superclass fields 
    }
    
    // method overloading (polymorphism) 
    public void meow(int meow){
        for(int i = 0; i < meow; i++){
            System.out.println("meow.");
        }
    }
    
    public void meow(){
        meow(1); 
    }
    
    public String meow(String noise){
        System.out.println(noise);
        return noise; 
    }
    
    // method overriding (polymorphism) 
    
    @Override
    public int getAge(){
        return age * 7; 
    }
}
