/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan29.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : mengetahui kepibradian dengan warna kesukaan
 */
public class PBO2PERT210118046Latihan29WarnaKepribadian {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    /**
     * @param args the command line arguments
     */
    
    /**
     *
     * @param pilih
     * @param args the command line arguments
     */
    public static void kepribadian(String pilih, String nama) {
        pilih = pilih.toUpperCase();
        nama = nama.toUpperCase();
        System.out.println("======HASIL TEST KEPRIBADIAN " + nama + "======");
        switch (pilih) {
            case "BIRU" : 
                System.out.println("Warna Favoritmu Adalah " + ANSI_BLUE + pilih);
                System.out.println("1. Menyenangkan,\n2. Bijaksana,\n3. Pembawaan diri tenang saat menghadapi masalah,\n4. Dinamis,\n5. Senang berbagi,\n6. Bersahabat,\n7. Tidak terlalu suka menjadi sorotan banyak orang,\n8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
            break;
            case "MERAH":
                System.out.println("Warna Favoritmu Adalah "+ANSI_RED + pilih);
                System.out.println("1. Periang,\n2. Pemberani,\n3. Berani mengambil resiko dalam setiap masalah,\n4. Menyukai tantangan,\n5. Kurang sabar,\n6. Dapat menahan marah namun jika sudah tahap puncak toleransi amarahnya akan sulit dikontrol,\n7. Memiliki energi kehangatan dan cinta.");
            break;
            case "YELLOW":
                System.out.println("Warna Favoritmu Adalah "+ANSI_YELLOW + pilih);
                System.out.println("1. Optimis,\n2. Suka bergaul,\n3. Periang,\n4. Senang menolong,\n5. Linvah dan aktif,\n6. Tidak suka meremehkan kekurangan orang lain,\n7. Loyal,\n8. Hangat,\n9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,\n10. Cenderung penakut");
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu Adalah "+ANSI_PURPLE+pilih);
                System.out.println("1. Optimis,\n2. Tidak pernah ragu,\n3. Menurut pasangan yang ideal adalah yang memiliki mental yang kuat,\n4. Memiliki ambisi yang besar,\n5. Memiliki empati yang kuat,\n6. Memiliki sisi misterius sebab seringkali menutupi perasaanya,\n7. Terkadang bersikap keras kepala dan angkuh");
            break;
            case "HIJAU":
                System.out.println("Warna Favoritmu Adalah "+ANSI_GREEN + pilih);
                System.out.println("1. Romantis,\n.2 Menyukai hal yang berbau alami dan keindahan,\n3. Tegah pada prinsip,\n4. Menginginkan kesempurnaan\n5. Mudah cemburu,\n7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan");  
            default:
                System.out.println("Ooopps.. Belum teridentifikasi");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(ANSI_RED + "YUK " +ANSI_GREEN+ "CEK " +ANSI_YELLOW+ " KEPRIBADIANMU " +ANSI_CYAN+ "DARI " +ANSI_PURPLE+ "WARNA " +ANSI_BLUE+ "FAVORITMU\n");
        System.out.println(ANSI_WHITE + ANSI_RED_BACKGROUND + "\tMERAH\t\t");
        System.out.println(ANSI_GREEN_BACKGROUND + "\tHIJAU\t\t");
        System.out.println(ANSI_YELLOW_BACKGROUND + "\tKUNING\t\t");
        System.out.println(ANSI_BLUE_BACKGROUND + "\tBIRU\t\t");
        System.out.println(ANSI_PURPLE_BACKGROUND + "\tUNGU\t\t\n");
        
        System.out.print(ANSI_RESET + "PILIH WARNA FAVORITMU: ");
        Scanner scanner= new Scanner(System.in);
        String pilih = scanner.next();
        System.out.print("NAMA KAMU: ");
        String nama = scanner.next();
        kepribadian(pilih, nama);
        
        
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
