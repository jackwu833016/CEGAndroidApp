package ca.uottawa.segapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class ProfileEdit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    //goTo Methods
    public void goToProfile (View view)
    {
        if (view.getId() == R.id.profileButton) {
            startProfile();

        }
    }

    //start Methods
    public void startProfile ()
    {
        Intent i = new Intent(ProfileEdit.this, Profile.class);
        startActivity(i);
    }

    //setting the user input
    public static void setName(Context context, String name)
    {
        SharedPreferences prefs = context.getSharedPreferences("CEGAndroidApp", 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("editText3", name);
        editor.commit();
    }

    public static void setUsername(Context context, String username)
    {
        SharedPreferences prefs = context.getSharedPreferences("CEGAndroidApp", 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("editText4", username);
        editor.commit();
    }

    public static void setAge(Context context, String age)
    {
        SharedPreferences prefs = context.getSharedPreferences("CEGAndroidApp", 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("editText5", age);
        editor.commit();
    }

    public void setProfileImage(View view)
    {
        //Creating a Return intent to pass to the Main Activity
        Intent returnIntent = new Intent();
        //Figuring out which button was clicked
        ImageView selectedImage = (ImageView) view;
        //Adding stuff to the return intent
        returnIntent.putExtra("imageID", selectedImage.getId());
        setResult(RESULT_OK, returnIntent);
        //Finishing Activity and return to main screen!
        finish();
    }
}