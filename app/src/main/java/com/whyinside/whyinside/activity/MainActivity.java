package com.whyinside.whyinside.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.adapters.FilterRecyclerAdapter;
import com.whyinside.whyinside.fragment.RestaurantListFragment;
import com.whyinside.whyinside.models.filter.Filter;
import com.whyinside.whyinside.models.filter.FilterCollectedData;
import com.whyinside.whyinside.models.filter.FilterData;
import com.whyinside.whyinside.services.MClient;
import com.whyinside.whyinside.services.ServiceGenerator;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by GorA on 6/2/16.
 */

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.nav_view_right)
    RecyclerView navigationView1;
    private FragmentManager mFragmentManager;

    DrawerLayout drawer;

    ActionBar actionBar;


//    @Override
//    public void onAttachedToWindow() {
//        super.onAttachedToWindow();
//        actionBar = ((AppCompatActivity) ).getSupportActionBar();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.bringToFront();


        mFragmentManager = getSupportFragmentManager();
        mFragmentManager.beginTransaction().replace(R.id.fragment_container_rest, new RestaurantListFragment()).commit();

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

        requestFilterData();
    }


    private void setUpRightMenu(FilterData filter) {
        LinearLayoutManager ln = new LinearLayoutManager(this);
        ln.setOrientation(LinearLayoutManager.VERTICAL);
        navigationView1.setHasFixedSize(true);
        navigationView1.setLayoutManager(ln);

        List<FilterCollectedData> filterCollectedDataList = new ArrayList<>();


        for (String cityName : filter.getCity()) {
            FilterCollectedData cityData = new FilterCollectedData();
            cityData.setViewType(2);
            cityData.setTitle(cityName);

            filterCollectedDataList.add(cityData);
        }

        FilterCollectedData cuisineLabel = new FilterCollectedData();

        cuisineLabel.setTitle("Cuisine");
        cuisineLabel.setViewType(1);

        filterCollectedDataList.add(filter.getCity().size(), cuisineLabel);


        for (String cuisineName : filter.getCity()) {
            FilterCollectedData cuisineData = new FilterCollectedData();
            cuisineData.setViewType(2);
            cuisineData.setTitle(cuisineName);

            filterCollectedDataList.add(cuisineData);
        }

        FilterCollectedData cityLabel = new FilterCollectedData();

        cityLabel.setTitle("City");
        cityLabel.setViewType(1);

        filterCollectedDataList.add(1, cityLabel);
        navigationView1.setAdapter(new FilterRecyclerAdapter(MainActivity.this, filterCollectedDataList));
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


    private void requestFilterData() {
        MClient client = ServiceGenerator.createService(MClient.class);

        Call<Filter> call = client.filtersList();
        call.enqueue(new Callback<Filter>() {
            @Override
            public void onResponse(Call<Filter> call, Response<Filter> response) {
                setUpRightMenu((response.body().getData()));
            }

            @Override
            public void onFailure(Call<Filter> call, Throwable t) {
                System.out.print("Error" + t.getMessage());
            }
        });

    }
}