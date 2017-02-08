package com.example.dev.indianrecipes.Snacks;

/**
 * Created by Dev on 28-11-2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dev.indianrecipes.R;

public class Snacks extends AppCompatActivity {
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackslist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.snacks);

        // Defined Array values to show in ListView
        String[] values = new String[]{"Chivda ",
                "Masala Biscuites",
                "Masala Cashews",
                "NanKhatai",
                "Peanut Chikki",
                "Papdi","Sukhiyan","Dhokla","Khandavi","Rava Bhujiya"



        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.snackslist, R.id.textViewSnacks, values);


        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;
                if (position == 0) {
                    Intent engineering = new Intent(getApplicationContext(),Chivda.class);
                    startActivity(engineering);
                }
                if (position == 1) {
                    Intent engineering = new Intent(getApplicationContext(), Biscuites.class);
                    startActivity(engineering);
                }
                if (position == 2) {
                    Intent engineering = new Intent(getApplicationContext(), Cashews.class);
                    startActivity(engineering);
                }

                if (position == 3) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Nankatai.class);
                    startActivity(environmentalengineering);
                }
                if (position == 4) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Chikki.class);
                    startActivity(environmentalengineering);
                }
                if (position == 5) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Papdi.class);
                    startActivity(environmentalengineering);
                }
                if (position == 6) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  Sukhiyan.class);
                    startActivity(environmentalengineering);
                }

                if (position == 7) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  Dhokla.class);
                    startActivity(environmentalengineering);
                }
                if (position == 8) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  Khandavi.class);
                    startActivity(environmentalengineering);
                }
                if (position == 9) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  Bhujiya.class);
                    startActivity(environmentalengineering);
                }

                String itemValue = (String) listView.getItemAtPosition(position);




            }

        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (item.getItemId()) {
            case android.R.id.home:


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

