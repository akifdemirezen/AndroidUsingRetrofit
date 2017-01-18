package com.example.akif.projem.remote;

import com.example.akif.projem.Example;
import com.example.akif.projem.USER;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by akif on 18.1.2017.
 */

public interface ApiService  {

     String Base_Url="http://10.0.2.2:8000/";

    @GET("getUser") Call<Example> getalluser() ;

    class Factory{
      private static ApiService service;

      public static ApiService getInstance(){
          if (service==null){

              Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(Base_Url).build();

              service=retrofit.create(ApiService.class);
              return service;


          }else{
              return service;
          }


      }

  }

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Base_Url)
            .build();

    ApiService service = retrofit.create(ApiService.class);

}
