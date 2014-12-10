package com.example.cperregriniayala.dosbotones;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.cperregriniayala.dosbotones.R;

public class MyActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);

        //me falta el ONCLICLICK

        //Relacionamos el boton del layout con botón java.
        Button botonh = (Button)findViewById(R.id.botonH);
        //Lo ponemos a escuchar para cuando sea pulsado
        botonh.setOnClickListener(this);

    }

    //Aquí se irá administrando cuando un botón es pulsado
    @Override
    public void onClick(View v) {
        /*Comprobamos a que id pertenece el id del botón pulsado, en este caso como solo tenemos 1
        siempre va a ser el mismo pero se puede dar el caso de que haya más de un botón, entonces aquí se controlaría que botón se ha pulsado.
        */
        Intent i = new Intent();
        i.putExtra("Respuesta","Hola");
        setResult(RESULT_OK,i);
        finish();
    }


    private void setResult(int resultOk, Intent i) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
