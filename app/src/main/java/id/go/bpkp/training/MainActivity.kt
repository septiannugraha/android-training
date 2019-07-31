package id.go.bpkp.training

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.go.bpkp.training.dummy.DummyContent

class MainActivity : AppCompatActivity(), SuratTugasFragment.OnListFragmentInteractionListener, DetailFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
        println(item)
//        Toast.makeText(this, item.toString(), Toast.LENGTH_LONG).show()
        val newFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        val bundle = Bundle()
        bundle.putString("detail", item?.details)
        newFragment.arguments = bundle
        transaction.replace(R.id.main_layout, newFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newFragment = SuratTugasFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.main_layout, newFragment)
//        transaction.addToBackStack(null)
        transaction.commit()
    }
}
