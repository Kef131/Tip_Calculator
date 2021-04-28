package org.hyperskill.calculator.tip

import android.opengl.Visibility
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import com.google.android.material.slider.Slider
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_text.doOnTextChanged { text, start, before, count ->
            getTipAmount()
        }
        slider.addOnChangeListener { slider, value, fromUser ->
            getTipAmount()
        }
    }

    private fun getTipAmount(){
        if (edit_text.text != null) if (edit_text.text.isNotEmpty()) {
            val cost = edit_text.text.toString().toDouble()
            text_view.text = "Tip amount: ${String.format("%.2f",(cost * slider.value.toInt())/100)}"
        } else {
            text_view.text = ""
        }
    }
}