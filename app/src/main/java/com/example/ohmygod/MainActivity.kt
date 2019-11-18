package com.example.ohmygod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.ohmygod.pry.Pry
import com.example.ohmygod.record.Item
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    var item :Int = 0
//    val header1 :String = "application/json"
//    val header2 :String = "application/x-www-form-urlencoded"
    lateinit var body :Pry

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
        setContentView(R.layout.activity_main)

        imageView0.setOnClickListener {
            item = 0
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView1.setOnClickListener {
            item = 1
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView2.setOnClickListener {
            item = 2
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView3.setOnClickListener {
            item = 3
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView4.setOnClickListener {
            item = 4
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView5.setOnClickListener {
            item = 5
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView6.setOnClickListener {
            item = 6
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView7.setOnClickListener {
            item = 7
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView8.setOnClickListener {
            item = 8
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView9.setOnClickListener {
            item = 9
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView10.setOnClickListener {
            item = 10
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView11.setOnClickListener {
            item = 11
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView12.setOnClickListener {
            item = 12
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView13.setOnClickListener {
            item = 13
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }
        imageView14.setOnClickListener {
            item = 14
            val inflater = this@MainActivity.layoutInflater
            val view = inflater.inflate(R.layout.alert_layout, null)
            val builder = AlertDialog.Builder(this)
                .setView(view)
                .show()
            val imgView = view.findViewById<ImageView>(R.id.imageItem)
            val textItem = view.findViewById<TextView>(R.id.textItemName)
            val editName = view.findViewById<EditText>(R.id.editName)
            val btnPry = view.findViewById<TextView>(R.id.textPry)
            val btnCancel = view.findViewById<TextView>(R.id.textCancel)
            imgView.setImageResource(photoList[item])
            textItem.text = photoNameList[item]

            btnPry.setOnClickListener {
                if (editName.text.isNullOrEmpty()){
                    Toast.makeText(this@MainActivity, "請輸入名字", Toast.LENGTH_LONG).show()
                }
                else{
                    body = Pry(editName.text.toString(), photoNameList[item])
                    val retrofit = Retrofit.Builder()
                        .baseUrl("http://2722aa20.ngrok.io/api/poseidon/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                    val apiInterface = retrofit.create(APIInterface::class.java)
                    val call = apiInterface.pry(body)

                    call.enqueue(object :retrofit2.Callback<com.example.ohmygod.pry.Response>{
                        override fun onFailure(call: Call<com.example.ohmygod.pry.Response>, t: Throwable) {
                            println(t)
                        }

                        override fun onResponse(call: Call<com.example.ohmygod.pry.Response>, response: Response<com.example.ohmygod.pry.Response>) {
                            if (response.isSuccessful){
                                Toast.makeText(this@MainActivity, "祭拜成功", Toast.LENGTH_LONG).show()
                            }
                            else{
                                print(response)
                            }
                        }
                    })
                    builder.dismiss()
                }
            }



            btnCancel.setOnClickListener {
                builder.dismiss()
            }
        }


        button_record.setOnClickListener {
            val intent = Intent(this@MainActivity, RecordActivity::class.java)
            startActivity(intent)
        }
    }



}
