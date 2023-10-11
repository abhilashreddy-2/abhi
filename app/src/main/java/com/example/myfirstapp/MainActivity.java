package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ImageButton gfgImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initializing the variable for image button
        gfgImageButton = (ImageButton) findViewById(R.id.imageButton);

        // Below code is for setting a click listener on the image
        gfgImageButton.setOnClickListener(view -> {
            // Creating a toast to display the message
            Toast.makeText(MainActivity.this, "KCR", Toast.LENGTH_SHORT).show();
            String url = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.telanganatoday.com%2Fwp-content%2Fuploads%2F2023%2F02%2FCM-KCRs-birthday-Wishes-pour-in-from-across-the-country-PM-Stalin-greet-him.jpg&tbnid=6pDcDqgbGGeH4M&vet=12ahUKEwiHpZek4OyBAxV4MWIAHWaPD-wQMygBegQIARBy..i&imgrefurl=https%3A%2F%2Ftelanganatoday.com%2Fcm-kcrs-birthday-wishes-pour-in-from-across-the-country-pm-stalin-greet-him&docid=qYROBWnUFs-ZmM&w=1280&h=750&q=kcr%20photos&ved=2ahUKEwiHpZek4OyBAxV4MWIAHWaPD-wQMygBegQIARBy";
            // Creating an explicit intent to open the
            // link stored in variable url
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }
}
