package com.appracks.templete;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout myDrawer;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    ImageView img_bio,img_cover,img_quotes,img_videos,img_gallery,img_lifestyle;
    TextView tv_bio,tv_cover,tv_quotes,tv_videos,tv_gallery,tv_lifestyle,tv_aboutmessi,tv_achievements,tv_connectmessi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_bio=(TextView)findViewById(R.id.tv_bio);
        tv_quotes=(TextView)findViewById(R.id.tv_quotes);
        tv_videos=(TextView)findViewById(R.id.tv_videos);
        tv_gallery=(TextView)findViewById(R.id.tv_gallery);
        tv_lifestyle=(TextView)findViewById(R.id.tv_lifestyle);
        tv_achievements=(TextView)findViewById(R.id.tv_achievements);
        img_bio=(ImageView)findViewById(R.id.img_bio);
        img_bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Biography.class);
                startActivity(i);
            }
        });
        img_cover=(ImageView)findViewById(R.id.img_cover);
        img_quotes=(ImageView)findViewById(R.id.img_quotes);
        img_videos=(ImageView)findViewById(R.id.img_videos);
        img_gallery=(ImageView)findViewById(R.id.img_gallery);
        img_lifestyle=(ImageView)findViewById(R.id.img_lifestyle);
        tv_bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Biography.class);
                startActivity(i);
            }
        });
        tv_lifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Lifestyle.class);
                startActivity(intent);
            }
        });
        tv_quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Quotes.class);
                startActivity(intent);
            }
        });
        tv_achievements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Achievements.class);
                startActivity(intent);
            }
        });
        tv_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Gallerygridview.class);
                startActivity(intent);
            }
        });
        tv_connectmessi=(TextView)findViewById(R.id.tv_connectmessi);
        tv_connectmessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Connectmessi.class);
                startActivity(intent);
            }
        });

        toolbar=(Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        myDrawer=(DrawerLayout)findViewById(R.id.myDrawer);
        setNavMenu();

    }

    private void setNavMenu() {
        actionBarDrawerToggle=new ActionBarDrawerToggle(this, myDrawer,toolbar, R.string.drawer_open, R.string.drawer_close);
        //noinspection deprecation
        myDrawer.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setTitle("Are you sure to want to quit?");
        alertDialog.setCancelable(false);
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
                System.exit(0);
            }
        });
        alertDialog.setNegativeButton("No", null);
        alertDialog.show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
