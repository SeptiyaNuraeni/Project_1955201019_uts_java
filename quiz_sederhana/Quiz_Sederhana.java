/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_sederhana;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Quiz_Sederhana {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 0;
        int input = 0;
        String a ="y";
        int poin = 0;
        int jawab ;
        
        do{
            System.out.println("Skor Pertama Anda Adalah Nol");
            System.out.println("Jika Jawaban Anda Benar Bertambah 20");
            System.out.println("Jika Jawaban Anda Salah Dikurangi 10");
            Scanner scan = new Scanner(System.in);
            
            System.out.println("1.Ada berapa fakultas dalam Universitas Nahdlatul Ulama?");
            jawab = scan.nextInt();
            if (jawab==3){
                System.out.println("Jawaban Anda Benar");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin+=20);
            } else{
                System.out.println("Jawaban Anda Salah");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin-=10);
            } 
            System.out.println("2.Ada berapa prodi dalam fakultas Eksakta di UNU Blitar?");
            jawab = scan.nextInt();
            if(jawab==6){
                System.out.println("Jawaban Anda Benar");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin+=20);
            }else{
                System.out.println("Jawaban Anda Salah");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin-=10);
            }
            System.out.println("3.Berapakah Mahasiswa kelas Ilkom 2a?");
            jawab = scan.nextInt();
            if(jawab==34){
                System.out.println("Jawaban Anda Benar");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin+=20);
            }else{
                System.out.println("Jawaban Anda Salah");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin-=10);
            }
            System.out.println("4.Pada bulan berapa Universitas Nahdlatul Ulama Blitar berdiri?");
            jawab = scan.nextInt();
            if(jawab==8){
                System.out.println("Jawaban Anda Benar");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin+=20);
            }else{
                System.out.println("Jawaban Anda Salah");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin-=10);
            }
            System.out.println("5.Berapakah hasil dari 100:5=");
            jawab = scan.nextInt();
            if(jawab==20){
                System.out.println("Jawaban Anda Benar");
                System.out.println("Selamat Anda mendapatkan poin :");
                System.out.println(poin+=20);
            }else{
                System.out.println("Jawaban Anda Salah");
                System.out.println("Poin Anda Adalah :");
                System.out.println(poin-=10);
            }
            System.out.println(" Apakah Anda Ingin Mengulang? y/t");
            a= scan.next();
        }while ("y".equals(a));
        }
}

