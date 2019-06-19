package urbots.maketaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class UsePlantActivity : AppCompatActivity() {

    var plant : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_use_plant)

        plant = intent.getStringExtra("PlantSelected")

        //Change title of activity
        val actionBar = supportActionBar
        actionBar!!.title = plant
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
