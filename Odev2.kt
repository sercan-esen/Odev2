package com.sercanesen.kotlindersleri.nesnetabanli1

import kotlin.io.path.createTempDirectory

class Odev2 {

    //Soru 1 :
    //Parametre olarak girilen dereceyi fahrenheit'a dönüştürdükten sonra geri döndüren bir metod yazınız Tf=Tc*1.8+32

    fun soru1(tc: Double): Double {
        val tf = (tc * 1.8) + 32
        return tf
    }

    //Soru 2 :
    //Kenarları parametre olarak girilen dikdörtgenin çevresini hesaplayan bir metod yazınız

    fun soru2(kısaKenar: Int, uzunKenar: Int) {
        val dikdortgenCevre = (2 * kısaKenar) + (2 * uzunKenar)
        println("Parametreleri girilen dikdörtgenin çevresi $dikdortgenCevre")
    }

    //Soru 3
    //Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız

    fun soru3(faktoriyelSayi: Int): Int {
        var i = 1
        var toplamFaktoriyel = 1

        while (i <= faktoriyelSayi) {
            toplamFaktoriyel *= i
            i++
        }
        return toplamFaktoriyel
    }

    //Soru 4
    //Parametre olarak girilen kelime ve harf için harfin kelime içinde kaç adet oldugunu gösteren bir metod yazınız

    fun soru4(kelime: String, harf: Char) {
        val temizlenenKelime = kelime.trim()
        var toplamAyniHarf = 0
        val karakterDizi: CharArray = temizlenenKelime.toCharArray()
        val i = 0

        for (i in i until temizlenenKelime.length) {
            if (harf == karakterDizi[i]) {
                toplamAyniHarf += 1
            }
        }

        println("Girilen Kelimenin içinde girilen harf $toplamAyniHarf kere tekrar etmektedir.")
    }

    //Soru 5
    //Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri döndüren metod yazınız(n-2*180).

    fun soru5(kenarSayisi: Int): Int {
        val icAcilerToplami = (kenarSayisi - 2) * 180
        return icAcilerToplami
    }

    //Soru 6
    //Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri  geri döndüren metodu yazınız.
    //1 günde 8 saat çalışılabilir -çalışma saat ücreti = 10 tl -Mesai saat ücreti=20 tl - 160 saat üzeri mesai sayılır

    fun soru6(gunSayisi: Int): Int {
        var toplamMaas = 0

        if (gunSayisi <= 20) {
            toplamMaas = gunSayisi * 8 * 10
        } else {
            toplamMaas = (20 * 8 * 10) + ((gunSayisi - 20) * 8 * 20)
        }

        return toplamMaas
    }

    //soru 7
    //Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız
    //*50gb-100 TL  *Kota aşımından sonra her 1GB 4 TL

    fun soru7(girilenKotaGb: Int): Int {
        var fatura = 0

        if (girilenKotaGb <= 50) {
            fatura = 100
        } else {
            fatura = 100 + ((girilenKotaGb - 50) * 4)
        }

        return fatura
    }


}