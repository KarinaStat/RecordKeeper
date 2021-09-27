package com.karinastatinaite.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.karinastatinaite.recordkeeper.databinding.ActivityEditCyclingRecordBinding
import com.karinastatinaite.recordkeeper.databinding.FragmentCyclingBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val event = intent.getStringExtra("Event")
        title = "$event"
    }
}