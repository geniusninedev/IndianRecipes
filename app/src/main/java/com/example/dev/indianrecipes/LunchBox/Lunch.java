package com.example.dev.indianrecipes.LunchBox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dev.indianrecipes.R;



public class Lunch extends AppCompatActivity {
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunchlist);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.lunchlist);

        // Defined Array values to show in ListView
        String[] values = new String[]{"Brocoli Paratha ",
                "Chapati",
                "Vangi Bhat",
                "Potato Pulav",
                "Bhakri",
                "Spinach Rice","Bhendy Fry","Dal Fry","Thalipeeth"," VegetablesParatha"



        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.lunchlist, R.id.textViewLunch, values);


        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;
                if (position == 0) {
                    Intent engineering = new Intent(getApplicationContext(),BrocoliParatha.class);
                    startActivity(engineering);
                }
               if (position == 1) {
                    Intent engineering = new Intent(getApplicationContext(), Chapati.class);
                    startActivity(engineering);
                }
               if (position == 2) {
                    Intent engineering = new Intent(getApplicationContext(), PotatoPulav.class);
                    startActivity(engineering);
                }

                if (position == 3) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), VangiBhat.class);
                    startActivity(environmentalengineering);
                }
                if (position == 4) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Bhakri.class);
                    startActivity(environmentalengineering);
                }
                if (position == 5) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), SpinachRice.class);
                    startActivity(environmentalengineering);
                }
                if (position == 6) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  BhendyFry.class);
                    startActivity(environmentalengineering);
                }

               if (position == 7) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  DalFry.class);
                    startActivity(environmentalengineering);
                }
               if (position == 8) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  Thalipeeth.class);
                    startActivity(environmentalengineering);
                }
               if (position == 9) {
                    Intent environmentalengineering = new Intent(getApplicationContext(),  VegetablesParatha.class);
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

