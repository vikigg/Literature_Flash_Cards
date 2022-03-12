package com.example.lit_flash_cards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final int authorCount = 15;
    static Author[] authors = new Author[authorCount];
    static final int workCount = 94;
    static Work[] works = new Work[workCount];
    static int current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button authorsButton = findViewById(R.id.authorsButton);
        Button worksButton = findViewById(R.id.worksButton);

        authorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AuthorsActivity.class);
                startActivity(intent);
            }
        });

        worksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WorksActivity.class);
                startActivity(intent);
            }
        });

        Author.GetAuthors(authors);
        Work.GetWorks(works, authors);
    }
}