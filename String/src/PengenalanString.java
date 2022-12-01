/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;

/**
 *
 * @author JHON
 */
public class PengenalanString {
    public static void main(String[] args){
        String kataString = "hallo";
        char[] kataChar = {'h','a','l','l','o'};
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        
        System.out.println("komponen pertama dari char[] = " + kataChar[3]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(3));
        
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));
        
        printAddress("kataString", kataString);
        kataString = "c" + kataString.substring(1,5);
        System.out.println(kataString);
        printAddress("kataString", kataString);
        
        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";
        
        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);
        
        str_3 = str_3.substring(0,4);
        printAddress("str_3",str_3);
        
        String str_4 = "callo";
        printAddress("str_4",str_4);
        
        kataString = "callo";
        printAddress("kataString",kataString);
        
        String a = new String("hallo");
        printAddress("a",a);
    }

    private static void printAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
