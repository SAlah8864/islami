package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView player1score;
    TextView player2score;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;


ArrayList<String>board;
    public void intializeboard(){
        board=new ArrayList<>();
        for (int i=0;i<9;i++){
            board.add("");
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeboard();
        player1score=findViewById(R.id.player1_Score);
        player2score=findViewById(R.id.player2_Score);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);





    }

    int counter=0;
    public void clickedbuton(View v){
        Button clickedbutton=(Button) v;
        if(clickedbutton.getText().equals("x"))return;
        if(clickedbutton.getText().equals("o"))return;
        String sympol=counter%2==0?"x":"o";
        clickedbutton.setText(sympol);
        filllist(clickedbutton.getId(),sympol);
       if( chickwinner(sympol)){
        if (sympol.equals("x")){
            int currentscore1=new Integer(player1score.getText().toString());
            player1score.setText(++currentscore1+"");
            restpoard();
        }else {
            int currentscore2 = new Integer(player2score.getText().toString());
            player2score.setText(++currentscore2 + "");
            restpoard();
        }}

        counter++;
       if(counter==10){
           restpoard();
       }




    }
    public boolean chickwinner(String sympol){
        for (int i=0;i<3;i+=3) {
            if (board.get(i) == sympol && board.get(i + 1) == sympol && board.get(i + 2) == sympol) {
                return true;
            }
        }
            for (int j=0;j<3;j+=1){
                if (board.get(j)==sympol&&board.get(j+3)==sympol&&board.get(j+6)==sympol){
                    return true;
                }

        }
            if (board.get(0)==sympol&&board.get(4)==sympol&&board.get(8)==sympol){return true;}
            if (board.get(2)==sympol&&board.get(4)==sympol&&board.get(6)==sympol){return true;}


        return false;
    }

public void restpoard() {
    counter = 0;
    intializeboard();
    b1.setText("");
    b2.setText("");
    b3.setText("");
    b6.setText("");b4.setText("");b5.setText("");
    b7.setText("");
    b8.setText("");
    b9.setText("");





}


    public void filllist(int id,String sympol){
        if(id==R.id.button1){
            board.add(0,sympol);
        }
       else if(id==R.id.button2){
            board.add(1,sympol);
        }
        else if(id==R.id.button3){
            board.add(2,sympol);
        }
        else if(id==R.id.button4){
            board.add(3,sympol);
        }
        else if(id==R.id.button5){
            board.add(4,sympol);
        }
        else if(id==R.id.button6){
            board.add(5,sympol);
        }
        else if(id==R.id.button7){
            board.add(6,sympol);
        }
        else if(id==R.id.button8){
            board.add(7,sympol);
        }
        else if(id==R.id.button9){
            board.add(8,sympol);
        }


    }

}