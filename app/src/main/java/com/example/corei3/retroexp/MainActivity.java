package com.example.corei3.retroexp;

import android.content.Context;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.DateFormat;
import java.util.Date;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
TextView txt;
    Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         txt=(TextView)findViewById(R.id.txt);
        btnGo=(Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getLatestEvents();

            }
        });
    }
    public void getLatestEvents() {
        Call<Example> getEventsCall;
        RequestMain main = new RequestMain();
        Data data = new Data();
        data.setCountryId("3");
        data.setUserId("0");
        Device device = new Device();
        device.setId(getUniqueDeviceId(getApplicationContext()));
        device.setTime(getCurrentDateTime());
        main.setData(data);
        main.setDevice(device);
        String json = new Gson().toJson(main);
        Log.d("json",""+json);
        Gson gson=new GsonBuilder()
                .setLenient()
                .create();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://the-365.com/admin/").client(httpClient.build()).addConverterFactory(GsonConverterFactory.create(gson)).build();
        RestInterface restInterface = retrofit.create(RestInterface.class);
        getEventsCall =restInterface.getLatestEvents(main);
        getEventsCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Log.e("REPONSE ",response.raw().toString());
                    txt.setText(response.body().getData().toString());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e("REPONSE ",t.getLocalizedMessage());

            }
        });
    }
    public static String getUniqueDeviceId(Context context) {
        return Settings.Secure
                .getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);

    }
    public static String getCurrentDateTime() {
        return DateFormat.getDateTimeInstance().format(new Date());
    }
}
