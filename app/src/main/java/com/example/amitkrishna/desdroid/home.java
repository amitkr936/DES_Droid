package com.example.amitkrishna.desdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class home extends AppCompatActivity {
    public Button submit,cancel;
    public EditText str,key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        str=(EditText) findViewById(R.id.editText);
        key=(EditText)findViewById(R.id.ekey);
        submit=(Button)findViewById(R.id.submit);
        cancel=(Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override//Cancel Button Responce
            public void onClick(View v) {
                str.setText("");
                key.setText("");
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input;
                String keys;
                input = (String)str.getText().toString();
                keys  =  (String) key.getText().toString();
                try {
                    DES d = new DES(input, keys);
                    String enc=d.showop();
                    if(enc != null)
                    {
                        Intent intent=new Intent(getBaseContext(),Result.class);
                        intent.putExtra("encry",enc);
                        startActivity(intent);
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Plese Enter a 16 Input Key and Input String",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
