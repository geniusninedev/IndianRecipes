package com.example.dev.indianrecipes;

/**
 * Created by Dev on 29-11-2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {
    Button Eggsrecipes, Picklesrecipes, Saladrecipes,  Daalrecipes, Chutneyrecipes,Souprecipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basicindexx);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Eggsrecipes = (Button) findViewById(R.id.eggs);
        Picklesrecipes = (Button) findViewById(R.id.pickles);


        Eggsrecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), Eggs.class);
                startActivity(aptitude);
            }
        });

        Picklesrecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), Pickles.class);
                startActivity(aptitude);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:

                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }

}


