package com.whyinside.whyinside.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.adapters.FilterRecyclerAdapter;
import com.whyinside.whyinside.models.filter.FilterData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        RecyclerView navigationView1 = (RecyclerView) findViewById(R.id.nav_view_right);
        navigationView.setNavigationItemSelectedListener(this);
        //navigationView1.setNavigationItemSelectedListener(this);

        LinearLayoutManager ln = new LinearLayoutManager(this);
        ln.setOrientation(LinearLayoutManager.VERTICAL);
        navigationView1.setHasFixedSize(true);
        navigationView1.setLayoutManager(ln);

        ArrayList<FilterData> a = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            FilterData fd = new FilterData();

            fd.setName(String.valueOf(i) + "item");
            a.add(fd);

        }

        FilterData fdLabel = new FilterData();
        FilterData fdLabel1 = new FilterData();

        fdLabel.setName("Label 1");
        fdLabel.setViewType(1);
        fdLabel1.setName("Label 2");
        fdLabel1.setViewType(1);

        a.add(0, fdLabel);

        a.add(5, fdLabel1);


        navigationView1.setAdapter(new FilterRecyclerAdapter(MainActivity.this, a));


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if ((drawer.isDrawerOpen(GravityCompat.END))) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_filter) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_rest) {
            // Handle the camera action
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
