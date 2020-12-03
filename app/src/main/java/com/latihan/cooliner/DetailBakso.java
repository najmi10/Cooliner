package com.latihan.cooliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.latihan.cooliner.R.id.btn_bakso;

public class DetailBakso extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bakso);

        Button BtnBakso = findViewById(btn_bakso);
        BtnBakso.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_bakso:
                Intent moveIntent = new Intent(DetailBakso.this, ResepBakso.class);
                startActivity(moveIntent);
                break;
        }
    }
}