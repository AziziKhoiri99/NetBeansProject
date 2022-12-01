/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHON
 */
public class Main {
    
    static String title = "Class Anonymus";
    
    public static void main(String[] args){
        String name = "Anonymus";
        Button btn = new Button();

        btn.setClickAction(new Clickable() {
            String message = "belajar OOP Java";
            
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
                
                System.out.println("Hello " + name);
                System.out.println(title);
                System.out.println(message);
            }
        });
        
        btn.doClick();
    }
}
