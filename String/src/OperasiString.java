/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
//import java.util.String;

/**
 *
 * @author JHON
 */
public class OperasiString {
    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";
        
        System.out.println(kalimat.charAt(10));
        
        
        String kata = kalimat.substring(10,15);
        System.out.println(kata);
       
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);
        
        kata = kata + " cireng";
        System.out.println(kata);
        
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;
        System.out.println(kalimat3);
//        System.out.println(kata + " " + jumlah);
        
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        String kalimat4 = kalimat.replace("pisang", "combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);
        
    }
}
