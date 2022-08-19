package com.circuitec.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.circuitec.cardview.R;
import com.circuitec.cardview.adapter.PostAdapter;
import com.circuitec.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPost;
    private List<Post> post = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPost = findViewById(R.id.recyclerView);

        //define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPost.setLayoutManager(layoutManager);
        preparePost();
        //define com.circuitec.cardview.adapter
        PostAdapter adapter = new PostAdapter(post);
        recyclerPost.setAdapter(adapter);

    }

    public void preparePost (){
        Post p = new Post("Viagem do PI", "#TBT viagem legal", R.drawable.imagem1);
        this.post.add(p);

        p = new Post("Viagem do Sanzao", "#TBT viagem legal", R.drawable.imagem2);
        this.post.add(p);


        p = new Post("Viagem do PI e do San", "#TBT viagem legal", R.drawable.imagem3);
        this.post.add(p);


        p = new Post("Viagem do San", "#TBT viagem legal", R.drawable.imagem4);
        this.post.add(p);
    }
}