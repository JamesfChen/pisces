package com.jamesfchen.app

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView

/**
 * Copyright ® $ 2017
 * All right reserved.
 *
 * @author: jamesfchen
 * @since: Jan/01/2022  Sat
 */
class MainActivity : Activity() {
    @SuppressLint("JavascriptInterface")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val wv = findViewById<WebView>(R.id.wv)
        val h5Plugin = H5Plugin()
        wv.addJavascriptInterface(h5Plugin,h5Plugin.name)
//        wv.evaluateJavascript()
    }
}