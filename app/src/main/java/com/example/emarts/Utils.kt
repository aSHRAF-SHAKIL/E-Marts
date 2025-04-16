package com.example.emarts

import android.widget.EditText

fun EditText.isEmpty():Boolean{
    return if (this.text.toString().isEmpty()){
        this.error = "This place Need to be Fill Up"
        true
    }
    else{
        false
    }
}