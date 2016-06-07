package com.whyinside.whyinside.activity;

import android.content.Intent;
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

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by GorA on 6/2/16.
 */

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.nav_view_right)
    RecyclerView navigationView1;

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.bringToFront();

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView leftNavigationView = (NavigationView) findViewById(R.id.nav_view);

        leftNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle Left navigation view item clicks here.
                int id = item.getItemId();

                switch (id) {
                    case R.id.nav_rest:
                        break;
                    case R.id.nav_account:
                        startActivity(new Intent(MainActivity.this, AccountActivity.class));
                        break;
                    case R.id.nav_history:
                        startActivity(new Intent(MainActivity.this, OrderHistoryActivity.class));
                        break;
                    case R.id.nav_contact:
                        startActivity(new Intent(MainActivity.this, ContactUsActivity.class));
                        break;
                    case R.id.nav_setting:
                        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                        break;
                    case R.id.nav_refer:
                        startActivity(new Intent(MainActivity.this, ReferFriendActivity.class));
                        break;
                    case R.id.nav_sing_out:
                        finish();
                        break;
                }
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        setUpRightMenu();

    }


    private void setUpRightMenu() {
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
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (drawer.isDrawerOpen(GravityCompat.END)) {  /*Closes the Appropriate Drawer*/
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
            System.exit(0);
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
            drawer.openDrawer(GravityCompat.END); /*Opens the Right Drawer*/

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}