package com.aytimur.cicekbahcesi

class Cicekler{

    /*Bir constructor, sınıftan üretilmiş nesnelerin değişkelerin başlangıç
     değerlerinin belirlemek için kullanılan özel bir metodtur.

     Her sınıfın bir kurucu metoda(constructor) sahip olması gerekir.
     Sınıfın içinde herhangi bir constructor belirtmezsek ,
     derleyici bunu bizim için otomatik yapar.*/

    //Neden constructor metot kullanırız;
    //Nesneye ilk değer ataması yapabilmek için,
    //Nesne kullanıcısını, belli değerleri vermesi konusunda zorlamak için,
    //Nesne oluşurken ekstra işleri kodlamak için kullanırız.

    var constAdi:String?=null
    var constAciklama:String?=null
    var constResim:Int?=null

    constructor(constAdi:String,constAciklama:String,constResim:Int){
        this.constAdi=constAdi
        this.constAciklama=constAciklama
        this.constResim=constResim
    }

}