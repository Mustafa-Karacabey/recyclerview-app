package com.example.recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     var butunManzara = ArrayList<Manzara>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriKaynaginiDoldur()

        var myAdapter = ManzaraAdapter(butunManzara)//Data Setim Hazır :)
        recyclerView.adapter = myAdapter

        var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager

    }

    fun veriKaynaginiDoldur() : ArrayList<Manzara> { // Bu örnekteki amaç RecyclerView Kullanmak olduğu için buralar statik yaptım
        var tumResimler = arrayOf(R.drawable.manzarabir, R.drawable.manzaraiki)

        var eklenecekManzara = Manzara("manzara1", "manzara1desc", R.drawable.manzarabir)
        var eklenecekManzara2 = Manzara("manzara2", "manzara2desc", R.drawable.manzaraiki)

        butunManzara.add(eklenecekManzara)
        butunManzara.add(eklenecekManzara2)
        return  butunManzara
    }
}