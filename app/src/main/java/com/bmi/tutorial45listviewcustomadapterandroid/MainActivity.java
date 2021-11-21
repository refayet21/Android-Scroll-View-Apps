package com.bmi.tutorial45listviewcustomadapterandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private  String[] countryNames;
    private  int[] flags={R.drawable.china,R.drawable.india,R.drawable.indonesia,R.drawable.pakistan,
            R.drawable.bangladesh,R.drawable.japan,R.drawable.philippines,R.drawable.vietnam,
            R.drawable.turkey,R.drawable.iran,R.drawable.thailand,R.drawable.myanmar,
            R.drawable.iraq,R.drawable.afghanistan,R.drawable.bhutan,R.drawable.maldives,
            R.drawable.srilanka,R.drawable.nepal,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames=getResources().getStringArray(R.array.country_names);
        listView=findViewById(R.id.listViewId);


        CustomAdapter adapter=new CustomAdapter(this,countryNames,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=countryNames[i];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();

            }
        });
    }
}