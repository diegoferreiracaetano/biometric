package com.diegoferreiracaetano.biometric.ui.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegoferreiracaetano.biometric.R
import kotlinx.android.synthetic.main.activity_welcome_activty.userName

class WelcomeActivty : AppCompatActivity() {

    companion object {
        private const val USER = "USER"
    }

    operator fun invoke(context: Context, user: String) {
        val intent = Intent(context, WelcomeActivty::class.java)
        intent.putExtra(USER, user)
        context.startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_activty)

        intent.getStringExtra(USER)?.let {
            userName.text = it
        }
    }
}
