package com.example.cs541_hello;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "CS541 Fun Time!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        final TextView result = findViewById(R.id.result);
        final TextView entry = findViewById(R.id.input);
        Button calculate = findViewById(R.id.button2);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //entry.getText();
                //result.setText(Integer.toString(current_tip));
                //System.out.println(result);
                double current_tip = 0;
                double bill = 0;
                CharSequence temp = entry.getText();
                String c = temp.toString();
                bill = Double.valueOf(c);
                //System.out.println((Type) entry.getText());
                current_tip = bill * 0.20;
                String printable_tip = Double.toString(current_tip);
                Snackbar.make(view, printable_tip, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
