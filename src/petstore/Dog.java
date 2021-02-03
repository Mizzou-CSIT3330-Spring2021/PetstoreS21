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
public class Dog extends Pet {
    
    // class field (static variable) 
    private static int numOfDogs = 0;
    
    // instance field (non-static variable) 
    private int id = 0; 
    
    // constant 
    private static final String GENUS = "Canis"; 
    
    public Dog(String name, int age, Gender gender){
        super("Dog", name, age, gender); 
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
