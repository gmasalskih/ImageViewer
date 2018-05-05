package com.example.gmasalskikh.imageviewer.view

import android.annotation.SuppressLint
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.gmasalskikh.imageviewer.di.DIContext
import org.koin.android.ext.android.releaseContext

abstract class BaseActivity : AppCompatActivity() {

    abstract val context: DIContext

    fun setFragment(container: Int, fragment: Fragment) {
        if (supportFragmentManager.findFragmentById(container) == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(container, fragment)
                    .commit()
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onPause() {
        releaseContext(context.name)
        super.onPause()
    }

}