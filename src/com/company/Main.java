package com.company;

public class Main {

    public static void main(String[] args) {
        int sukuPertama =3;//ini suku pertama
        int n = 10;//ini banyak suku pada barisan aritmatika
        int beda = 5;//ini beda

        for(int i =1; i <n; i++)//kita taruh n sebagai banyak nya angka yang ditampilkan

        {
            System.out.println(sukuPertama+(i-1) *beda);// lalu masukan rumus Deret aritmatika

        }

    }
}
