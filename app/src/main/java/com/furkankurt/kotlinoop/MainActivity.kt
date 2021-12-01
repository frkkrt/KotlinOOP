package com.furkankurt.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser=User("KURT",28)

        myUser.age=24
        myUser.name="Furkan"
        println(myUser.age)
        println(myUser.name)
        println(myUser.information())

        //Encapsulation
        var james=Musician("James","Guitar",55)
        println(james.age.toString())
        println(james.returnBandName("Furkan"))
        println(james.returnBandName("asd"))

        //Inheritance

        var lars=SuperMusician("Lars","Drums",65)
        println(lars.name)
        println(lars.returnBandName("Furkan"))
        lars.sing()

        //polymorphism

        //static polymorphism
        var mathematics=Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorhism

        val animal=Animal()
        animal.sing()

        val barley=Dog()
        barley.test()
        barley.sing()

        //abstract & interface(Soyut sınıf oluşturma)

        //var myPeople=People()

        var myPiano=Piano()
        myPiano.brand="Yamaha"
        myPiano.digital=false
        println(myPiano.roomNmae)
        myPiano.info()

        //Lambda expressions
        fun printString(myString:String)
        {
            println(myString)
        }
        printString("My Test")

        val testString={myString:String ->println(myString)}
        testString("My Lambda String")

        val multiplyLambda={a:Int,b:Int-> a * b}
        println(multiplyLambda(5,4))

        val multiplyLambda2:(Int,Int) ->Int ={a,b->a*b}
        println(multiplyLambda2(5,5))

        //asnychrnous

        //callback function, listener function, completion function

        fun downloadMusicians(url:String,completion:(Musician)->Unit)
        {
            //urlye gidicez download yapılacak.
            //verileri işleyeceğiz.data gelecek
            //sonra completion calışacak.
            val kirkHammet=Musician("Kirk","Guitar",60)
            completion(kirkHammet)
        }
        downloadMusicians("google.com",{musician->
            println(musician.name)
        })



    }
}