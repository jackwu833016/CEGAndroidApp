package ca.uottawa.segapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class HomePage extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_home_page);

        // Locate the button in activity_main.xml
        button1 = (Button) findViewById(R.id.searchButton);
        button2 = (Button) findViewById(R.id.profileButton);

        // Capture button clicks
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this, ReceipeSearch.class);
                startActivity(myIntent);
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this, Profile.class);
                startActivity(myIntent);
            }
        });
    }
}
