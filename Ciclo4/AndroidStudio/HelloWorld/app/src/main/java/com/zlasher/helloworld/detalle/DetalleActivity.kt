package com.zlasher.helloworld.detalle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import com.zlasher.helloworld.databinding.ActivityDetalleBinding
import com.zlasher.helloworld.model.SuperheroeItem

class DetalleActivity : AppCompatActivity() {

    private lateinit var detalleBinding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detalleBinding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(detalleBinding.root)

        val superheroe: SuperheroeItem =
            intent.extras?.getSerializable("superheroe") as SuperheroeItem
        with(detalleBinding) {
            nameTextView.text = superheroe.name
            aliasTextView.text = superheroe.alias
            cityTextView.text = superheroe.city
            occupationTextView.text = superheroe.occupation
            facebookTextView.text = superheroe.facebook
            powersTextView.text = superheroe.powers
            Picasso.get().load(superheroe.urlPicture).into(pictureImageView)
        }
    }
}