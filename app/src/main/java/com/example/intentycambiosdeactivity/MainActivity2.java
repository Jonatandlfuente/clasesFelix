package com.example.intentycambiosdeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView miTextView=(TextView) findViewById(R.id.txwActivityMain2);

        String recogerTexto=getIntent().getStringExtra("valor");
        miTextView.setText(recogerTexto);

        //Para devolver información a la activity que te lanzó ------------------------------
        String mensajeActivityMain="hola mundo";
        Intent activityMain= getIntent();
        activityMain.putExtra("canalActivity2",mensajeActivityMain);
        //con el resultCode lo mandamos al onActivityResult
        setResult(5,activityMain);

    }
}