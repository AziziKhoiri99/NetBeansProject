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
public class SMSNotification implements InterfaceNotifikasi {
    @Override
    public void sendMessage(String receiver, String content) {
      System.out.println("Mengirim SMS ke " + receiver + " dengan ini:");
      System.out.println(content);//To change body of generated methods, choose Tools | Templates.
    }
}
