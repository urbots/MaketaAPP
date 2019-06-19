package urbots.maketaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class UseRenewablePlantActivity : AppCompatActivity() {

    var plant : String = ""
    var factor : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_use_renewable_plant)

        plant = intent.getStringExtra("PlantSelected")
        factor =  if (plant.equals("Solar")) "Sol" else "Vent"

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
