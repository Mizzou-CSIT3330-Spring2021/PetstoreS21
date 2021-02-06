/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import petstore.Gender;
import petstore.Pet;

/**
 *
 * @author Professor Wergeles <Professor Wergeles at cs3330@missouri.edu>
 */
public class Dog extends Pet {
    
    // class field (static variable) 
    private static int numOfDogs = 0;
    
    // instance field (non-static variable) 
    private int id = 0; 
    
    // constant 
    private static final String GENUS = "Canis";
    
    private String position = "Standing"; 
    
    public Dog(String name, int age, Gender gender){
        super("Dog", name, age, gender); 
        
        id = ++numOfDogs; 
    }
    
    // this is also not allowed
    // cannot set the value of a constant 
    public static void setGenus(){
//        GENUS = "something"; 
    }
    
    // this is not allowed
    // cannot reference an instance field from a static method 
//    public static int getIDTest(){
////        return id; 
//    }
    
    public static String getGenus(){
        return GENUS; 
    }
    
    public static int getNumOfDogs(){
        return numOfDogs; 
    }
    
    public int getID(){
        return this.id; 
    }
    
    public void sit(){
        position = "seated"; 
    }
    
    public void standPretty(){
        position = "standing";
    }
    
    public String getPosition(){
        return this.position; 
    }
    
//    @Override
//    public void birthday(){
//        age += 7;
//    }
    
    @Override
    public int getAge(){
        return age * 7; 
    }
    
    // Method overloading (Same method name in the same class with different parameter list) 
        
    public void bark(int num){
        for(int i = 0; i < num; i++){
            System.out.println("Bark!");
        }
    }
    
    public void bark(){
        bark(1); 
    }
    
//    public void test(){
//        this.age =  10;  
//    }
    
}
