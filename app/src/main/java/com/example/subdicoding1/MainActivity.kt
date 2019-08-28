package com.example.subdicoding1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    private lateinit var rCategory: RecyclerView
    private var list: ArrayList<Kampus> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rCategory = findViewById(R.id.r_category)
        rCategory.setHasFixedSize(true)
        list.addAll(KampusData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rCategory.layoutManager = LinearLayoutManager(this)
        val listNamaKampus = ListNamaKampus(list, this)
        rCategory.adapter = listNamaKampus
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profil, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
//
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profil -> {
                startActivity(Intent(this, profil::class.java))
            }
        }
    }
}
