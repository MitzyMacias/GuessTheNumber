/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;

import java.util.Scanner;

/**
 *
 * @author MitzyMacias
 */
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mySc=new Scanner(System.in);
        
        System.out.println("* * *  Guess the number * * *");
        int max=100;
        int min=1;
        int rNum=(int)(Math.random()*(max-min+1)+min);
        System.out.println("The random number is "+rNum);
        int num=0;
        
        do{
            System.out.println("Write a number: ");
            num=mySc.nextInt();
            
            
            
            if(num==rNum){
                System.out.println("Congratulations! You got it!");
            }else if(num>rNum){
                System.out.println("The number you wrote is greater than the random number!");
            }else{
                System.out.println("The number you wrote is less than the random number!");
            }
        }while(num!=rNum);
        
        
    }
    
}
