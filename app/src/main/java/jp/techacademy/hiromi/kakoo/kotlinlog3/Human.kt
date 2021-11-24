package jp.techacademy.hiromi.kakoo.kotlinlog

import android.util.Log

class Human:Animal,Thinkable {

    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int,hobby: String): super(name, age ,hobby) {
        this.hobby = hobby
    }

    // メソッド
    override fun say() {
        Log.d("kotlintest", "私の名前は"+this.name + "です。　年は" + this.age + "歳です。")
    }
    override fun think() {
        Log.d("kotlintest", "私は"+this.hobby + "について考える")
    }

}