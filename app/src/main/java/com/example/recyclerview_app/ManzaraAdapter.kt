package com.example.recyclerview_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tek_satir_manzara.view.*
import java.util.zip.Inflater

//Noktalı gelmesinin sebebi ilgili classta inner class olmalarıdır

class ManzaraAdapter(tumManzara: ArrayList<Manzara>) : RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {

    var tumManzara = tumManzara


    override fun getItemCount(): Int {
        //   Listede yerleştirelecek öğelrin sayısına bakıyor ona göre yerleşim yapıyor.Buna göre RecyclerView Hazırlanacak
        return tumManzara.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManzaraViewHolder {
    //ilgili eklenecek view ayarlanacak
        var myInflater = LayoutInflater.from(parent.context)

        var view = myInflater.inflate(R.layout.tek_satir_manzara, parent, false)

        return ManzaraViewHolder(view)

        //ViewHolderların oluşturulma işini burada yapacağız.Iflaterlerin oluşturma işlemini

    }

    override fun onBindViewHolder(holder: ManzaraViewHolder, position: Int) {
        //Positiona göre verileri Atayacağız
        holder.manzaraBaslik.text = tumManzara.get(position).baslik
        holder.manzaraAciklama.text = tumManzara.get(position).aciklama
        holder.manzaraResim.setImageResource(tumManzara.get(position).resim)

    }


    class ManzaraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    //Layout içindeki elemanlara eriştiğim kısım burası oalcak Hocam nelere ne atıyacağız burada belli oluyor her şe y:=
        var tekSatirManzara = itemView as CardView

        var manzaraResim = tekSatirManzara.image_avatar
        var manzaraBaslik = tekSatirManzara.header
        var manzaraAciklama = tekSatirManzara.description


    }



}




/*
1- getItemCount
2- onCreateViewHolder
3- ManzaraViewHolder
4-OnBindViewHolder

-GetItemCount Sürekli Tetiklenir.Sürekli eleman sayısını kontrol eder ona göre listeyi güncelleyecek vs



**/