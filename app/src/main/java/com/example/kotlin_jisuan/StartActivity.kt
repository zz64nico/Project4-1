package com.example.kotlin_jisuan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlin_jisuan.databinding.ActiivtyStartBinding
import java.util.*

class StartActivity:AppCompatActivity() {

    var binding : ActiivtyStartBinding? = null;
    var way:String? = null;
    var currentNum :Int = 1;
    var ti = 1;
    var right:Int = 0;
    var one:Int = 0;
    var two:Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.actiivty_start)
        way = intent.getStringExtra("way")
        currentNum = intent.getIntExtra("currentNum",10)
        binding?.tvType?.text = way
        one = getRanDom();
        two = getRanDom();
        binding?.tvOne?.text = one.toString()
        binding?.tvTwo?.text = two.toString()
        binding?.tvDone?.setOnClickListener {
            compute()
        }
        ti = 1
    }

    fun compute(){
        ++ti;
        val result = binding?.etInput?.text.toString();
       if ("+".equals(way)){
           var compute = one +two;
           if (compute.toString().equals(result)){
               ++right;
               binding?.tvRight?.text = "Right:"+right;
               one = getRanDom();
               two = getRanDom();
               binding?.tvOne?.text = one.toString()
               binding?.tvTwo?.text = two.toString()
               binding?.etInput?.setText("")
               if (ti>=currentNum){
                   val intent = Intent()
                   intent.putExtra("right",right)
                   intent.putExtra("currentNum",currentNum)
                   setResult(RESULT_OK,intent)
                   finish()
                   return
               }
           }else{
               one = getRanDom();
               two = getRanDom();
               binding?.tvRight?.text = "Right:"+right;
               binding?.tvOne?.text = one.toString()
               binding?.tvTwo?.text = two.toString()
               binding?.etInput?.setText("")
               if (ti>=currentNum){
                   val intent = Intent()
                   intent.putExtra("right",right)
                   intent.putExtra("currentNum",currentNum)
                   setResult(RESULT_OK,intent)
                   finish()
                   return
               }
           }
           return
       }
        if ("-".equals(way)){
            var compute = one - two;
            if (compute.toString().equals(result)){
                ++right;
                one = getRanDom();
                two = getRanDom();
                binding?.tvRight?.text = "Right:"+right;
                binding?.tvOne?.text = one.toString()
                binding?.tvTwo?.text = two.toString()
                binding?.etInput?.setText("")
                if (ti>=currentNum){
                    val intent = Intent()
                    intent.putExtra("right",right)
                    intent.putExtra("currentNum",currentNum)
                    setResult(RESULT_OK,intent)
                    finish()
                    return
                }
            }else{
                one = getRanDom();
                two = getRanDom();
                binding?.tvRight?.text = "Right:"+right;
                binding?.tvOne?.text = one.toString()
                binding?.tvTwo?.text = two.toString()
                binding?.etInput?.setText("")
                if (ti>=currentNum){
                    val intent = Intent()
                    intent.putExtra("right",right)
                    intent.putExtra("currentNum",currentNum)
                    setResult(RESULT_OK,intent)
                    finish()
                    return
                }
            }
            return
        }
        if ("*".equals(way)){
            var compute = one * two;
            if (compute.toString().equals(result)){
                ++right;
                one = getRanDom();
                two = getRanDom();
                binding?.tvRight?.text = "Right:"+right;
                binding?.tvOne?.text = one.toString()
                binding?.tvTwo?.text = two.toString()
                binding?.etInput?.setText("")
                if (ti>=currentNum){
                    val intent = Intent()
                    intent.putExtra("right",right)
                    intent.putExtra("currentNum",currentNum)
                    setResult(RESULT_OK,intent)
                    finish()
                    return
                }
            }else{
                one = getRanDom();
                two = getRanDom();
                binding?.tvRight?.text = "Right:"+right;
                binding?.tvOne?.text = one.toString()
                binding?.tvTwo?.text = two.toString()
                binding?.etInput?.setText("")
                if (ti>=currentNum){
                    val intent = Intent()
                    intent.putExtra("right",right)
                    intent.putExtra("currentNum",currentNum)
                    setResult(RESULT_OK,intent)
                    finish()
                    return
                }
            }
            return
        }
        if ("/".equals(way)){
            var compute = one /two;
            if (compute.toString().indexOf(result)!= -1){
                ++right;
                one = getRanDom();
                two = getRanDom();
                binding?.tvRight?.text = "Right:"+right;
                binding?.tvOne?.text = one.toString()
                binding?.tvTwo?.text = two.toString()
                binding?.etInput?.setText("")
                if (ti>=currentNum){
                    val intent = Intent()
                    intent.putExtra("right",right)
                    intent.putExtra("currentNum",currentNum)
                    setResult(RESULT_OK,intent)
                    finish()
                    return
                }
            }else{
                one = getRanDom();
                two = getRanDom();
                binding?.tvRight?.text = "Right:"+right;
                binding?.tvOne?.text = one.toString()
                binding?.tvTwo?.text = two.toString()
                binding?.etInput?.setText("")
                if (ti>=currentNum){
                    val intent = Intent()
                    intent.putExtra("right",right)
                    intent.putExtra("currentNum",currentNum)
                    setResult(RESULT_OK,intent)
                    finish()
                    return
                }
            }
            return
        }
    }

    fun getRanDom():Int{
        val ran = Random()
        val ranNum: Int = ran.nextInt(50) //[0,50)
        return ranNum;
    }
}