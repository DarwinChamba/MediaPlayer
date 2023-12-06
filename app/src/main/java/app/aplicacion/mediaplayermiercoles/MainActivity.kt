package app.aplicacion.mediaplayermiercoles

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import app.aplicacion.mediaplayermiercoles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reproductorVideo.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity4::class.java
                )
            )
        }
        binding.tomarFoto.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity2::class.java
                ))
        }

        binding.seleccionarFoto.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity5::class.java
                ))
        }

        binding.codigoQr.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity3::class.java
                ))
        }
    }


}