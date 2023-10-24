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
        albumAdapter=new AlbumAdapter(albums,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(albumAdapter);
    }
}