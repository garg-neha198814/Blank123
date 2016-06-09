package com.itpro.blank123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mymeeting extends AppCompatActivity {
    Button mtab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_meeting);
        getSupportActionBar().hide();

        mtab= (Button) findViewById(R.id.tab);
        mtab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mymeeting.this,PaymentMethod.class));
            }
        });
    }
}
