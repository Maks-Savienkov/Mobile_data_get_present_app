package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.R
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.model.World

class WorldAdapter(
    private val worlds: List<World>
) : RecyclerView.Adapter<WorldAdapter.WorldHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorldHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.world_item, parent, false)
        return WorldHolder(itemView)
    }

    override fun getItemCount() = worlds.size

    override fun onBindViewHolder(holder: WorldHolder, position: Int) {
        holder.name.text = worlds[position].name
        holder.xLength.text = worlds[position].xLength.toString()
        holder.yLength.text = worlds[position].yLength.toString()
        holder.playerSpawnRoomId.text = worlds[position].playerSpawnRoomId.toString()
        holder.version.text = worlds[position].version
    }

    class WorldHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tvWorldName)
        val xLength: TextView = itemView.findViewById(R.id.tvXLength)
        val yLength: TextView = itemView.findViewById(R.id.tvYLength)
        val playerSpawnRoomId: TextView = itemView.findViewById(R.id.tvPlayerSpawnRoomId)
        val version: TextView = itemView.findViewById(R.id.tvVersion)
    }
}