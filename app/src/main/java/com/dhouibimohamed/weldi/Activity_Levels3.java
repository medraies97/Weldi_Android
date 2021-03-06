package com.dhouibimohamed.weldi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Activity_Levels3 extends AppCompatActivity {
    Button beginner;
    Button intermediate;
    Button expert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__levels3);
        setTitle("Hardware Levels");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        beginner=findViewById(R.id.beginner);
        intermediate=findViewById(R.id.intermediate);
        expert=findViewById(R.id.expert);
        Intent iin= getIntent();
        Bundle b=iin.getExtras();
        final String tableName;
        if(b!=null){
            tableName=(String)b.get("table_name");
            Log.d("Table Name",tableName);
        }
        else
        {
            tableName="";
        }
        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Main2ActivitySec3.class);
                i.putExtra("table_name",tableName);
                i.putExtra("level_name","B");
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });
        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Main2ActivitySec3.class);
                i.putExtra("table_name",tableName);
                i.putExtra("level_name","I");
                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });
        expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Main2ActivitySec3.class);
                i.putExtra("table_name",tableName);
                i.putExtra("level_name","E");

                startActivity(i);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
            }
        });
    }
}
