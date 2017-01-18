package com.example.akif.projem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.akif.projem.remote.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

     TextView tid,tusername,tname,tsurname,tage,ttel,til,tilce;
     Button butonverilerigoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tid = (TextView) findViewById(R.id.t_id);
        tusername = (TextView) findViewById(R.id.t_username);
        tname = (TextView) findViewById(R.id.t_name);
        tsurname = (TextView) findViewById(R.id.t_surname);
        tage = (TextView) findViewById(R.id.t_age);
        ttel = (TextView) findViewById(R.id.t_tel);
        til = (TextView) findViewById(R.id.t_il);
        tilce=(TextView)findViewById(R.id.t_ilce);
        butonverilerigoster = (Button) findViewById(R.id.butonusergetir);

        butonverilerigoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    public void run() {

                        ApiService.Factory.getInstance().getalluser().enqueue(new Callback<Example>() {
                            @Override
                            public void onResponse(Call<Example> call, Response<Example> response) {

                                tid.setText(response.body().getDataList().get(0).getId());
                                tusername.setText(response.body().getDataList().get(0).getUsername());
                                tname.setText(response.body().getDataList().get(0).getName());
                                tsurname.setText(response.body().getDataList().get(0).getSurname());
                                tage.setText(response.body().getDataList().get(0).getAge());
                                ttel.setText(response.body().getDataList().get(0).getTel());
                                til.setText(response.body().getDataList().get(0).getLocationId().getIl());
                                tilce.setText(response.body().getDataList().get(0).getLocationId().getIlce());

                            }

                            @Override
                            public void onFailure(Call<Example> call, Throwable t) {

                            }

                        });

                    }
                }).start();  //Runnable
            }
        }); //Setonclicklistener
    }
}