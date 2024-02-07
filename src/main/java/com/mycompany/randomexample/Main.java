/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomexample;

/**
 *
 * @author user
 */
public class Main {
    public static void main (String[] args){
        
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        
        for ( int i=0; i<10;i++ ){
            int rand = (int)(Math.random()* range) + min;
            System.out.println(rand);
        }
    }
    
}
