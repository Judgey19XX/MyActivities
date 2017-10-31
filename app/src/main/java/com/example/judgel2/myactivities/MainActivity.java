package com.example.judgel2.myactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_MAKE = "keyMake";
    public static final String KEY_YEAR = "keyYear";
    public static final String KEY_COLOR = "keyColor";
    public static final String KEY_NOTE = "keyNote";
    private static final int REQUEST_EDIT = 1234;

    private EditText editTextMake;
    private EditText editTextYear;
    private EditText editTextColor;
    private EditText editTextNote;

    public void goEdit(View v) {
        Intent intentEdit = new Intent(this, noteEditingActivity.class);
        startActivityForResult(intentEdit, REQUEST_EDIT);
    }

    public void goDisplay(View v){
        Intent intentDisplay = onNewIntent();
        
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMake = (EditText) findViewById(R.id.inputMake);
        editTextYear = (EditText) findViewById(R.id.inputYear);
        editTextColor = (EditText) findViewById(R.id.inputColor);
        editTextNote = (EditText) findViewById(R.id.inputNote);
    }
}
