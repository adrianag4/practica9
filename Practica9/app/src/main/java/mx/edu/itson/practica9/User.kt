package mx.edu.itson.practica9

import android.R

data class User(var firstName: String?=null, val lastName:String?=null, var age:String?=null){
    override fun toString()=firstName +"\t"+ lastName +"\t"+age
}
