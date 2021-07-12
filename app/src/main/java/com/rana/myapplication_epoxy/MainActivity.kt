package com.rana.myapplication_epoxy


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val entryController = EntryController()
    private var entries = mutableListOf<Entry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_activity_raffle_rv.setController(entryController)

        main_activity_ok_btn.setOnClickListener {
            val input = main_activity_input_names.text.toString()
            if (input.isNotBlank()) {
                entries.add(Entry(entries.size.toString(), input))
                entryController.setData(entries)
                main_activity_input_names.text.clear()
            }
        }
    }


}