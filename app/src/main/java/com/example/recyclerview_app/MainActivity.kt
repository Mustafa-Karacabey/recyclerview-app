package com.example.recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //BURADAKİ ÇALIŞMALAR ÖĞRENME AMAÇLI YAPILMAKTADIR.

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.anamenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id = item.itemId

        when(id) {
            R.id.linearViewVertical -> {
                var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                recyclerView.layoutManager = linearLayoutManager
            }
            /*R.id.linearViewHorizontal -> return Diğer Menu Biçicmleri de burada mevcut bulunmaktadır.
            R.id.straggeredHorizontal -> return
            R.id.straggeredVertical -> return
            R.id.GridView -> return
            */
        }

        return true

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