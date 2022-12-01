/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JHON
 */
public class Main {
    public static void main(String[] args) {
        Shape segitiga = new Triangle(4, 5);
        Shape lingkaran = new Circle(10);
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
}
