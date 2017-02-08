package com.example.dev.indianrecipes;

/**
 * Created by Dev on 29-11-2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dev.indianrecipes.R;


public class Days extends AppCompatActivity{
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sweetslist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.sweetslist);

        // Defined Array values to show in ListView
        String[] values = new String[]{"ButterChicken ",
                "Chicken Curry",
                "Chicken Kurma",
                "ChilliChicken",
                "Orange Chicken",
                "Scallion Chicken",

                "Seasame Chicken",
                "SixtyFive",
                "StirFry Chicken","Chicken Tikka Masala"

        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.sweetslist, R.id.textViewSnacks, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;
               /* if (position == 0) {
                    Intent engineering = new Intent(getApplicationContext(),NonVegetarian.ButterChicken.class);
                    startActivity(engineering);
                }
                if (position == 1) {
                    Intent engineering = new Intent(getApplicationContext(), NonVegetarian.ChickenCurry.class);
                    startActivity(engineering);
                }
                if (position == 2) {
                    Intent engineering = new Intent(getApplicationContext(),NonVegetarian.ChickenKurma.class);
                    startActivity(engineering);
                }

                if (position == 3) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), NonVegetarian.ChilliChicken.class);
                    startActivity(environmentalengineering);
                }
                if (position == 4) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), NonVegetarian.OrangeChicken.class);
                    startActivity(environmentalengineering);
                }
                if (position == 5) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), NonVegetarian.ScallionChicken.class);
                    startActivity(environmentalengineering);
                }
                if (position == 6) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), NonVegetarian.SeasameChicken.class);
                    startActivity(environmentalengineering);
                }

                if (position == 7) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), NonVegetarian.SixtyFive.class);
                    startActivity(environmentalengineering);
                }


                if (position == 8) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), NonVegetarian.StirFryChicken.class);
                    startActivity(environmentalengineering);
                }
                if (position == 9) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), NonVegetarian.ChickenTikka.class);
                    startActivity(environmentalengineering);
                }
*/

                String itemValue = (String) listView.getItemAtPosition(position);




            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
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
