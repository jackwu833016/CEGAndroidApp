package ca.uottawa.segapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Receipt extends AppCompatActivity {
    public void goToProfile(View view) {

        if (view.getId() == R.id.backbutton) {
            startHomePage();
        }
    }

    public void startHomePage()
    {
        Intent i = new Intent(Receipt.this, HomePage.class);
        startActivity(i);
    }


}
