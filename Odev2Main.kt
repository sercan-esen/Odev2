package com.sercanesen.kotlindersleri.nesnetabanli1

fun main() {
    val odev2 = Odev2()
    //Cevap 1
    val gelenTf = odev2.soru1(30.0)
    println("Girilen derece : $gelenTf Fahrenheit'tır")
    println("********************************************")

    //Cevap 2
    odev2.soru2(5,10)
    println("********************************************")

    //Cevap 3
    val faktoriyelSonuc = odev2.soru3(6)
    println("Girilen sayinin faktoriyel değeri : $faktoriyelSonuc")
    println("********************************************")

    //Cevap 4
    odev2.soru4("  esen  ",'e')
    println("********************************************")

    //Cevap 5
    val icAcilerSonuc = odev2.soru5(4)
    println("Girilen kenar sayisina göre hesaplanan iç açılar toplami : $icAcilerSonuc")
    println("********************************************")

    //Cevap 6
    val maasHesapla = odev2.soru6(25)
    println("Girilen gün sayısına göre alınacak maaş : $maasHesapla TL ")
    println("********************************************")

    //Cevap 7
    val faturaTutar = odev2.soru7(100)
    println("Girilen kota miktarına göre fatura ücreti : $faturaTutar TL")


}

