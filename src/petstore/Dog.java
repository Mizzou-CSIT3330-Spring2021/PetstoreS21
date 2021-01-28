/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;

/**
 *
 * @author Nick_Work
 */
public class Dog extends Pet {
    
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
    
//    public void test(){
//        this.age =  10;  
//    }
    
}
