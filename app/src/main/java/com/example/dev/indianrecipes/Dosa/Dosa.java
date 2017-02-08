package com.example.dev.indianrecipes.Dosa;

/**
 * Created by Dev on 25-11-2016.
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
import com.example.dev.indianrecipes.breakfast.MasalaIdli;
import com.example.dev.indianrecipes.breakfast.SambarIdli;

public class Dosa extends AppCompatActivity {
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idlilist);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView) findViewById(R.id.idlirecipe);

        // Defined Array values to show in ListView
        String[] values = new String[]{"Masala Dosa",
                "Banana Dosa",
                "Neer Dosa",
                "Rava Dosa",
                "Dal Dosa",
                "Tomato Dosa",



        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.idlilist, R.id.textViewLunch, values);


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
                    Intent engineering = new Intent(getApplicationContext(), MasalaDosa.class);
                    startActivity(engineering);
                }
                if (position == 1) {
                    Intent engineering = new Intent(getApplicationContext(), BananaDosa.class);
                    startActivity(engineering);
                }
                if (position == 2) {
                    Intent engineering = new Intent(getApplicationContext(), NeerDosa.class);
                    startActivity(engineering);
                }

                if (position == 3) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), Ravadosa.class);
                    startActivity(environmentalengineering);
                }
                if (position == 4) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), DalDosa.class);
                    startActivity(environmentalengineering);
                }
                if (position == 5) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), TomatoDosa.class);
                    startActivity(environmentalengineering);
                }
                if (position == 6) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), SambarIdli.class);
                    startActivity(environmentalengineering);
                }
                if (position == 7) {
                    Intent environmentalengineering = new Intent(getApplicationContext(), MasalaIdli.class);
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

