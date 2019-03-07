package com.example.a20140550.mycal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText num1,num2;
    private Button btnAdd,btnSub;
    private TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.txtnum1);
        num2=(EditText)findViewById(R.id.txtnum2);

        btnAdd=(Button) findViewById(R.id.AddID);
        btnSub=(Button) findViewById(R.id.SubID);

        txtresult=(TextView)findViewById(R.id.txtOutput);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {

        try{
            String n1=num1.getText().toString();
            String n2=num2.getText().toString();

            //convert Double

            double n11=Double.parseDouble(n1);
            double n22=Double.parseDouble(n2);

            if(v.getId()==R.id.AddID){
                double sum=n11 +n22;
                txtresult.setText("Result Sum "+ sum);
            }
            if(v.getId()==R.id.SubID){
                double sub=n11 - n22;
                txtresult.setText("Result Sub "+ sub);
            }


        }
        catch(Exception ex)
        {

            Toast.makeText(MainActivity.this,"Please Enter the Number",Toast.LENGTH_SHORT).show();
        }





    }
}
