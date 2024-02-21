package com.example.myapplication.addBook

import com.example.myapplication.model.ModelBook

class BookRepository {
    val list = mutableListOf<ModelBook>()
    fun addBook(modelBook: ModelBook){
        list.add(modelBook)
    }
    fun deleteContact(modelBook: ModelBook){
        list.remove(modelBook)
    }
    fun getAllBook() : List<ModelBook>{
        return list
    }
}