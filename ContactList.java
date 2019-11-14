package com.example.ancho.mobtimetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Sample framework for the Contact List development
public class ContactList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        //to create the add button on the homepage
        Button contactEdit = (Button) findViewById(R.id.add);
        contactEdit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), AddEntry.class);
                startActivity(intent);
            /* Inner class that defines the table contents */


            }
        });

        //to create the delete button on the homepage
        Button deleteModCode = (Button) findViewById(R.id.remove);
        deleteModCode.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), deleteEntry.class);
                startActivity(intent);
            /* Inner class that defines the table contents */


            }
        });

        //to create the view button on the homepage
        Button viewTime = (Button) findViewById(R.id.viewTimeTable);
        viewTime.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ViewContact.class);
                startActivity(intent);
            /* Inner class that defines the table contents */


            }
        });

    }
}
