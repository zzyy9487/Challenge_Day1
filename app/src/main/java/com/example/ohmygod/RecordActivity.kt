package com.example.ohmygod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ohmygod.record.Item
import com.example.ohmygod.record.RecordAdapter
import kotlinx.android.synthetic.main.activity_record.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RecordActivity : AppCompatActivity() {

    var recorrdList = mutableListOf<Item>()
    val header1 :String = "application/json"
    val header2 :String = "application/x-www-form-urlencoded"

    val photoList = listOf(
        R.drawable.i0,
        R.drawable.i1,
        R.drawable.i2,
        R.drawable.i3,
        R.drawable.i4,
        R.drawable.i5,
        R.drawable.i6,
        R.drawable.i7,
        R.drawable.i8,
        R.drawable.i9,
        R.drawable.i10,
        R.drawable.i11,
        R.drawable.i12,
        R.drawable.i13,
        R.drawable.i14
    )

    val photoNameList = listOf(
        "三叉戟",
        "公牛",
        "天兵天將",
        "水行俠",
        "安菲特里忒",
        "宙斯",
        "美人魚",
        "美杜莎",
        "海豚",
        "海鮮丼飯",
        "涅瑞伊得斯",
        "黑帝斯",
        "瑪莎拉蒂",
        "蓋婭",
        "潛水艇"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val apiInterface = retrofit.create(APIInterface::class.java)
        val call = apiInterface.getItem()

        call.enqueue(object :retrofit2.Callback<MutableList<Item>>{

            override fun onFailure(call: Call<MutableList<Item>>, t: Throwable) {
            }

            override fun onResponse(call: Call<MutableList<Item>>, response: Response<MutableList<Item>>) {
                val list = response.body()
                if (!list.isNullOrEmpty()){
                    for ( i in 0 until list.size){
                        recorrdList.add(i,Item(list[i].name, photoList[photoNameList.indexOf(list[i].item_id)], list[i].item_id, list[i].created_at))
                    }
                    val adapter = RecordAdapter(recorrdList, this@RecordActivity)
                    recyclerView.layoutManager = LinearLayoutManager(this@RecordActivity)
                    recyclerView.adapter = adapter
                    adapter.notifyDataSetChanged()
                }
            }
        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.finish()
    }
}
