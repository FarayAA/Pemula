package com.example.subdicoding1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val nama = intent.getStringExtra("nama")
        val dari = intent.getStringExtra("dari")
        val foto = intent.getStringExtra("foto")

        Glide.with(applicationContext)
            .load(foto)
            .apply(RequestOptions().override(55,55))
            .into(
                detail_foto
            )

        detail_foto.setTag(foto)
        txt_nama.setText(nama)
        txt_dari.setText(dari)

        val actionbar = supportActionBar
        actionbar!!.title = "Home"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
