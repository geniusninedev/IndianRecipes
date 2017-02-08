package com.example.dev.indianrecipes.breakfast;

/**
 * Created by Dev on 25-11-2016.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.dev.indianrecipes.Dosa.Dosa;
import com.example.dev.indianrecipes.R;

public class Breakfast extends AppCompatActivity {
    Button Idlirecipes, Dosarecipes, AluParatha, Poha, Upma,PaneerParatha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basicindex);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Idlirecipes = (Button) findViewById(R.id.idli);
        Dosarecipes = (Button) findViewById(R.id.dosa);
      AluParatha = (Button) findViewById(R.id.aluparatha);
       Poha = (Button) findViewById(R.id.poha);
        Upma = (Button) findViewById(R.id.upma);
PaneerParatha=(Button)findViewById(R.id.pathiri);

        Idlirecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), Idli.class);
                startActivity(aptitude);
            }
        });

       Dosarecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), Dosa.class);
                startActivity(aptitude);
            }
        });
       AluParatha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aptitude = new Intent(getApplicationContext(), Paratha.class);
                startActivity(aptitude);
            }
        });
        Poha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nonverbal = new Intent(getApplicationContext(), Pohaa.class);
                startActivity(nonverbal);
            }
        });
        Upma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent technical = new Intent(getApplicationContext(), Upamaa.class);
                startActivity(technical);
            }
        });
        PaneerParatha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent technical = new Intent(getApplicationContext(), PaneerParathaa.class);
                startActivity(technical);
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


