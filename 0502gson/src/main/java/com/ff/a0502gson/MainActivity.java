package com.ff.a0502gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import pojo.Movie;

public class MainActivity extends AppCompatActivity {

    TextView textViewTitle;

    private String url="https://api.douban.com/v2/movie/top250?apikey=0df993c66c0c636e29ecbb5344252a4a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTitle= this.findViewById(R.id.title);

        //创建RequestQueue对象
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        //创建StringRequest对象
        {
            String url = "https://api.douban.com/v2/movie/in_theaters?apikey=0df993c66c0c636e29ecbb5344252a4a";

            StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    //创建GSON对象，把json字符串转为对象
                    Gson gson = new Gson();
                    Movie movie= gson.fromJson(response, Movie.class);
                    textViewTitle.setText(movie.getTitle());
                  Log.e("net",movie.getTitle());

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("TAG", error.getMessage(), error);
                }
            });
            requestQueue.add(stringRequest);
        }
    }
}
