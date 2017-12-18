package kylejimer.lapiz.com.spotifykot

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Greg on 16/12/2017.
 */
class FragmentClass: Fragment() {
    private val song_p = "parts_list"
    private val album_p = "parts_number"
    private var playlist: List<String>? = null
    private var albums: List<String>? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        if (savedInstanceState != null) {
            playlist = savedInstanceState.getStringArrayList(song_p)
            albums = savedInstanceState.getStringArrayList(album_p)

        }

        val rootView = inflater?.inflate(R.layout.fragment_song, container, false)
        return rootView
    }
}