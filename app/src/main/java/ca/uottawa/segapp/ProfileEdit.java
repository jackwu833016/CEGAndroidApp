package ca.uottawa.segapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class ProfileEdit extends AppCompatActivity {

    public void 

    public void startProfileEditActivity()
    {
        Intent i = new Intent(ProfileEdit.this, Profile.class);
        startActivity(i);
    }
}
