package com.loidtayag.appsforeverydayuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.main_recycler)

        recyclerView.adapter = MainAdapterRecycler(initApps())
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun initApps(): ArrayList<MainModelRecycler> {
        val apps = arrayListOf<MainModelRecycler>()

        val names = resources.getStringArray(R.array.apps_list)
        val images = arrayOf(R.drawable.ic_baseline_calculate_24,
            R.drawable.ic_baseline_exposure_neg_1_24, R.drawable.ic_baseline_exposure_neg_1_24)
        for (i in names.indices) {
            apps.add(MainModelRecycler(names[i], images[i]))
        }

        return apps
    }
}