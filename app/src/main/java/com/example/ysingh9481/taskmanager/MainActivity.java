package com.example.ysingh9481.taskmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // list of member variables
    ArrayList items = new ArrayList<String>();

    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items.add("jvghchcg");
        myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        ListView mylistView = (ListView)findViewById(R.id.listView);

        mylistView.setAdapter(myAdapter);
    }

    void addTask(View v){
        // add the text from the text field to tak list
        EditText textbox = (EditText)findViewById(R.id.taskName);
        String text = textbox.getText().toString();
        if(text != "") {
            items.add(text);
            myAdapter.notifyDataSetChanged();
            textbox.setText("");
        }
        else{

        }
    }
}


