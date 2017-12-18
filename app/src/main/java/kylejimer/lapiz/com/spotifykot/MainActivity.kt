package kylejimer.lapiz.com.spotifykot

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView1)
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val Songs = ArrayList<Music>()

        Songs.add(Music("Titibo-Tibo", "Moria Dela Torre", " • Himig Handog 2017"))
        Songs.add(Music("Havana", "Camilla Cabello", " • Havana"))
        Songs.add(Music("Arms Open", "The Script", " • Human Clay"))
        Songs.add(Music("Look At Me Now", "Charlie Puth", " • Alien Boy"))
        Songs.add(Music("Where My Love Goes", "Lawson", " • Perspective"))
        Songs.add(Music("If You Could See Me Now", "The Script", " • 3"))
        Songs.add(Music("Back To You", "Louis Tomlinson", " • Louis Tomlinson"))
        Songs.add(Music("Sorry Not Sorry", "Demi Lovato", " • Tell Me You Love Me"))
        Songs.add(Music("Too Good At Goodbyes", "Sam Smith", " • The Thrill of It All"))
        Songs.add(Music("Perfect", "Ed Sheeran", " • Divide"))
        Songs.add(Music("What Lovers Do", "Maroon 5 ft. SZA", " • Red Pill Blues"))


        var adapter = AdapterClass(Songs)
        recyclerview.adapter = adapter
    }
}
