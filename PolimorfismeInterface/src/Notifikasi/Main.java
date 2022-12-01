/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notifikasi;

/**
 *
 * @author JHON
 */
public class Main {
    public static void main(String[] args) {
        String emailPenerima = "anonimus@excellent.com";
        String nomerHp = "+628111111111";
        String mobileId = "admin123";
        
        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();
        
        String message = "Tutorial OOP Java Polimorfisme";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
