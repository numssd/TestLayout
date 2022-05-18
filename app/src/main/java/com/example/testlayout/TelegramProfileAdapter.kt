package com.example.testlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

interface SettingActionListener {
    fun onSettingDetails()
}

class TelegramProfileAdapter(
    private val actionListener: SettingActionListener,
    private var settings: List<SettingModel>
) : RecyclerView.Adapter<TelegramProfileAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(setting: SettingModel) {
            val itemTitle: TextView = itemView.findViewById(R.id.textViewSetting)
            itemTitle.text = setting.title
            itemTitle.setCompoundDrawablesWithIntrinsicBounds(
                setting.image,
                0,
                0,
                0
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(
            R.layout.setting_item, parent, false
        )
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return settings.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(settings[position])
        holder.itemView.setOnClickListener {
            actionListener.onSettingDetails()
        }
    }
}