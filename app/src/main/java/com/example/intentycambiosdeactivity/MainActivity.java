package com.example.intentycambiosdeactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//tengo que implementar de la clase View para que te cree el método
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView cuadroTexto=(TextView) findViewById(R.id.txtActivityMain);



    /*Al iniciar la app*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*para instanciar el botón y que te lo reconozca la app*/
        Button botonMain = (Button) findViewById(R.id.btnMain);

        botonMain.setOnClickListener(this);

    }


    @Override
    protected void onStart() {
        super.onStart();
    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }


    @Override
    protected void onStop() {
        super.onStop();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    //Te crea el método al implementar la clase View
    @Override
    public void onClick(View v) {
        //Para saber de que botón se trata
        switch (v.getId()) {
            case (R.id.btnMain):
                //Ponemos de donde venimos y la activity a la que vamos
                Intent activityMain2 = new Intent(this, MainActivity2.class);

            /*Para lanzarlo y coger info del activity
            startActivityForResult(activityMain2,1);*/
                String msg = "Hola mundo";
                //Para enviar información
                activityMain2.putExtra("clave", msg);

                /*Para lanzarlo*/
                startActivity(activityMain2);

            /*Como ir a una URL
            Intent enlace=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.es"));*/


                break;

        }

    }

    //--------------------------------------------------------------------------------
//Con este método analizas de donde viene la respuesta y la recoges
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 5:
                String recogerDatos="";
                //el get depende del tipo de dato y dentro va la clave
                recogerDatos=data.getStringExtra("canalActivity2");
                cuadroTexto.setText(recogerDatos);

                break;
        }
    }
}