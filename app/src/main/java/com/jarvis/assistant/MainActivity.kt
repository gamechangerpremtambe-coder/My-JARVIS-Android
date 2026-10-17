
package com.jarvis.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 48, 32, 32)
            setBackgroundColor(Color.rgb(10, 16, 32))
        }

        val title = TextView(this).apply {
            text = "J.A.R.V.I.S"
            textSize = 32f
            setTextColor(Color.CYAN)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "नमस्कार! मी तुझा JARVIS आहे.\nHello, how can I help?"
            textSize = 20f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(0, 32, 0, 32)
        }

        layout.addView(
            title,
            LinearLayout.LayoutParams(-1, -2)
        )

        layout.addView(
            subtitle,
            LinearLayout.LayoutParams(-1, -2)
        )

        setContentView(layout)
    }
}
