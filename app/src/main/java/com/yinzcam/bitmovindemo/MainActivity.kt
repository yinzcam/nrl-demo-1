package com.yinzcam.bitmovindemo

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bitmovin.player.config.PlayerConfiguration
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Create config by hand
        val config =
            PlayerConfiguration.fromJSON("{" +
                    "\"key\": \"<LICENSE_KEY>\"" +
                    "}")
        val player = bitmovinPlayerView.player
        player?.setup(config)
        bitmovinPlayerView.visibility = View.GONE
    }
}
