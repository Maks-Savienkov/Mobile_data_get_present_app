package edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.adapter.WorldAdapter
import edu.cdu.ua.maksymsavienkov.mobile_data_get_present_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var vm: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vm = ViewModelProvider(this)[MainViewModel::class.java]

        val rv = binding.rvMyList
        rv.layoutManager = LinearLayoutManager(this)
        val adapter = WorldAdapter(vm.myList)
        rv.adapter = adapter

        vm.myList.observe(this){
            adapter.notifyDataSetChanged()
        }
    }
}