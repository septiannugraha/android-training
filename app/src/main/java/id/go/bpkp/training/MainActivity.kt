package id.go.bpkp.training

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.go.bpkp.training.dummy.DummyContent

class MainActivity : AppCompatActivity(), SuratTugasFragment.OnListFragmentInteractionListener {
    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
