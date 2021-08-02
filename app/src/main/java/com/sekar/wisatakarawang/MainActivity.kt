package com.sekar.wisatakarawang

import android.content.Intent
import android.graphics.Bitmap
import android.media.Image
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {
    private lateinit var rvTouristSites: RecyclerView
    private val list: ArrayList<TouristSite> = arrayListOf()
    private var title: String = "Wisata Kab.Karawang"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTouristSites = findViewById(R.id.rv_touristsites)
        rvTouristSites.setHasFixedSize(true)
        setActionBarTitle(title)

        list.addAll(TouristSitesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvTouristSites.layoutManager = LinearLayoutManager(this)
        val listTouristSiteAdapter = ListTouristSiteAdapter(list)
        rvTouristSites.adapter = listTouristSiteAdapter

        listTouristSiteAdapter.setOnItemClickCallback(object : ListTouristSiteAdapter.OnItemClickCallback {
            override fun onItemClicked(data: TouristSite) {
                showSelectedTouristSite(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showSelectedTouristSite(touristSite: TouristSite) {
        val moveWithDataIntent = Intent(this@MainActivity, MoveToDetailPage::class.java)
        moveWithDataIntent.putExtra(MoveToDetailPage.EXTRA_NAME, touristSite.name)
        moveWithDataIntent.putExtra(MoveToDetailPage.EXTRA_IMAGE, touristSite.photo)
        moveWithDataIntent.putExtra(MoveToDetailPage.EXTRA_DETAIL, touristSite.detail)
        moveWithDataIntent.putExtra(MoveToDetailPage.EXTRA_TICKET, touristSite.ticket)
        moveWithDataIntent.putExtra(MoveToDetailPage.EXTRA_ADDRESS, touristSite.address)
        moveWithDataIntent.putExtra(MoveToDetailPage.EXTRA_URL_LOCATION, touristSite.location)
        startActivity(moveWithDataIntent)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.main_page -> {
                title = "Wisata Kab.Karawang"
                showRecyclerList()
            }
            R.id.about_page -> {
                val moveIntent = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(moveIntent)
            }
        }
        setActionBarTitle(title)
    }
}