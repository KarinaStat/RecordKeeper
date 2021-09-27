package com.karinastatinaite.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.karinastatinaite.recordkeeper.databinding.ActivityEditRunningRecordsBinding

class ActivityEditRunningRecords : AppCompatActivity() {
    private lateinit var binding: ActivityEditRunningRecordsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditRunningRecordsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val distance = intent.getStringExtra("Distance")
        title = "$distance Record"
    }
}