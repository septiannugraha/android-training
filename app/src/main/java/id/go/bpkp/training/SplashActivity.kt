package id.go.bpkp.training

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed( { startActivity(Intent(this,HomeActivity::class.java))
            // close this activity
            finish()
        }, 3000)
    }
}
