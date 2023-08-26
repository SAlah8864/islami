package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resulttv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);

        resulttv=findViewById(R.id.result);

         




    }
    public void onDigitclick(View v){
          Button button=(Button)v;
          resulttv.append(button.getText());


    }

    String operator="";
    String LHS="";
   public void clickedonoperator(View v){
        Button button=(Button) v;
        if(operator.isEmpty()){
            operator=button.getText().toString();
            LHS= resulttv.getText().toString();
           resulttv.setText(null);
            Log.e("MainActivity","operatoe  "+operator+", LHS: "+LHS );


        }else{
            String RHS=resulttv.getText().toString();
        double res=calculate(LHS,operator,RHS);
            Log.e("Main-clickedonoperator","result  "+res);
            LHS=res+"";
           operator=button.getText().toString();
            resulttv.setText("");


        }





   }
   public double calculate(String LHS,String operator,String RHS){
          Double lhs=new Double(LHS);
          Double rhs=new Double(RHS);
          if(operator.equals("+")){
              return lhs+rhs;

          }else if(operator.equals("-")){
              return lhs-rhs;

          }else if(operator.equals("*")){
              return lhs*rhs;

          }else{
              return lhs/rhs;

          }



   }
   public void onequal(View v){
      String RHS=resulttv.getText().toString();
      double res=calculate(LHS,operator,RHS);
      resulttv.setText(res+"");
       operator="";
       LHS="";


   }


}