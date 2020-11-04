package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import android.os.Handler

class MainActivity : AppCompatActivity() {

        private val TAG = javaClass.name
        private val db = FirebaseFirestore.getInstance()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        }

    
    }


//Build Folder Re-Delete Fixer
class PCBuild(buildName: String){
    var name = buildName
    var cpu = null
    var mobo = null
    var ram = null
    var gpu = null
    var case = null
    var psu = null
    var finished: Boolean = false
    var compatible: Boolean = true

}