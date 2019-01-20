package com.example.martinchristian.competitionassessment;

import android.hardware.Sensor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sensor s = getSensor ();
        if (!s.hasSystemFeature(Sensor.FEATURE_SENSOR_COMPASS)) {
            //this device does not a Compass, turn off the Compass feature
        }
    }
}
