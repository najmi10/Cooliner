package com.latihan.cooliner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.latihan.cooliner.R.id.btn_krawu;

public class DetailKrawu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_krawu);

        Button BtnKrawu = findViewById(btn_krawu);
        BtnKrawu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case btn_krawu:
                Intent moveIntent = new Intent(DetailKrawu.this, ResepKrawu.class);
                startActivity(moveIntent);
                break;
        }
    }
}