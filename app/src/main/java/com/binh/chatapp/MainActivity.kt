package com.binh.chatapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.binh.chatapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var count = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = UserAdapter(
                listOf(
                    User().apply {
                        id = 0
                        avatar = R.drawable.av_lilly_jane
                        name = "Lilly Jane"
                        time = "Online"
                    },
                    User().apply {
                        id = 1
                        avatar = R.drawable.av_margo_love
                        name = "Margo Love"
                        time = "Online"
                    },
                    User().apply {
                        id = 2
                        avatar = R.drawable.av_candice_fin
                        name = "Candice Fin"
                        time = "10 min ago"
                    },
                    User().apply {
                        id = 3
                        avatar = R.drawable.av_casper_d
                        name = "Casper D"
                        time = "12 min ago"
                    },
                    User().apply {
                        id = 4
                        avatar = R.drawable.av_robert_t
                        name = "Robert T"
                        time = "12 min ago"
                    },
                    User().apply {
                        id = 5
                        avatar = R.drawable.av_joshepen
                        name = "Joshepen"
                        time = "12 min ago"
                    },
                    User().apply {
                        id = 6
                        avatar = R.drawable.av_marco_c
                        name = "Marco C"
                        time = "12 min ago"
                    },
                    User().apply {
                        id = 6
                        avatar = R.drawable.av_david_mic
                        name = "David Mic"
                        time = "12 min ago"
                    }
                )
            )
    }   }
}