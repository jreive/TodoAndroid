package com.example.bapti.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItems extends AppCompatActivity {

    EditText etEditItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_items);
        etEditItem = (EditText)findViewById(R.id.etEditItem);
        Intent i = getIntent();
        String t = i.getStringExtra("etEditItem");
        etEditItem.setText(t);
        //etEditItem.selectAll();
        etEditItem.setSelection(t.length());
        etEditItem.requestFocus();
        //etEditItem.setFocusable(true);
        //etEditItem.setfo
    }

    public void onSave(View v) {
        EditText etName = (EditText)findViewById(R.id.etEditItem);
        Intent i = new Intent();
        i.putExtra("return", etName.getText().toString());
        i.putExtra("pos", getIntent().getExtras().getInt("pos"));
        setResult(RESULT_OK, i);
        this.finish();
    }
}
