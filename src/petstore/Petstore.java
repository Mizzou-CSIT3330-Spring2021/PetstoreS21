/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

import static petstore.Gender.FEMALE;
import static petstore.Gender.MALE; 

/**
 *
 * @author Nick_Work
 */
public class Petstore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pet pet = new Pet(); 
        pet.setName("Maggie");
        pet.age = 3; 
        pet.gender = Gender.FEMALE; 
        pet.type = "Dog"; 
        
        
        Pet pet2 = new Pet("Cat", "Kitty", 2, Gender.FEMALE); 
        
        String name = pet.getName(); 
        
        System.out.println("Pet name: " + name);
        System.out.println("Pet2 name: " + pet2.getName());
        
        // code from lecture 3
        
        Dog dog = new Dog("Fido", 3, MALE);
        
        System.out.println(dog.getName() + " is " + dog.getAge() + " dog years old");
        
        dog.birthday(); 
        
        System.out.println(dog.getName() + " is " + dog.getAge() + " dog years old");
        
        Dog dog2 = new Dog("Halo", 11, FEMALE); 
        
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " dog years old");
        
        dog2.birthday(); 
        
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " dog years old");
        
        // code from lecture 4
        
        Cat cat = new Cat("Susan", 2, FEMALE); 
        
        // Polymorphism (most important type) 
        
        Pet cat2 = new Cat("Poly", 3, MALE); 
        
        Pet dog3 = new Dog("Poly2", 3, FEMALE);
        
    }
    
}
