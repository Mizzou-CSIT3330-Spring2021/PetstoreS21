/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

/**
 *
 * @author Nick_Work
 * 
 * @references: 
 *      1) url
 *      2) url 2
 */
public class Pet {
    public String type; 
    private String name; 
    public int age; 
    public Gender gender; 
    
    // no-arg constructor 
    public Pet(){
        // Constructors are special methods, with the same as the class, 
        // and no return type 
    }
    
    // parameter constructor 
    public Pet(String type, String name, int age, Gender gender){
        this.type = type; 
        this.name = name; 
        this.age = age; 
        this.gender = gender;
    }
    
    // start of code from url2
    
    // getter
    public String getName(){
        return name; 
    }
    // setter 
    public void setName(String name){
        this.name = name; 
    }
    
    // end of code from url2 
    
    public String getType(){
        return this.type; 
    }
    
    public void birthday(){
        age++;
    }
    
    public int getAge(){
        return age; 
    }
}
