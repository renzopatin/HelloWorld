/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sport.type;

import ec.edu.espe.sport.model.Sport;

/**
 *
 * @author renzo
 */
public class TestingSport {
    
    public static void main(String[] args) {
        
        Sport[] sport = new Sport[7];
    
        for(int i = 0; i < sport.length; i++ ){
            
            sport[i] = new Sport(0,"","");
            String ball = new String();
            
            if(i % 2 == 0){
                ball = "With ball";
            }
            else{
                ball = "No ball";
            }
            
            switch (i+1){
                
                case 1:
                    sport[i] = new Sport(1,"Soccer",ball);
                    break;
                case 2:
                    sport[i] = new Sport(2,"Swimming",ball);
                    break;
                case 3:    
                    sport[i] = new Sport(3,"Basketball",ball);
                    break;
                case 4:    
                    sport[i] = new Sport(4,"Weightlifting",ball);
                    break;
                case 5:    
                    sport[i] = new Sport(5,"Rugby",ball);
                    break;
                case 6:
                    sport[i] = new Sport(6,"boxing",ball);
                    break;
                case 7:
                    sport[i] = new Sport(7,"baseball",ball);
                    break;
            }

        }
        
        for(Sport sports:sport){
            System.out.println(sports.getId()+" "+sports.getName()+"  type: "+sports.getType());
        }
    }
}