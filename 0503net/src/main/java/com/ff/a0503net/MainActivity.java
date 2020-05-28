package com.ff.a0503net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ff.a0503net.net.MyResponse;
import com.ff.a0503net.net.Net;
import com.ff.a0503net.pojo.Movie;

public class MainActivity extends AppCompatActivity {
    String url = "https://api.douban.com/v2/movie/in_theaters?apikey=0df993c66c0c636e29ecbb5344252a4a";

    TextView textViewTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTitle= this.findViewById(R.id.title);

        Net net = new Net(this);
        net.get(url, Movie.class, new MyResponse() {
            @Override
            public void onResponse(Object ob) {

                Movie movie = (Movie)ob;
                textViewTitle.setText(movie.getTitle());
            }

            @Override
            public void onErrorResponse(Object ob) {

            }
        });
    }
}
