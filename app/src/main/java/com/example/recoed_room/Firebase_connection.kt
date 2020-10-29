package com.example.recoed_room

import android.util.Log
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Firebase_connection{

    var database : FirebaseDatabase? = null
    var myRef : DatabaseReference?=null
    lateinit var id:String
    lateinit var passwd:String
    lateinit var name:String

    constructor(){
        findValue()
    }

    constructor(id:String, passwd:String, name:String){
        findValue()
        this.id = id
        this.passwd = passwd
        this.name = name

    }


    fun singupUser(v:Firebase_connection){//회원가입
        Log.d("TAG", "singupUser: "+id)
        myRef?.child("User")?.setValue(v)
    }
    fun getUser(id:String, pw:String){

    }

    fun findValue(){
        if(database===null)
            database = FirebaseDatabase.getInstance()
        else
            myRef = database!!.getReference()
    }


}