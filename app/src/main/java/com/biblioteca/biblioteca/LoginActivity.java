package com.biblioteca.biblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.biblioteca.biblioteca.Adapter.RV_BookList_Adapter;
import com.biblioteca.biblioteca.Model.CV_Model;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Obtener el Recycle view
        RecyclerView rv = (RecyclerView) findViewById(R.id.RV_BookList);

        //Crear el manager para el Recycle view
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        //Asociar el manager con RV
        rv.setLayoutManager(manager);

        //crear el Adapter que contiene la lista de las cards
        RV_BookList_Adapter adapter = new RV_BookList_Adapter(buildCards(), this ,  R.layout.cv_book);

        //añadir las cards al Recycle view
        rv.setAdapter(adapter);
    }

    private ArrayList<CV_Model> buildCards(){
        ArrayList<CV_Model> cards = new ArrayList<>();
        cards.add(new CV_Model("https://images.pexels.com/photos/253366/pexels-photo-253366.jpeg?w=940&h=650&auto=compress&cs=tinysrgb",
                                "La laguna Negra", "Juan Morales", "Santaillana", "20", "4", "2"));
        cards.add(new CV_Model("https://images.pexels.com/photos/243053/pexels-photo-243053.jpeg?w=940&h=650&auto=compress&cs=tinysrgb",
                                "Pepe y los grillos", "Juan Morales", "Santaillana", "50", "6", "2"));
        cards.add(new CV_Model("https://images.pexels.com/photos/208971/pexels-photo-208971.jpeg?w=940&h=650&auto=compress&cs=tinysrgb",
                                "Las cosas de la vida", "Carlos Morales", "Santaillana", "20", "4", "2"));

        return cards;
    }
}
