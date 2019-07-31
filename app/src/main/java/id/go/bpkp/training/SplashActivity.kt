package id.go.bpkp.training

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import id.go.bpkp.training.dummy.DummyContent

class SplashActivity : AppCompatActivity(), SuratTugasFragment.OnListFragmentInteractionListener {
    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed( { startActivity(Intent(this, MainActivity::class.java))
            // close this activity
            finish()
        }, 1500)
    }
}
