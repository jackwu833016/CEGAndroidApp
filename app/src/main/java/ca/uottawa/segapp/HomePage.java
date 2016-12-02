package ca.uottawa.segapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void goToHelp(View view) {

        if (view.getId() == R.id.helppButton) {
            startHelpPage();
        }
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




    public void startHelpPage(){
        Intent i = new Intent(HomePage.this, Help.class);
        startActivity(i);
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
