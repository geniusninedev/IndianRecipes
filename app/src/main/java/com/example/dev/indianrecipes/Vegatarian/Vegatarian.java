package com.example.dev.indianrecipes.Vegatarian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dev.indianrecipes.R;

/**
 * Created by Dev on 29-11-2016.
 */


public class Vegatarian extends AppCompatActivity {
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ricelist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.ricelist);

        // Defined Array values to show in ListView
        String[] values = new String[]{"Aaloo Sabji",
                "Baigan Bharta",
                " Malai Kofta",
                "DumAaloo",
                "Mushrooms Matar",
                "Palak Kofta",
                "Paneer Kofta",
                "Patta Gobi","ShahiPaneer","VegetablesCurry"

        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.ricelist, R.id.textViewLunch, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;
              if (position == 0) {
                    Intent engineering = new Intent(getApplicationContext(), Aaloo.class);
                    startActivity(engineering);
                }
                if (position == 1) {
                    Intent engineering = new Intent(getApplicationContext(), Bharta.class);
                    startActivity(engineering);
                }
                if (position == 2) {
                    Intent engineering = new Intent(getApplicationContext(), DumAaloo.class);
                    startActivity(engineering);
                }

                if (position == 3) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Kofta.class);
                    startActivity(environmentalengineering);
                }
                if (position == 4) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Mushrooms.class);
                    startActivity(environmentalengineering);
                }
                if (position == 5) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Palak.class);
                    startActivity(environmentalengineering);
                }
                if (position == 6) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), PaneerKofta.class);
                    startActivity(environmentalengineering);
                }
                if (position == 7) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), PattaGobi.class);
                    startActivity(environmentalengineering);
                }
                if (position == 8) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), ShahiPaneer.class);
                    startActivity(environmentalengineering);
                }
                if (position == 9) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), VegetablesCurry.class);
                    startActivity(environmentalengineering);
                }

                String itemValue = (String) listView.getItemAtPosition(position);




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



