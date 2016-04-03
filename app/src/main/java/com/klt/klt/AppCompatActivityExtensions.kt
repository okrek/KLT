package com.klt.klt

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by frankie on 03.04.2016.
 */

fun AppCompatActivity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}