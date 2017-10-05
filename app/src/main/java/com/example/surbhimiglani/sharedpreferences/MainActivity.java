package com.example.surbhimiglani.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText) findViewById(R.id.editText);
        editText2=(EditText) findViewById(R.id.editText2);
        textView3=(TextView) findViewById(R.id.textView3);




    }

    public void Save(View view){
        SharedPreferences sp=getSharedPreferences("userInfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor=sp.edit();
        editor.putString("username", editText.getText().toString());
        editor.putString("password", editText2.getText().toString());
        editor.apply();

        Toast.makeText(this, "SAVED!" , Toast.LENGTH_LONG).show();
    }

    public void Display(View view){
      /*  SharedPreferences sp=getSharedPreferences("userInfo", Context.MODE_PRIVATE);

        String name=sp.getString("username", "");
        String pw=sp.getString("password", "");
        textView3.setText(name+" "+pw);  */

        if(editText.getText().toString().equals("Flower")){
            Path.setPath(getApplicationContext(), "1");
        }
        else
        if(editText.getText().toString().equals("Arrow")){
            Path.setPath(getApplicationContext(), "2");
        }
        else
        if(editText.getText().toString().equals("draw")){
            Path.setPath(getApplicationContext(), "3");
        }


        Intent abc=new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(abc);

    }





}
