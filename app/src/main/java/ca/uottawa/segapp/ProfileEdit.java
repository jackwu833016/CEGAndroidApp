package ca.uottawa.segapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

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
}
