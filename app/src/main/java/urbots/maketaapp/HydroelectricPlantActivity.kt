package urbots.maketaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HydroelectricPlantActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hydroelectric_plant)

        //Change title of activity
        val actionBar = supportActionBar
        actionBar!!.title = intent.getStringExtra("PlantSelected")
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
