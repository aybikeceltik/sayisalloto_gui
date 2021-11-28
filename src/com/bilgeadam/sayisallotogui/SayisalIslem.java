package com.bilgeadam.sayisallotogui;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SayisalIslem {
    private static final int MAX_SAYI=49;
    private static final  int KAC_SAYI=6;

    public int rastgeleSayiGetir()
    {
        Random rnd = new Random();
        int sayi = rnd.nextInt(MAX_SAYI)+1;

        return sayi;
    }

    public boolean arraydeVarmi(int[] sayilar, int sayi)
    {
        //Aramak için binarySearch kullanılır.
        //onun içinde once sort edilmiş olması

        Arrays.sort(sayilar);
        int sonuc = Arrays.binarySearch(sayilar,sayi);
        if (sonuc >= 0)
            return true;
        else
            return false;
    }

    public int [] arrayDoldur() {



        int[] sayilar = new int[KAC_SAYI];

        int rastgeleSayi = 0;

        for (int i = 0; i < sayilar.length; i++) {

            rastgeleSayi = rastgeleSayiGetir();

            boolean sonuc = arraydeVarmi(sayilar,rastgeleSayi);
            while (sonuc==true)
            {
                rastgeleSayi = rastgeleSayiGetir();
                sonuc = arraydeVarmi(sayilar,rastgeleSayi);
            }
            sayilar[0] = rastgeleSayi;
        }
        //Son sayıyı sıralamak için koyduk
        //6.sayıyı sıralamak için

        Arrays.sort(sayilar);
        return sayilar;
    }
}
