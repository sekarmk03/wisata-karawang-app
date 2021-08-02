package com.sekar.wisatakarawang

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MoveToDetailPage : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_TICKET = "extra_ticket"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_URL_LOCATION = "extra_url_location"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_detail_page)

        val tvDataName: TextView = findViewById(R.id.tv_sites_name)
        val imgDataImage: ImageView = findViewById(R.id.sites_photo)
        val tvDataDetail: TextView = findViewById(R.id.tv_detail_sites)
        val tvDataTicket: TextView = findViewById(R.id.tv_ticket_value)
        val tvDataAddress: TextView = findViewById(R.id.tv_address_value)

        val name = intent.getStringExtra(EXTRA_NAME)
        val photo = intent.getIntExtra(EXTRA_IMAGE, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val ticket = intent.getStringExtra(EXTRA_TICKET)
        val address = intent.getStringExtra(EXTRA_ADDRESS)
        val location = intent.getStringExtra(EXTRA_URL_LOCATION)

        tvDataName.text = name.toString()
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(imgDataImage)
        tvDataDetail.text = detail.toString()
        tvDataTicket.text = ticket.toString()
        tvDataAddress.text = address.toString()

        val btnShareLocation: Button = findViewById(R.id.btn_share_location)
        btnShareLocation.setOnClickListener{
            val url: String = location.toString()
            val share = Intent()
            share.action = Intent.ACTION_SEND
            share.putExtra(Intent.EXTRA_TEXT, url)
            share.type = "text/plain"
            startActivity(Intent.createChooser(share, "Share Location!"))
        }
    }
}