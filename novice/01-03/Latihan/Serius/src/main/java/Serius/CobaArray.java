package Serius;

import java.util.Arrays;

public class CobaArray{
    public static void main(String[] Args) {
        //Assignment
        //tipedata[] nama = {komponen, komponen}

        System.out.println("Komponen Array");

        int [] arrayInteger = {1,2,3,4};

        arrayInteger [0] = 11; //mengganti indeks 0 yang tadinya 1 diganti 11

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        //Deklarasi
        //tipe data[] nama = new int [jumlah array]

        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5]; // membuat objek

        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(arrayInteger)); // mencetak dengan construct
        System.out.println(Arrays.toString(arrayFloat));
    }
}