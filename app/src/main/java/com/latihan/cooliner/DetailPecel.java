package com.latihan.cooliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.latihan.cooliner.R.id.btn_pecel;

public class DetailPecel extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pecel);

        Button BtnPecel = findViewById(btn_pecel);
        BtnPecel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_pecel:
                Intent moveIntent = new Intent(DetailPecel.this, ResepPecel.class);
                startActivity(moveIntent);
                break;
        }
    }
}