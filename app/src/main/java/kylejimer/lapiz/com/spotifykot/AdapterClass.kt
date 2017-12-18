package kylejimer.lapiz.com.spotifykot

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by Greg on 16/12/2017.
 */
class AdapterClass(val Playlist: ArrayList<Music>) : RecyclerView.Adapter<AdapterClass.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.song?.text = Playlist[position].Title
        holder?.singer?.text = Playlist[position].Artist
        holder?.album?.text = Playlist[position].Album
        holder?.linearLayout?.setOnClickListener {

            holder.song.setTextColor(Color.parseColor("#1DB853"))


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.song_list_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Playlist.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val fragmentSong = itemView.findViewById<TextView>(R.id.ftitle)
        val fragmentSinger = itemView.findViewById<TextView>(R.id.txtfragment_album)
        val song = itemView.findViewById<TextView>(R.id.title)
        val singer = itemView.findViewById<TextView>(R.id.artist)
        val album = itemView.findViewById<TextView>(R.id.Album)
        val linearLayout = itemView.findViewById<RelativeLayout>(R.id.linear1)


    }


}