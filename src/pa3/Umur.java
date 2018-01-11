/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa3;

/**
 *
 * @author Noor Aiman
 */
import java.util.Scanner;
public class Umur {
    public static void main(String[]args){
    Scanner input= new Scanner(System.in);
        int umur;
        
System.out.print("Masukkan umur anda: ");
umur=input.nextInt();
    
if(umur <= 45){
        System.out.println("ANDA MASIH MUDA DAN CANTIK");

}else{
        System.out.println("ANDA SUDAH TUA DAN PERLUKAN REHAT");
}
    }
}
