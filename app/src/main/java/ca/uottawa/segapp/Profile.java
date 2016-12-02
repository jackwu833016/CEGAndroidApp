package ca.uottawa.segapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Profile extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    //goTo methods
    public void goToHomepage (View view)
    {
        if (view.getId() == R.id.Back)
        {
            startHomepage();
        }
    }

    public void goToProfileEdit (View view)
    {
        if (view.getId() == R.id.button2) {
            startProfileEdit();

        }
    }

    //start methods
    public void startProfileEdit()
    {
        Intent i = new Intent(Profile.this, ProfileEdit.class);
        startActivity(i);
    }

    public void startHomepage()
    {
        Intent i = new Intent(Profile.this, HomePage.class);
        startActivity(i);
    }

    //getting the user input
    public static String getName(Context context)
    {
        SharedPreferences prefs = context.getSharedPreferences("CEGAndroidApp", 0);
        return prefs.getString("editText3", "");
    }

    public static String getUsername(Context context)
    {
        SharedPreferences prefs = context.getSharedPreferences("CEGAndroidApp", 0);
        return prefs.getString("editText4", "");
    }

    public static String getAge(Context context)
    {
        SharedPreferences prefs = context.getSharedPreferences("CEGAndroidApp", 0);
        return prefs.getString("editText5", "");
    }

    public static String getImage(Context context)
    {
        SharedPreferences prefs = context.getSharedPreferences("CEGAndroidApp", 0);
    }
}
