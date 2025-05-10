package com.example.milhamabdulhalim

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat

class ItemAdapter(private val context: Context, private val itemList: List<Item>) :
    ArrayAdapter<Item>(context, 0, itemList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.activity_item_adapter, parent, false)
        val item = itemList[position]
        val imageView = view.findViewById<ImageView>(R.id.itemImage)
        val textVieww = view.findViewById<TextView>(R.id.itemName)
        val textView = view.findViewById<TextView>(R.id.itemNamee)

        imageView.setImageDrawable(ContextCompat.getDrawable(context, item.imageResId))
        textVieww.text = item.judul
        textView.text = item.isi

        return view
    }
}
