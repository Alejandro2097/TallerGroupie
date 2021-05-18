package com.example.groupie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.groupie.databinding.ActivityMainBinding
import com.xwray.groupie.GroupieAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        println(":(")
        //Se puede manipular el binding
        binding.countriesRecyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = GroupieAdapter()
        adapter.add(StudentItem("Daniel  Cuellar", "315869315"))
        adapter.add(StudentItem("David  Huertas ", " 3016958448"))
        adapter.add(StudentItem("Jason  Pineda ", "3108969552"))
        adapter.add(StudentItem("Miguel Perez " , "354698520"))

        binding.countriesRecyclerView.adapter = adapter
    }
}