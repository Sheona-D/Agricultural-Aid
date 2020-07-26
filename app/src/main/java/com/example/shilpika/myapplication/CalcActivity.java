package com.example.shilpika.myapplication;

//import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends AppCompatActivity {

    EditText val;
    Button add,subtract,confirm;
    double Value1=0.0;
    double Value2 = 1.0;
    double new_val;
    double dap,mop,urea,final_val1, final_val2, final_val3;
    TextView txt1;
    TextView txt2;
    TextView txt3, txt4;
    int intValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        val = findViewById(R.id.editText);
        add = findViewById(R.id.button2);
        subtract = findViewById(R.id.button);
        confirm = findViewById(R.id.button3);
        txt1=findViewById(R.id.textView);
        txt2=findViewById(R.id.textView5);
        txt3=findViewById(R.id.textView6);
        txt4=findViewById(R.id.textView8);

        val.setText(Value1+ "");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Value1 = Float.parseFloat(val.getText() + "");
                val.setText(Value1+Value2+ "");
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Value1 = Float.parseFloat(val.getText() + "");
                val.setText(Value1-Value2+ "");
            }
        });

        Intent mIntent = getIntent();
        intValue = mIntent.getIntExtra("intVariableName", 0);

        if(intValue == R.id.imageButton2)
        {
            ImageButton myButton = (ImageButton) findViewById(R.id.imageButton);
            myButton.setImageResource(R.drawable.tomato);
            txt4.setVisibility(View.VISIBLE);
            String leaf= "Tomato";
            txt4.setText(leaf);
        }

        else if(intValue == R.id.imageButton3)
        {
            ImageButton myButton = (ImageButton) findViewById(R.id.imageButton);
            myButton.setImageResource(R.drawable.potato);
            txt4.setVisibility(View.VISIBLE);
            String leaf= "Potato";
            txt4.setText(leaf);
        }

        else if(intValue == R.id.imageButton4)
        {
            ImageButton myButton = (ImageButton) findViewById(R.id.imageButton);
            myButton.setImageResource(R.drawable.orange);
            txt4.setVisibility(View.VISIBLE);
            String leaf= "Orange";
            txt4.setText(leaf);
        }

        else if(intValue == R.id.imageButton5)
        {
            ImageButton myButton = (ImageButton) findViewById(R.id.imageButton);
            myButton.setImageResource(R.drawable.corn);
            txt4.setVisibility(View.VISIBLE);
            String leaf= "Corn";
            txt4.setText(leaf);
        }

        else if(intValue == R.id.imageButton6)
        {
            ImageButton myButton = (ImageButton) findViewById(R.id.imageButton);
            myButton.setImageResource(R.drawable.cotton);
            txt4.setVisibility(View.VISIBLE);
            String leaf= "Cotton";
            txt4.setText(leaf);
        }


        /* confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text =val.getText().toString();
                new_val=Double.parseDouble(text);
                Toast toast=Toast.makeText(MainActivity.this,""+new_val,Toast.LENGTH_LONG);
                toast.show();;
            }
        });

         */
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                {
                    if(intValue == R.id.imageButton2)
                    {
                        dap=132.0;
                        mop=83.0;
                        urea=100.0;
                        String text =val.getText().toString();
                        new_val=Double.parseDouble(text);
                        final_val1=dap*new_val;
                        String final_string1= Double.toString(final_val1);
                        txt1.setVisibility(View.VISIBLE);
                        txt1.setText(final_string1);


                        final_val2=mop*new_val;
                        String final_string2= Double.toString(final_val2);
                        txt2.setVisibility(View.VISIBLE);
                        txt2.setText(final_string2);


                        final_val3=urea*new_val;
                        String final_string3= Double.toString(final_val3);
                        txt3.setVisibility(View.VISIBLE);
                        txt3.setText(final_string3);



                    }

                    else if(intValue == R.id.imageButton3)
                    {
                        dap=130.0;
                        mop=200.0;
                        urea=275.0;
                        String text =val.getText().toString();
                        new_val=Double.parseDouble(text);
                        final_val1=dap*new_val;
                        String final_string1= Double.toString(final_val1);
                        txt1.setVisibility(View.VISIBLE);
                        txt1.setText(final_string1);


                        final_val2=mop*new_val;
                        String final_string2= Double.toString(final_val2);
                        txt2.setVisibility(View.VISIBLE);
                        txt2.setText(final_string2);


                        final_val3=urea*new_val;
                        String final_string3= Double.toString(final_val3);
                        txt3.setVisibility(View.VISIBLE);
                        txt3.setText(final_string3);



                    }

                    else if(intValue == R.id.imageButton4)
                    {
                        dap=652.0;
                        mop=1.0;
                        urea=1.0;
                        String text =val.getText().toString();
                        new_val=Double.parseDouble(text);
                        final_val1=dap*new_val;
                        String final_string1= Double.toString(final_val1);
                        txt1.setVisibility(View.VISIBLE);
                        txt1.setText(final_string1);


                        final_val2=mop*new_val;
                        String final_string2= Double.toString(final_val2);
                        txt2.setVisibility(View.VISIBLE);
                        txt2.setText(final_string2);


                        final_val3=urea*new_val;
                        String final_string3= Double.toString(final_val3);
                        txt3.setVisibility(View.VISIBLE);
                        txt3.setText(final_string3);



                    }

                    else if(intValue == R.id.imageButton5)
                    {
                        dap=109;
                        mop=83;
                        urea=175;
                        String text =val.getText().toString();
                        new_val=Double.parseDouble(text);
                        final_val1=dap*new_val;
                        String final_string1= Double.toString(final_val1);
                        txt1.setVisibility(View.VISIBLE);
                        txt1.setText(final_string1);


                        final_val2=mop*new_val;
                        String final_string2= Double.toString(final_val2);
                        txt2.setVisibility(View.VISIBLE);
                        txt2.setText(final_string2);


                        final_val3=urea*new_val;
                        String final_string3= Double.toString(final_val3);
                        txt3.setVisibility(View.VISIBLE);
                        txt3.setText(final_string3);



                    }
                    else if(intValue == R.id.imageButton6)
                    {
                        dap=113.0;
                        mop=100.0;
                        urea=282.0;
                        String text =val.getText().toString();
                        new_val=Double.parseDouble(text);
                        final_val1=dap*new_val;
                        String final_string1= Double.toString(final_val1);
                        txt1.setVisibility(View.VISIBLE);
                        txt1.setText(final_string1);


                        final_val2=mop*new_val;
                        String final_string2= Double.toString(final_val2);
                        txt2.setVisibility(View.VISIBLE);
                        txt2.setText(final_string2);


                        final_val3=urea*new_val;
                        String final_string3= Double.toString(final_val3);
                        txt3.setVisibility(View.VISIBLE);
                        txt3.setText(final_string3);



                    }
                }
            }
        });

    }
}