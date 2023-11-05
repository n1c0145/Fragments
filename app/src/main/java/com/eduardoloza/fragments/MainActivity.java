package com.eduardoloza.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import adapters.AlbumAdapter;
import models.Album;


public class MainActivity extends AppCompatActivity {

private RecyclerView recyclerView;
private AlbumAdapter albumAdapter;
private List<Album> albums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        albums = new ArrayList<>();
        albums.add(new Album("The Dark Side of the moon","Pink Floyd","Rock",R.drawable.icon));
        albums.add(new Album("Nevermind","Nirvana","Rock",R.drawable.icon2));
        albums.add(new Album("Appetite for Destruction","Guns N' Roses","Rock",R.drawable.icon3));
        albums.add(new Album("Back in Black","AC/DC","Rock",R.drawable.icon4));
        albums.add(new Album("White Album","The Beatles","Rock",R.drawable.icon5));
        albums.add(new Album("Nine Lives","Aerosmith","Rock",R.drawable.icon6));
        albums.add(new Album("Led Zeppelin IV","Led Zeppelin","Rock",R.drawable.icon7));
        albums.add(new Album("Some Girls","The Rolling Stones","Rock",R.drawable.icon8));
        albums.add(new Album("Destroyer","Kiss","Rock",R.drawable.icon9));
        albums.add(new Album("Black Album","Metallica","Rock",R.drawable.icon10));

        albumAdapter=new AlbumAdapter(albums,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(albumAdapter);
    }
}