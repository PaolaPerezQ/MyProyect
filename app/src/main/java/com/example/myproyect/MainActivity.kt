package com.example.myproyect


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIr = findViewById<Button>(R.id.btnIr)
        btnIr.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
/*
            // Declaring and initializing the ImageView
            val imageView = findViewById<ImageView>(R.id.imageView)

            // Declaring executor to parse the URL
            val executor = Executors.newSingleThreadExecutor()

            // Once the executor parses the URL
            // and receives the image, handler will load it
            // in the ImageView
            val handler = Handler(Looper.getMainLooper())

            // Initializing the image
            var image: Bitmap? = null

            // Only for Background process (can take time depending on the Internet speed)
            executor.execute {

                // Image URL
                val imageURL = "https://empresas.blogthinkbig.com/como-obtener-imagenes-para-textos/"

                // Tries to get the image and post it in the ImageView
                // with the help of Handler
                try {
                    val `in` = java.net.URL(imageURL).openStream()
                    image = BitmapFactory.decodeStream(`in`)

                    // Only for making changes in UI
                    handler.post {
                        imageView.setImageBitmap(image)
                    }
                }

                // If the URL doesnot point to
                // image or any other kind of failure
                catch (e: Exception) {
                    e.printStackTrace()
                }
            }
*/

        }

    }
}
