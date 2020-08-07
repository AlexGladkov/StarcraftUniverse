package com.agladkov.starcraftuniverse.ui.zerg

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.agladkov.starcraftuniverse.R

class ZergAdapter : RecyclerView.Adapter<ZergAdapter.ZergViewHolder>() {

    private val unitData: MutableList<ZergCellModel> = ArrayList()

    fun setData(newData: List<ZergCellModel>) {
        unitData.clear()
        unitData.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZergViewHolder {
        return ZergViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cell_unit, parent, false))
    }

    override fun getItemCount(): Int {
        return unitData.count()
    }

    override fun onBindViewHolder(holder: ZergViewHolder, position: Int) {
        holder.bind(unitData[position])
    }

    class ZergViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val iconView: ImageView = itemView.findViewById(R.id.cellUnitImageView)
        private val nameView: TextView = itemView.findViewById(R.id.cellUnitTitleView)
        private val descriptionView: TextView = itemView.findViewById(R.id.cellUnitDescriptionView)

        fun bind(zerg: ZergCellModel) {
            iconView.setImageDrawable(ContextCompat.getDrawable(itemView.context, zerg.icon))
            nameView.text = zerg.name
            descriptionView.text = zerg.description
        }
    }
}