package fr.uparis.forgetmenot

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import fr.uparis.forgetmenot.databinding.ActivityWateringBinding

class WateringActivity : AppCompatActivity() {

    private lateinit var binding : ActivityWateringBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWateringBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.test.text = "Watering Activity."

        // TODO: Afficher les plantes à arroser puis proposer de les arroser ou de reporter l'arrosage
    }
}