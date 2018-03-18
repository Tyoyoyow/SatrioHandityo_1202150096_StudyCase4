package com.example.android.satriohandityo_1202150096_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void allList(View view) {
        Intent x = new Intent(this, listmahasiswa.class);
        startActivity(x);
    }

    public void lihatGambar(View view) {
        Intent y = new Intent(this, lihatgambar.class);
        startActivity(y);
    }
}
