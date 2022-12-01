
import java.util.Scanner;

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

    public static void main(String[] args) {
        
        Phone redmiNote8 = new Xiaomi();
        PhoneUser dian = new PhoneUser(redmiNote8);
        dian.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi;
        
        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("---------------------------");
            System.out.println("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah");
            }
        }
    }    
}
