package app.aplicacion.mediaplayermiercoles

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.aplicacion.mediaplayermiercoles.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding:ActivityMain5Binding
    companion object{
        val REQUEST_CODE_SELECCIONAR_IMAGEN=101
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.seleccionarImagen.setOnClickListener { abrirGaleria() }
    }
    private fun abrirGaleria() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent, MainActivity5.REQUEST_CODE_SELECCIONAR_IMAGEN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == REQUEST_CODE_SELECCIONAR_IMAGEN) {
                val imageUri = data?.data
                binding.imageView.setImageURI(imageUri)
            }
        }
    }


}