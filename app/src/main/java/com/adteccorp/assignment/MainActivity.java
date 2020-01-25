package com.adteccorp.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etuser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        init();
    }

    private void init() {
        etuser =findViewById(R.id.etuserinput);
    }


    public void passbtn(View view) {
        String namevalue = etuser.getText().toString();
        Intent intent = new Intent( MainActivity.this,ReceiveActivity.class );
        intent.putExtra( "Name",namevalue );
        startActivity( intent );


    }
}
