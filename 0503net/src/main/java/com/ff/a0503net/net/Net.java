package com.ff.a0503net.net;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class Net {
    RequestQueue requestQueue;
    public Net(Context context) {
        //创建RequestQueue对象
        requestQueue = Volley.newRequestQueue(context);
    }

    public void get(String url, final Class classOfT, final MyResponse myResponse) {
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //创建GSON对象，把json字符串转为对象
                Gson gson = new Gson();
                Object ob= gson.fromJson(response, classOfT);
                myResponse.onResponse(ob);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                myResponse.onErrorResponse(error);
            }
        });
        requestQueue.add(stringRequest);

    }
}
