package com.example.myapplication.addBook

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.ModelBook

class AddBook_MVVM : ViewModel(){
    private val repository = BookRepository()
    private val list = MutableLiveData<List<ModelBook>>()
    init {
        list.value = listOf()
    }
    fun addBook(book: ModelBook){
        repository.addBook(book)
    }
    fun deleteBook(book: ModelBook){
        repository.deleteContact(book)
    }
    fun getAllBook() : MutableLiveData<List<ModelBook>> {
        list.value = repository.getAllBook()
        return list
    }
}