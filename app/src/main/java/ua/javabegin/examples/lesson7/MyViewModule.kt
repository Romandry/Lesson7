package ua.javabegin.examples.lesson7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModule: ViewModel() {

    var editText1 = MutableLiveData<String>()

    fun setEditText(text: String) {
        editText1.value = text
    }
}