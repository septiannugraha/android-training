package id.go.bpkp.training

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.go.bpkp.training.dummy.DummyContent

class MainActivity : AppCompatActivity(), SuratTugasFragment.OnListFragmentInteractionListener {
    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val detailFragment = DetailFragment()

        val data = Bundle()
        data.putString("detail", item?.details)

        detailFragment.arguments = data
        fragmentTransaction.replace(R.id.container, detailFragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val fragment = SuratTugasFragment()
        fragmentTransaction.add(R.id.container, fragment)
        fragmentTransaction.commit()

    }
}
