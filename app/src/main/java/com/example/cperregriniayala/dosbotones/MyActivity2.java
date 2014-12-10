package com.example.cperregriniayala.dosbotones;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cperregriniayala.dosbotones.MyActivity;

import static com.example.cperregriniayala.dosbotones.R.id.botonH;


public class MyActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button bhola=(Button)findViewById(botonH);
        bhola.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v)
            {

                Intent intento = new Intent(MyActivity2.this,MyActivity.class);
                Bundle reci=new Bundle();
                reci.putString("nombre","damian");
                intento.putExtras(reci);
                startActivityForResult(intento, 1);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        String res = data.getExtras().getString("respuesta");
        Context context = getApplicationContext();
        CharSequence text = res;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}