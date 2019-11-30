package com.hexamind.datera;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigation;
    private RelativeLayout layout;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottomNavigation);
        layout = findViewById(R.id.layout);
        view =  findViewById(R.id.view);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLayout, new ExploreFragment());
        transaction.commit();
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigationExplore:
                        layout.setVisibility(View.VISIBLE);
                        view.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this, "Explore selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigationMatches:
                        layout.setVisibility(View.INVISIBLE);
                        view.setVisibility(View.INVISIBLE);
                        Toast.makeText(MainActivity.this, "Favourites selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navigationChat:
                        layout.setVisibility(View.INVISIBLE);
                        view.setVisibility(View.INVISIBLE);
                        Toast.makeText(MainActivity.this, "Chat selected", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}
