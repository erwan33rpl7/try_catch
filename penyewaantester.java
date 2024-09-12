package penyewaan;

import java.util.Scanner;

public class penyewaantester extends Product {
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
        CD CD =new CD();
     DVD DVD=new DVD();
    try {
         System.out.println("mau membuat berapa?");
        int jumlah= s.nextInt();
        System.out.println("jumlah :"+ jumlah);
    } catch (Exception e) {
       System.out.println("tipe data salah");
    }
    
    System.out.print("CD atau DVD?");
    String pilihan = s.next();
    if (pilihan.equals("CD")){
        CD.print();
    }else if (pilihan.equals("DVD")){
            DVD.print();
        }else {
        System.out.print("sistem error");
    }
    }
    
     }

        




    
    
    



   