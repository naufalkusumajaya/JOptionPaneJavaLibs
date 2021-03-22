package com.company;
import javax.swing.*;
public class JavaLibs5026201121 {
    public static void main(String[] args) {
        String questionOne;
        String name;
        int age;
        double questionFour;
        int questionFive;
        String questionSix;
        int questionSeven;
        int questionEight;
        int questionNine;
        int questionTen;


        questionOne = JOptionPane.showInputDialog("Selamat Datang di Quiz Matematika Online. Apakah anda sudah siap?");
        System.out.println(questionOne);
        name = JOptionPane.showInputDialog("Masukan nama anda.");
        System.out.println("Nama peserta = "+name);
        age = Integer.parseInt(JOptionPane.showInputDialog("Halo "+ name + " Masukkan umur anda"));
        System.out.println("Umur peserta = "+ age);
        age = age - 5;
        System.out.println("Perkiraan  peserta sudah mengikuti pendidikan formal= "+ age);
        questionFour = Double.parseDouble(JOptionPane.showInputDialog("Jika Andin memiliki 9 potong kue dan ingin membagikan kuenya ke 10 temannya, berapa bagian yang didapatkan oleh masing-masing temannya?"));
        questionFour = questionFour - 10.1;
        questionFour = questionFour + 10.1;
        System.out.println(questionFour);
        questionFive = Integer.parseInt(JOptionPane.showInputDialog("Berapa banyak angka 9 muncul dari angka 1-100?"));
        System.out.println("angka 9 muncul dari angka 1-100 sebanyak "+questionFive);
        questionSix = JOptionPane.showInputDialog("Siapakah presiden ke-(10-2) di Indonesia?");
        System.out.println("presiden ke-8 di Indonesia adalah "+questionSix);
        questionSeven = Integer.parseInt(JOptionPane.showInputDialog("Berapakah angka favoritmu?"));
        System.out.println("angka favorit saya adalah "+questionSeven);
        questionEight = Integer.parseInt(JOptionPane.showInputDialog("Berapakah angka yang muncul sebelum angka 1?"));
        System.out.println("angka yang muncul sebelum angka 1 adalah "+questionEight);
        questionNine = Integer.parseInt(JOptionPane.showInputDialog("Dalam urutan berapakah Naruto menjadi Hokage?"));
        System.out.println("Naruto menjadi Hokage dalam urutan ke "+questionNine);
        questionTen = Integer.parseInt(JOptionPane.showInputDialog("Sekarang tahun berapa?"));
        questionTen = questionTen - 1945;
        System.out.println("Secara konstitusi, Indonesia sudah merdeka selama "+questionTen +" tahun lamannya");
    }
}
