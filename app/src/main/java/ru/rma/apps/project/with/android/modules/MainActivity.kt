package ru.rma.apps.project.with.android.modules

import ru.rma.apps.project.with.android.modules.module001.AndroidModule001
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidModule001().module001()
    }
}