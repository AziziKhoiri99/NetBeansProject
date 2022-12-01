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
public class ArrayForEach {
    public static void main(String[] args){
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        
        System.out.println("looping standard");
        for(int i = 0; i < 10; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }
        
        System.out.println("looping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }
        
        System.out.println("looping for each");
        for(int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);
        }
        
    }
}
