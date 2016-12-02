package ca.uottawa.segapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ReceipeSearch extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipe_search);

    }

    public void goToHomepage(View view) {

        if (view.getId() == R.id.backToHomeButton) {
//            System.out.println("hellp im here");
            openMainPage();

        }
    }

    public void openMainPage() {
//        Toast.makeText(ReceipeSearch.this, "Log Out successful!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(ReceipeSearch.this, HomePage.class);
        startActivity(i);
    }
}
