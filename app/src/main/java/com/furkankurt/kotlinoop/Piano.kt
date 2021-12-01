package com.furkankurt.kotlinoop

class Piano:HouseDecor,Instrument{

    var brand:String?=null
    var digital:Boolean?=null

    override var roomNmae: String

        get() = "Kitchen"
        set(value) {}



}