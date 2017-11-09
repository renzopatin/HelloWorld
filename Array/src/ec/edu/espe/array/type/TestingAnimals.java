/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array.type;

import ec.edu.espe.array.model.Animal;

/**
 *
 * @author renzo
 */
public class TestingAnimals {
    
    public static void main(String[] args) {
        
        Animal[] animal = new Animal[3];
        
        for(int i = 0; i < animal.length; i++ ){
            
            animal[i] = new Animal(0,"","");
            //setters cambiar un solo dato
            animal[i].setName("Horse0"+(i+1));
            animal[i].setId(i+1);
            if(i%2 == 0 )
                //Constructor cambiar todos los datos
                //animal[i] = new Animal(i+1,"brown","Horse0"+(i+1));
                animal[i].setEyes("black");
            else
                animal[i].setEyes("brown");
        }
        
        for(Animal animals:animal){
            System.out.println(animals.getId()+"  name:"+animals.getName()+"  color: "+animals.getEyes());
        }
    }
    
}