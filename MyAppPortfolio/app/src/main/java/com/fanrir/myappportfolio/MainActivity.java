package com.fanrir.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPopularMovies(View view) {
        Toast.makeText(this, R.string.launch_popular_movies_toast, Toast.LENGTH_SHORT).show();
    }

    public void launchStockHawk(View view) {
        Toast.makeText(this, R.string.launch_stock_hawk_toast, Toast.LENGTH_SHORT).show();
    }

    public void launchBuildItBigger(View view) {
        Toast.makeText(this, R.string.launch_build_it_bigger_toast, Toast.LENGTH_SHORT).show();
    }

    public void launchMakeYourAppMaterial(View view) {
        Toast.makeText(this, R.string.launch_make_your_app_material_toast, Toast.LENGTH_SHORT).show();
    }

    public void launchGoUbiquitous(View view) {
        Toast.makeText(this, R.string.launch_go_ubiquitous_toast, Toast.LENGTH_SHORT).show();
    }

    public void launchCapstone(View view) {
        Toast.makeText(this, R.string.launch_capstone_toast, Toast.LENGTH_SHORT).show();
    }
}
