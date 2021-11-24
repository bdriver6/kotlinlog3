package jp.techacademy.hiromi.kakoo.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.hiromi.kakoo.kotlinlog3.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("たけし",15,"野球")
        human.say()
        human.think()

    }


}