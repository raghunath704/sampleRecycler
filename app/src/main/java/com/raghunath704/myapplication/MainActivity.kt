package com.raghunath704.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<recyclerModel>
    lateinit var image: Array<Int>
    lateinit var title: Array<String>
    lateinit var name: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image= arrayOf(
            R.drawable.flashlight,
            R.drawable.virus,
            R.drawable.coding,
            R.drawable.android,
            R.drawable.flashlight,
            R.drawable.land,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,

        )

        title= arrayOf(
            "Laptop",
            "Corona",
            "Coding",
            "Android",
            "Flashlight",
            "Land",
            "Icon",
            "Laptop",
            "Corona",
            "Coding",
            "Android",
            "Flashlight"


        )
        name= arrayOf(
            "bbbbjrjfbrbfjrbfjebjrjre",
            "fcfevcrvrtvrf",
            "rercerfefce",
            "rcfrecewrdrcfer",
            "ferftg65htbhrh",
            "bbbbjrjfbrbfjrbfjebjrjre",
            "rcfrecewrdrcfer",
            "rercerfefce",
            "rcfrecewrdrcfer",
            "ferftg65htbhrh",
            "bbbbjrjfbrbfjrbfjebjrjre",
            "rcfrecewrdrcfer"


        )

        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arrayList= arrayListOf<recyclerModel>()
        getUserData()

    }

    private fun getUserData() {
        for(i in image.indices){
            val items = recyclerModel(image[i],title[i],name[i])
            arrayList.add(items)

            recyclerView.adapter=myAdapter(arrayList)
        }
    }
}