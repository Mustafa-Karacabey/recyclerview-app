package com.example.recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

     var butunManzara = ArrayList<Manzara>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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