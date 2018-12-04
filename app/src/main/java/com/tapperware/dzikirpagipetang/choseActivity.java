package com.tapperware.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);
    }

    public void dzikirPagi(View view){
        Intent pindah = new Intent(this, dzikirPagiActivity.class);
        startActivity(pindah);
    }

    public void dzikirPetang(View view){
        Intent pindah = new Intent(this, dzikirPetangActivity.class);
        startActivity(pindah);
    }

    public void dzikirSholat(View view){
        Intent pindah = new Intent(this, dzikirSholatActivity.class);
        startActivity(pindah);
    }
}
