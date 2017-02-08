package com.example.dev.indianrecipes;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.dev.indianrecipes.LunchBox.Lunch;
import com.example.dev.indianrecipes.NonVeg.NonVeg;
import com.example.dev.indianrecipes.NonVegetarian.NonVegetarian;
import com.example.dev.indianrecipes.Rice.Rice;
import com.example.dev.indianrecipes.Snacks.Snacks;
import com.example.dev.indianrecipes.Sweets.Sweets;
import com.example.dev.indianrecipes.Vegatarian.Vegatarian;
import com.example.dev.indianrecipes.breakfast.Breakfast;


public class AllRecipes extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    GridView allrecipes;
    public static String[] ShayariList = {"BreakFast","Snacks","Sweets","LunchBox","Rice","Vegetarian","Chicken","NonVegetarian"};
    public static int[] ShayariImages = {R.drawable.dosa,R.drawable.snacks,R.drawable.sweets,R.drawable.box,R.drawable.rice,R.drawable.vegg,R.drawable.butterchicken,R.drawable.chiken
     };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_recipes);
        allrecipes = (GridView) findViewById(R.id.homerecipes);
        allrecipes.setAdapter(new CustomAdapter(this, ShayariList, ShayariImages));
        allrecipes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(AllRecipes.this, Breakfast.class);
                    startActivity(i);
                }
                if (position == 1) {
                    Intent i = new Intent(AllRecipes.this, Snacks.class);
                    startActivity(i);
                }

               if (position == 2) {
                    Intent i = new Intent(AllRecipes.this, Sweets.class);
                    startActivity(i);
                }

                if (position == 3) {
                    Intent i = new Intent(AllRecipes.this, Lunch.class);
                    startActivity(i);
                }

              if (position == 4) {
                    Intent i = new Intent(AllRecipes.this, Rice.class);
                    startActivity(i);
                }
                if (position == 5) {
                    Intent i = new Intent(AllRecipes.this, Vegatarian.class);
                    startActivity(i);
                }
               if (position == 6) {
                    Intent i = new Intent(AllRecipes.this, NonVegetarian.class);
                    startActivity(i);
                }
                if (position == 7) {
                    Intent i = new Intent(AllRecipes.this, NonVeg.class);
                    startActivity(i);
                }
            }
        });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                /*Intent i=new Intent(this,Splash_Screen.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity;*/
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();
                            }
                        });

                alertDialogBuilder.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                            }
                        });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.all_recipes, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
          /*  Intent allrecipes=new Intent(getApplicationContext(),AllRecipes.class);
            startActivity(allrecipes);*/
        } else if (id == R.id.nav_gallery) {
            Intent categories=new Intent(getApplicationContext(),Categories.class);

            startActivity(categories);

        } else if (id == R.id.nav_share) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
