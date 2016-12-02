package ca.uottawa.segapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;


import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
    public void goToProfile(View view) {

        if (view.getId() == R.id.profileButton) {
            startProfile();

        }
    }
    public void goToSearch(View view) {

        if (view.getId() == R.id.searchButton) {
            startSearch();

        }
    }
    public void startProfile() {
        Intent i = new Intent(HomePage.this, Profile.class);
        startActivity(i);
    }
    public void startSearch() {
        Intent i = new Intent(HomePage.this, ReceipeSearch.class);
        startActivity(i);
    }
}
