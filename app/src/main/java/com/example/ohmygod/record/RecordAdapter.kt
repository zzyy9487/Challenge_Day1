package com.example.ohmygod.record

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ohmygod.R
import kotlinx.android.synthetic.main.cell_record.view.*

class RecordAdapter(var list:List<Item>, val context: Context):RecyclerView.Adapter<RecordAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.cell_record, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindViewHolder(list[position])
    }

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun bindViewHolder(list: Item){
            val name = itemView.textPeople
            val img = itemView.imageItem
            val itemName = itemView.textItem
            val time = itemView.textTime

            name.text = list.name
            img.setImageResource(list.item_id2)
            itemName.text = list.item_id
            time.text = list.created_at

        }
    }
}
