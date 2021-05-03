package com.example.cardviewmenubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.maintoolbarid);
       // toolbar.setTitle("Prototype");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menucreate,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.refreshnevid:
                Toast.makeText(MainActivity.this,"Page Reloaded Successfully",Toast.LENGTH_LONG).show();
                break;
            case R.id.sharenevid:
                Toast.makeText(MainActivity.this,"Share done",Toast.LENGTH_LONG).show();
                break;
            case R.id.rateusnavid:
                Toast.makeText(MainActivity.this,"please rate this app",Toast.LENGTH_LONG).show();
                break;
            case R.id.deletenavbarid:
                Toast.makeText(MainActivity.this,"the profile deleted successfully",Toast.LENGTH_LONG).show();
                break;
            case R.id.mutenavbarid:
                Toast.makeText(MainActivity.this,"Sound has muted",Toast.LENGTH_LONG).show();
                break;
            case R.id.languagenavbarid:
                Toast.makeText(MainActivity.this,"please select Language",Toast.LENGTH_LONG).show();
                break;



        }
        return super.onOptionsItemSelected(item);

    }
}