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
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
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
        
        // lecture 5
        
        Cat cat1 = new Cat("Susan", 2, FEMALE); 
        
        // implicit casting (polymorpism) 
        
        Pet pet3 = cat1; 
        Pet pet4 = dog3; // test to show polymorpism
        
//        pet3.meow(); 

        // if we try it the other way around, error
        // why? because not all pet's are cat's  
//        Cat cat4 = pet3
        
        // Explicit casting (not polymorphism) 
        
        Cat cat3 = (Cat) pet3;
//        Cat cat4 = (Cat) pet4; // test to show not polymorhism
        
        cat3.meow();
        
//        Cat cat5 = null; 
        // we also do a logical test as to the type of a particular object 
        // using the instanceof operator 
        if (pet3 instanceof Cat){
            Cat cat5 = (Cat) pet3; 
            
            cat5.meow(5);
        }
        
//        cat5.meow(5);
        
        // test to try it the other way around ... failed ... runtime error 
//        Pet test = new Pet("Cat", "No", 2, FEMALE); 
//        
//        Cat test2 = (Cat) test; 
        
    }
    
}
