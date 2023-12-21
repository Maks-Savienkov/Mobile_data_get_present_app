package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.R
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model.World

class WorldAdapter(
    private val worlds: LiveData<List<World>>,
) : RecyclerView.Adapter<WorldAdapter.WorldHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorldHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.world_item, parent, false)
        return WorldHolder(itemView)
    }

    override fun getItemCount() = worlds.value!!.size

    override fun onBindViewHolder(holder: WorldHolder, position: Int) {
        holder.name.text = worlds.value?.get(position)?.name ?: ""
        holder.xLength.text = worlds.value?.get(position)?.xLength.toString()
        holder.yLength.text = worlds.value?.get(position)?.yLength.toString()
        holder.playerSpawnRoomId.text = worlds.value?.get(position)?.playerSpawnRoomId.toString()
        holder.version.text = worlds.value?.get(position)?.version ?: ""
    }

    class WorldHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tvWorldName)
        val xLength: TextView = itemView.findViewById(R.id.tvXLength)
        val yLength: TextView = itemView.findViewById(R.id.tvYLength)
        val playerSpawnRoomId: TextView = itemView.findViewById(R.id.tvPlayerSpawnRoomId)
        val version: TextView = itemView.findViewById(R.id.tvVersion)
    }
}