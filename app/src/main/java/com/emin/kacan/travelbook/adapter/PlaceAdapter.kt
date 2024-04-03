package com.emin.kacan.travelbook.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.emin.kacan.travelbook.databinding.CardTasarimBinding
import com.emin.kacan.travelbook.model.Place
import com.emin.kacan.travelbook.view.MapsActivity

class PlaceAdapter(var mContext : Context , var placeList : List<Place>) :RecyclerView.Adapter<PlaceAdapter.cardTasarimTutucu>() {

    inner class cardTasarimTutucu(var binding: CardTasarimBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardTasarimTutucu {
        val binding =CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return cardTasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

    override fun onBindViewHolder(holder: cardTasarimTutucu, position: Int) {
        val place = placeList.get(position)
        val p =holder.binding

        p.rvTextView.text = place.name
        p.cardView.setOnClickListener {
            val intent = Intent(p.cardView.context,MapsActivity::class.java)
            intent.putExtra("selectedPlace",place)
            intent.putExtra("info","old")
            p.cardView.context.startActivity(intent)
        }
    }
}