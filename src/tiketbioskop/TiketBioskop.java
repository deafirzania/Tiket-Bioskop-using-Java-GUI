package tiketbioskop;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TiketBioskop {
    
public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        boolean kondisi = false;
        System.out.println("=======================================");
        System.out.println("======Selamat Datang di Cinema XXI=====");
        System.out.println("=======================================");
        do {
        System.out.println("Berikut Menu yang Tersedia");
        System.out.println("1. Menginput Nama Film");
        System.out.println("2. Melihat Nama Film");
        System.out.print("Pilihan Anda : ");
        int menu = in.nextInt();

      switch(menu){
            case 1 :
        System.out.print("Masukkan Hari : ");
        String hari = in.next();
        System.out.print("Studio ke- : ");
        String studio = in.next();
        File biodata = new File ("E:/"+hari+studio+".txt");
        System.out.print("Masukkan Jumlah Pilihan Film yang Tersedia : " );
        int x = in.nextInt();
        String[] film= new String [x];
        int[] kursi = new int[x];
        
        try {
            biodata.createNewFile();
            PrintWriter pewe = new PrintWriter(biodata);
        for (int a=0; a<x;a++) {
            System.out.print("Nama Film : ");
            String z = in.nextLine();
            film[a] = in.nextLine();
            pewe.write(film[a]);
            System.out.print("Jumlah Kursi yang Tersedia : ");
            kursi[a] = in.nextInt();
            pewe.write(" Jumlah Kursi yang Tersedia : "+kursi[a]);
            pewe.write("\n");
            System.out.println(film[a]+" berhasil dicatat ke file");
            System.out.println();
        }
        pewe.close();
            //cara mengatasi eror
        } catch (Exception e) {
            System.out.println("Error di "+e);
        }
        System.out.println("Apakah Anda ingin mengulagi lagi?(y/n)");
        String pilih = in.next();
                    if (pilih.equals("y")) {
                    kondisi = true;
                    } else if(pilih.equals("n")){
                    kondisi = false;
                    }else{
                        System.out.println("Pilihan Salah");
                        kondisi = false;
                    }  break;
        
            case 2:
        System.out.println("Masukkan Hari : ");
        hari = in.next();
        System.out.print("Studio ke- : ");
        studio = in.next();
                System.out.println("==== Daftar Film pada Hari "+hari+" di Studio ke-"+studio+" ====");
        FileReader file = null;
        try{
            file = new FileReader("E:/"+hari+studio+".txt");
            BufferedReader bfr = new BufferedReader(file);
            String text;
            while ((text = bfr.readLine()) !=null) {
                System.out.println(text);
            }
        }catch (Exception e) {
            System.out.println("Error di "+e);
            
        } System.out.println("Apakah Anda ingin mengulagi lagi?(y/n)");
         pilih = in.next();
                    if (pilih.equals("y")) {
                    kondisi = true;
                    } else if(pilih.equals("n")){
                    kondisi = false;
                    }else{
                        System.out.println("Pilihan Salah");
                        kondisi = false;
                    }  break;
        }
        
        
        }while (kondisi);
    }
    }