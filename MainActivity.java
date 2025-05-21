package com.example.cred;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView, memberSinceTextView, creditScoreTextView, cashbackTextView, coinTextView;
    private ImageView profileImageView;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This refers to res/layout/activity_main.xml

        // Initialize views
        nameTextView = findViewById(R.id.text_title);
        memberSinceTextView = findViewById(R.id.text_member_since);
        creditScoreTextView = findViewById(R.id.text_credit_score);
        cashbackTextView = findViewById(R.id.text_cashback);
        coinTextView = findViewById(R.id.text_coins);
        profileImageView = findViewById(R.id.image_profile);

        // Set example data
        nameTextView.setText("andaz Kumar");
        memberSinceTextView.setText("member since Dec, 2020");
        creditScoreTextView.setText("757");
        cashbackTextView.setText("₹3");
        coinTextView.setText("26,46,583");

        // Optional: Set profile image from drawable
        profileImageView.setImageResource(R.mipmap.ic_profile);
    }
}

