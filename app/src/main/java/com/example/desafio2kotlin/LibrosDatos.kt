package com.example.desafio2kotlin

import android.util.Log

fun imprimir(book:LibrosEscolares){
    println ("Nombre del Libro: ${book.nameBook}, ISBN ${book.isbn}, Año Publicacion ${book.yearPublic}, Editorial ${book.editorial}, Numero de Paginas ${book.pageCant}, Autor del Libro ${book.autor}, Tipo de Libro ${book.tipeBook}")

    }
fun main(){
val bookName1=  LibrosEscolares("harry Potter1", "A0001",1981,"Antartica",250,2590,"Yo",'I')
val bookName2=  LibrosEscolares("harry Potter2", "A0002",1982,"Antartica",250,2590,"Yo",'D')
val bookName3=  LibrosEscolares("harry Potter3", "A0003",1983,"Antartica",250,2590,"Yo",'I')
val bookName4=  LibrosEscolares("harry Potter4", "A0004",1984,"Antartica",250,2590,"Yo",'D')

    imprimir(bookName1)
    imprimir(bookName2)
    imprimir(bookName3)
    imprimir(bookName4)
}

fun LibrosEscolares.precioFormateado():String{
    return "$${this.precio}"

}
