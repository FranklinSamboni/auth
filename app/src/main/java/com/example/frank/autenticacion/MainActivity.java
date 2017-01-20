package com.example.frank.autenticacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.frank.autenticacion.ApiClient.ApiClient;
import com.example.frank.autenticacion.ApiClient.ApiInterface;
import com.example.frank.autenticacion.Model.auth;

import java.io.Console;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String user = "pruebas";
        String pass =  "gonzalo";

        Map<String, String> data = new HashMap<>();
        data.put("contrasenia", pass);
        data.put("nombreUsuario", user);

        ApiInterface apiSer = ApiClient.getClient().create(ApiInterface.class);
        Call<auth> call = apiSer.autenticateUser(data);
        call.enqueue(new Callback<auth>() {
            @Override
            public void onResponse(Call<auth> call, Response<auth> response) {
                Boolean result = response.body().isRespuesta();
                if(result){
                    Log.i("resultado","true");
                }
                else{
                    Log.i("resultado","false");
                }

            }

            @Override
            public void onFailure(Call<auth> call, Throwable t) {
                Log.e("Fallo",t.toString());
            }
        });

    }
}
