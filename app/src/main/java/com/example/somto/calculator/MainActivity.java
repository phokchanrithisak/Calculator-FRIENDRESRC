package com.example.somto.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1=null, num2=null;
    Button add=null,sub=null,mul=null,div=null;
    TextView answer=null;
    Integer number1,number2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.number1);
        num2=(EditText)findViewById(R.id.number2);

        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);

        answer=(TextView)findViewById(R.id.Answer);

        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                number1= Integer.parseInt(num1.getText().toString().trim());
                number2= Integer.parseInt(num2.getText().toString().trim());
                result= number1+number2;

                answer.setText(" "+result);

            }
        });

        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                number1= Integer.parseInt(num1.getText().toString());
                number2= Integer.parseInt(num2.getText().toString());
                result= number1-number2;

                answer.setText(" "+result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                number1= Integer.parseInt(num1.getText().toString());
                number2= Integer.parseInt(num2.getText().toString());
                result= number1*number2;

                answer.setText(" "+result);
            }
        });

        div.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                number1= Integer.parseInt(num1.getText().toString());
                number2= Integer.parseInt(num2.getText().toString());
                result= number1/number2;


                answer.setText(" "+result);
            }
        });
    }
}
