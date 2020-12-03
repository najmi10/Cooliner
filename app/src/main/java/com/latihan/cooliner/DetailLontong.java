package com.latihan.cooliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.latihan.cooliner.R.id.btn_lontong;

public class DetailLontong extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lontong);

        Button BtnLontong = findViewById(btn_lontong);
        BtnLontong.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_lontong:
                Intent moveIntent = new Intent(DetailLontong.this, ResepLontong.class);
                startActivity(moveIntent);
                break;
        }
    }
}