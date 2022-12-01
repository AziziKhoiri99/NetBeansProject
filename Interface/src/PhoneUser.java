/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JHON
 */
public class PhoneUser {
    private final Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    
    void turnOnThePhone() {
        this.phone.powerOn();
    }
    
    void turnOffThePhone() {
        this.phone.powerOff();
    }
    
    void makePhoneLouder() {
        this.phone.volumeUp();
    }
    
    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}
