package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.model.Affirmation
import com.putri.recyclerviewapp.R

// TODO 4: pada class Adapter terdiri dari beberapa variabel, selain itu juga berfungsi sebagai adapter
// terdapat variabel context dengan nilai Context, variabel dataset yang didalamnya memanggil list
//Affirmation pada Datasource.kt
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // TODO 5: class view holder yang digunakan untuk menghubungkan data-data yang ada ke beberapa view
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        // menghubungkan textview ke view berdasarkan pda id nya yaitu "text"
        val textView: TextView = view.findViewById(R.id.text)
    }

    // menghubungkan list yang ada dengan layout untuk ditampilkan sebagai output
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    // perintah tersebut digunakan untuk menempatkan beberapa list per itemnya pada posisinya
    // masing-masing
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    // menghitung banyaknya data dengan method Count()
    override fun getItemCount() = dataset.size
}