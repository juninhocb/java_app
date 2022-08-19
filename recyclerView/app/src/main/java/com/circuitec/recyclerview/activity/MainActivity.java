package com.circuitec.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.circuitec.recyclerview.R;
import com.circuitec.recyclerview.RecyclerItemClickListener;
import com.circuitec.recyclerview.adapter.Adapter;
import com.circuitec.recyclerview.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Movie> listMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);


        this.createMovies();
        Adapter adapter = new Adapter(listMovies);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Movie movie = listMovies.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Item pressionado: " + movie.getTitle(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Movie movie = listMovies.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Clique longo: " + movie.getTitle(),
                                        Toast.LENGTH_SHORT
                                ).show();

                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );

    }

    public  void createMovies (){
        Movie movie = new Movie("Titulo", "2018", "Genero");
        this.listMovies.add(movie);

        movie = new Movie("Homem Aranha", "2016", "Aventura");
        this.listMovies.add(movie);

        movie = new Movie("Mulher maravilha", "2015", "Ficção");
        this.listMovies.add(movie);

        movie = new Movie("A bela e a Fera", "2012", "Romance");
        this.listMovies.add(movie);

        movie = new Movie("Palmeiras, o maior", "2011", "Esporte");
        this.listMovies.add(movie);
    }

}

