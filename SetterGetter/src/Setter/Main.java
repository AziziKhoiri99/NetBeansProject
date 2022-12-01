/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Setter;

/**
 *
 * @author JHON
 */
public class Main {
    public static void main(String []args){
        User dian = new User();    
        dian.setUsername("dian");
        dian.setPassword("kopiJava");
        
        System.out.println("Username: " + dian.getUsername());
        System.out.println("Password: " + dian.getPassword());
    }
}
