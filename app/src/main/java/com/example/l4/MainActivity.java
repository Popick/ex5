package com.example.l4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView a1,a2,b1,b2,c1,c2;
    ImageView a4,b4,c4;
    EditText a3,b3,c3;
    Button a5,b5,c5;

    int fine=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a4 = (ImageView)findViewById(R.id.a4);
        b4 = (ImageView)findViewById(R.id.b4);
        c4 = (ImageView)findViewById(R.id.c4);

        a1 = (TextView)findViewById(R.id.a1);
        a2 = (TextView)findViewById(R.id.a2);

        b1 = (TextView)findViewById(R.id.b1);
        b2 = (TextView)findViewById(R.id.b2);

        c1 = (TextView)findViewById(R.id.c1);
        c2 = (TextView)findViewById(R.id.c2);

        a3 = (EditText)findViewById(R.id.a3);
        b3 = (EditText)findViewById(R.id.b3);
        c3 = (EditText)findViewById(R.id.c3);

        a5 = (Button)findViewById(R.id.a5);
        b5 = (Button)findViewById(R.id.b5);
        c5 = (Button)findViewById(R.id.c5);

        a1.setText(((int)(Math.random() * 89) + 10)+"");
        a2.setText(((int)(Math.random() * 89) + 10)+"");

        b1.setText("?");
        b2.setText("?");

        c1.setText("?");
        c2.setText("?");

        b5.setEnabled(false);
        b3.setEnabled(false);
        c5.setEnabled(false);
        c3.setEnabled(false);


    }


    public void check_a(View view) {
        if(TextUtils.isEmpty(a3.getText())){
            a3.setError("Invalid");
        }else{
            int a3num = Integer.parseInt(a3.getText().toString());
            int a1num = Integer.parseInt(a1.getText().toString());
            int a2num = Integer.parseInt(a2.getText().toString());

            if (a3num == a1num+a2num) {
                a4.setImageResource(R.drawable.v);
                b1.setText(a3num+"");
                fine++;
            }else{
                a4.setImageResource(R.drawable.x);
                b1.setText(a1num+a2num+"");
            }
            b2.setText(((int)(Math.random() * 89) + 10)+"");
            a5.setEnabled(false);
            a3.setEnabled(false);
            b5.setEnabled(true);
            b3.setEnabled(true);
        }
    }

    public void check_b(View view) {
        if(TextUtils.isEmpty(b3.getText())){
            b3.setError("Invalid");
        }else{
            int a3num = Integer.parseInt(b3.getText().toString());
            int a1num = Integer.parseInt(b1.getText().toString());
            int a2num = Integer.parseInt(b2.getText().toString());

            if (a3num == a1num+a2num) {
                b4.setImageResource(R.drawable.v);
                fine++;
            }else{
                b4.setImageResource(R.drawable.x);
            }
            c1.setText(a1num+a2num+"");
            c2.setText(((int)(Math.random() * 89) + 10)+"");
            b5.setEnabled(false);
            b3.setEnabled(false);
            c5.setEnabled(true);
            c3.setEnabled(true);
        }
    }

    public void check_c(View view) {
        if(TextUtils.isEmpty(c3.getText())){
            c3.setError("Invalid");
        }else{
            int a3num = Integer.parseInt(c3.getText().toString());
            int a1num = Integer.parseInt(c1.getText().toString());
            int a2num = Integer.parseInt(c2.getText().toString());

            if (a3num == a1num+a2num) {
                c4.setImageResource(R.drawable.v);
                fine++;
            }else{
                c4.setImageResource(R.drawable.x);
            }
            c5.setEnabled(false);
            c3.setEnabled(false);
            Toast.makeText(this, "You answered "+fine+"/3 correct", Toast.LENGTH_LONG).show();
        }
    }


    public void restart(View view) {
        b5.setEnabled(false);
        b3.setEnabled(false);
        c5.setEnabled(false);
        c3.setEnabled(false);
        a5.setEnabled(true);
        a3.setEnabled(true);
        a1.setText(((int)(Math.random() * 89) + 10)+"");
        a2.setText(((int)(Math.random() * 89) + 10)+"");
        a3.setText("");
        b1.setText("?");
        b2.setText("?");
        b3.setText("");
        c1.setText("?");
        c2.setText("?");
        c3.setText("");

        a4.setImageResource(0);
        b4.setImageResource(0);
        c4.setImageResource(0);

        fine=0;
    }
}



