package com.androidabcd.ashokslsk.letsventurescreening;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.androidabcd.ashokslsk.letsventurescreening.model.StartUpResponse;
import com.androidabcd.ashokslsk.letsventurescreening.model.Startup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://www.mocky.io";
    private RecyclerView mRecyclerView;
    private ArrayList<Startup> mArrayList;
    private RecyclerviewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initViews();
        loadJSON();
    }

    private void initViews(){
        mRecyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
    }
    private void loadJSON(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface request = retrofit.create(RequestInterface.class);
        Call<StartUpResponse> call = request.getJSON();
        call.enqueue(new Callback<StartUpResponse>() {
            @Override
            public void onResponse(Call<StartUpResponse> call, Response<StartUpResponse> response) {
                StartUpResponse jsonResponse = response.body();
                Toast.makeText(MainActivity.this, jsonResponse.getTotalCount()+"", Toast.LENGTH_SHORT).show();
                mAdapter = new RecyclerviewAdapter((ArrayList<Startup>) jsonResponse.getStartups());
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<StartUpResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem search = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(search);
        search(searchView);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void search(SearchView searchView) {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                if (mAdapter != null) mAdapter.getFilter().filter(newText);
                return true;
            }
        });
    }
}

