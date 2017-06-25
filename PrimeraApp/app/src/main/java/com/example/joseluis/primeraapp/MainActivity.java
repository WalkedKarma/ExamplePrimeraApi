package com.example.joseluis.primeraapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtvOne;
    private Button btnOne;
    private String saveVariable;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        txtvOne = (TextView) findViewById(R.id.myTxtvOne);
        btnOne = (Button) findViewById(R.id.myButtonOne);
        saveVariable = txtvOne.getText().toString();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtvOne.getText().toString().contains("L")){
                    txtvOne.setText("Contreras");
                }else{
                    txtvOne.setText(saveVariable);
                }

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Toast.makeText(this, "Hola Android Studio", Toast.LENGTH_SHORT).show();
        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(txtvOne.getText().toString().contains("L")){
                    txtvOne.setText("Contreras");
                }else{
                    txtvOne.setText(saveVariable);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
