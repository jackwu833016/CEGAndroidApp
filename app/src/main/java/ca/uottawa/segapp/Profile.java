package ca.uottawa.segapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        ImageView images = (ImageView) findViewById(R.id.images); //FIX THIS ahhhhhh
        //Figuring out the correct image
        String drawableName = "profile1";
        switch (data.getIntExtra("imageID",R.id.profile1)) {
            case R.id.profile1:
                drawableName = "profile1";
                break;
            case R.id.profile2:
                drawableName = "profile2";
                break;
            case R.id.profile3:
                drawableName = "profile3";
                break;
            case R.id.profile4:
                drawableName = "profile4";
                break;
            case R.id.profile5:
                drawableName = "profile5";
                break;
            default:
                drawableName = "profile1";
                break;
        }
        int resID = getResources().getIdentifier(drawableName, drawable,
                getPackageName());
        images.setImageResource(resID);
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
}