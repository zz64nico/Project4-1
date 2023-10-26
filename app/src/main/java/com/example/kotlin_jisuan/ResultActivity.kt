package com.example.kotlin_jisuan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlin_jisuan.databinding.ActivityResultBinding

class ResultActivity:AppCompatActivity() {
    var binding:ActivityResultBinding? =null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  =DataBindingUtil.setContentView(this,R.layout.activity_result);
        var right = intent.getIntExtra("right",0)
        var currentNum = intent.getIntExtra("currentNum",0)
        binding?.tvResult?.text = "your score: ${right} out ${currentNum}"
        binding?.btnAgain?.setOnClickListener {
            finish()
        }
    }
}