package com.example.ataberkresatozekhw1.hw2

fun main() {
    println("1: ${soru1(10.0)}")
    println("2: ${soru2(5, 10)}")
    println("3: ${soru3(5)}")
    println("4: ${soru4("Afyonkarahisarlılaştıramadıklarımızdanmısınız")}")
    println("5: ${soru5(5)}")
    println("6: ${soru6(5)}")
    println("7: ${soru7(5)}")
}

fun soru1(kilometre:Double) : Double {

    return kilometre* 0.621
}

fun soru2(en:Int, boy:Int) :Int {
    return en*boy
}

fun soru3(faktoriel:Int) :Int {
    var sonuc = 1
    for (i in 1..faktoriel) {
        sonuc *= i
    }
    return sonuc
}

fun soru4(kelime:String) :Int {
    var sonuc = 0
    for (i in kelime) {
        if (i=='e')
            sonuc++
    }
    return sonuc
}

fun soru5(kenar:Int) :Int {
    return ((kenar-2)*180)/kenar
}

fun soru6(gun:Int) :Int {
    var maas = 0
    if (gun * 8 <= 150) {
        maas = gun * 8 * 40
    } else {
        maas = 150 * 40 + (gun * 8 - 150) * 80
    }
    return maas
}

fun soru7(saat:Int) :Int {
    var ucret = 0
    if (saat <= 1) {
        ucret = 50
    } else {
        ucret = 50 + (saat - 1) * 10
    }
    return ucret
}