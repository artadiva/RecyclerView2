package com.example.myapplicationa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Arta Diva", "1805551057", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Agus", "333221234", "987648422"));
        mahasiswaArrayList.add(new Mahasiswa("Cindi", "1214422345", "98762324265"));
        mahasiswaArrayList.add(new Mahasiswa("Ervan", "12323240345", "9876432422"));
        mahasiswaArrayList.add(new Mahasiswa("Gina", "24234232424", "98342423225"));
        mahasiswaArrayList.add(new Mahasiswa("Hida", "1323424242", "924242423423"));
        mahasiswaArrayList.add(new Mahasiswa("Iwan", "12323230345", "98742423265"));
        mahasiswaArrayList.add(new Mahasiswa("Komang", "12142234232", "9872423422"));

    }
}
