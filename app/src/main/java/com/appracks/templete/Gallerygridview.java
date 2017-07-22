package com.appracks.templete;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.appracks.templete.adapter.Galleryadapter;
import com.appracks.templete.dataobject.Gallery;

import java.io.Serializable;
import java.util.ArrayList;

public class Gallerygridview extends AppCompatActivity {
GridView gv;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        toolbar=(Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        gv=(GridView)findViewById(R.id.gridview);
        final int[]images={R.drawable.messi0,R.drawable.messi01,R.drawable.messi1,R.drawable.messi2,R.drawable.messi3,R.drawable.messi4,R.drawable.messi6,R.drawable.messi7,R.drawable.messi5,R.drawable.messi8,R.drawable.messi9,R.drawable.messi10,R.drawable.messi11,R.drawable.messi12,R.drawable.messi13,R.drawable.messi15,R.drawable.messi16,R.drawable.messi17,R.drawable.messi18,R.drawable.messi19,R.drawable.messi20,R.drawable.messi22,R.drawable.messi24,R.drawable.messi25,R.drawable.messi27,R.drawable.messi29,R.drawable.messi30,R.drawable.messi31,R.drawable.messi40,R.drawable.messi45,R.drawable.messi46,R.drawable.messi49,R.drawable.messi50};
        final Gallery gallery=new Gallery(images[0]);
        Gallery gallery1=new Gallery(images[1]);
        Gallery gallery2=new Gallery(images[2]);
        Gallery gallery3=new Gallery(images[3]);
        Gallery gallery4=new Gallery(images[4]);
        Gallery gallery5=new Gallery(images[5]);
        Gallery gallery6=new Gallery(images[6]);
        Gallery gallery7=new Gallery(images[7]);
        Gallery gallery8=new Gallery(images[8]);
        Gallery gallery9=new Gallery(images[9]);
        Gallery gallery10=new Gallery(images[10]);
        Gallery gallery11=new Gallery(images[11]);
        Gallery gallery12=new Gallery(images[12]);
        Gallery gallery13=new Gallery(images[13]);
        Gallery gallery14=new Gallery(images[14]);
        Gallery gallery15=new Gallery(images[15]);
        Gallery gallery16=new Gallery(images[16]);
        Gallery gallery17=new Gallery(images[17]);
        Gallery gallery18=new Gallery(images[18]);
        Gallery gallery19=new Gallery(images[19]);
        Gallery gallery20=new Gallery(images[20]);
        Gallery gallery21=new Gallery(images[21]);
        Gallery gallery22=new Gallery(images[22]);
        Gallery gallery23=new Gallery(images[23]);
        Gallery gallery24=new Gallery(images[24]);
        Gallery gallery25=new Gallery(images[25]);
        Gallery gallery26=new Gallery(images[26]);
        Gallery gallery27=new Gallery(images[27]);
        Gallery gallery28=new Gallery(images[28]);
        Gallery gallery29=new Gallery(images[29]);
        Gallery gallery30=new Gallery(images[30]);
        Gallery gallery31=new Gallery(images[31]);
        Gallery gallery32=new Gallery(images[32]);

        final ArrayList<Gallery>galleryArrayList=new ArrayList<Gallery>();
        galleryArrayList.add(gallery);
        galleryArrayList.add(gallery1);
        galleryArrayList.add(gallery2);
        galleryArrayList.add(gallery3);
        galleryArrayList.add(gallery4);
        galleryArrayList.add(gallery5);
        galleryArrayList.add(gallery6);
        galleryArrayList.add(gallery7);
        galleryArrayList.add(gallery8);
        galleryArrayList.add(gallery9);
        galleryArrayList.add(gallery10);
        galleryArrayList.add(gallery11);
        galleryArrayList.add(gallery12);
        galleryArrayList.add(gallery13);
        galleryArrayList.add(gallery14);
        galleryArrayList.add(gallery15);
        galleryArrayList.add(gallery16);
        galleryArrayList.add(gallery17);
        galleryArrayList.add(gallery18);
        galleryArrayList.add(gallery19);
        galleryArrayList.add(gallery20);
        galleryArrayList.add(gallery21);
        galleryArrayList.add(gallery22);
        galleryArrayList.add(gallery23);
        galleryArrayList.add(gallery24);
        galleryArrayList.add(gallery25);
        galleryArrayList.add(gallery26);
        galleryArrayList.add(gallery27);
        galleryArrayList.add(gallery28);
        galleryArrayList.add(gallery29);
        galleryArrayList.add(gallery30);
        galleryArrayList.add(gallery31);
        galleryArrayList.add(gallery32);






        Galleryadapter galleryadapter=new Galleryadapter(this,galleryArrayList);
        gv.setAdapter(galleryadapter);
        getSupportActionBar().setTitle("Gallery");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


}
