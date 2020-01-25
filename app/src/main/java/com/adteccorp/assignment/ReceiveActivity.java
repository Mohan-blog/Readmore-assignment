package com.adteccorp.assignment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveActivity extends AppCompatActivity {
    TextView ettext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_receive );
        init();
    }

    private void init() {
        ettext = findViewById( R.id.etuseroutput );
        String str = getIntent().getStringExtra( "Name" );
        ettext.setText( str );


    }
}
