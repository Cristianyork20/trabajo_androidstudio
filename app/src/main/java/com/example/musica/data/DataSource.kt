package com.example.musica.data

import com.example.musica.model.Album

class DataSource {
    fun getAlbmes(): MutableList<Album>{
        var  albumes:MutableList<Album> = mutableListOf()
        albumes.add(Album("Cristian","2003","https://hips.hearstapps.com/hmg-prod/images/jujutsu-kaisen-itadori-64649743a0f9d.jpg?crop=0.563xw:1.00xh;0.311xw,0&resize=1200:*"))

       /* albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))*/
        return albumes
    }
}