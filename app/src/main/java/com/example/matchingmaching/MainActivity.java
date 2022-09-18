package com.example.matchingmaching;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView player1,player2;
    ImageView im_1,im_2,im_3,im_4,im_11,im_12,im_13,im_14,im_21,im_22,im_23,im_24;
    // array for the images
    Integer[] cardsArray = {101, 102,103,104,105,106,201,202,203,204,205,206};

    // actual images
    int image101,image102,image103,image104,image105,image106,image201,image202,image203,image204,image205,image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber =1;

    int turn =1;

    int playerPoints = 0, cpuPoints =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1 = findViewById(R.id.plid_1);
        player2 = findViewById(R.id.plid_2);

        im_1 = findViewById(R.id.im_1);
        im_2 = findViewById(R.id.im_2);
        im_3 = findViewById(R.id.im_3);
        im_4 = findViewById(R.id.im_4);
        im_11 = findViewById(R.id.im_11);
        im_12 = findViewById(R.id.im_12);
        im_13 = findViewById(R.id.im_13);
        im_14 = findViewById(R.id.im_14);
        im_21 = findViewById(R.id.im_21);
        im_22 = findViewById(R.id.im_22);
        im_23 = findViewById(R.id.im_23);
        im_24 = findViewById(R.id.im_24);

        im_1.setTag("0");
        im_2.setTag("1");
        im_3.setTag("2");
        im_4.setTag("3");
        im_11.setTag("4");
        im_12.setTag("5");
        im_13.setTag("6");
        im_14.setTag("7");
        im_21.setTag("8");
        im_22.setTag("9");
        im_23.setTag("10");
        im_24.setTag("11");

        //load he card images
        frontOfCardResources();
        Collections.shuffle(Arrays.asList(cardsArray));

        //changing the colourof the second player(inactive)
        player2.setTextColor(Color.GRAY);


        im_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_1,theCard);

            }
        });
        im_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_2,theCard);

            }
        });
        im_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_3,theCard);

            }
        });
        im_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_4,theCard);

            }
        });
        im_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_11,theCard);

            }
        });
        im_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_12,theCard);

            }
        });
        im_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_13,theCard);

            }
        });
        im_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_14,theCard);

            }
        });
        im_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_21,theCard);

            }
        });
        im_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_22,theCard);

            }
        });
        im_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_23,theCard);

            }
        });
        im_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(im_24,theCard);

            }
        });



    }
    private void doStuff(ImageView iv, int card){

        //set the correct image to the imageview
        if(cardsArray[card] == 101){
            iv.setImageResource(image101);
        }else if(cardsArray[card] == 102){
            iv.setImageResource(image102);
        }else if(cardsArray[card] == 103){
            iv.setImageResource(image103);
        }else if(cardsArray[card] == 104){
            iv.setImageResource(image104);
        }else if(cardsArray[card] == 105){
            iv.setImageResource(image105);
        }else if(cardsArray[card] == 106){
            iv.setImageResource(image106);
        }else if(cardsArray[card] == 201){
            iv.setImageResource(image201);
        }else if(cardsArray[card] == 202){
            iv.setImageResource(image202);
        }else if(cardsArray[card] == 203){
            iv.setImageResource(image203);
        }else if(cardsArray[card] == 204){
            iv.setImageResource(image204);
        }else if(cardsArray[card] == 205){
            iv.setImageResource(image205);
        }else if(cardsArray[card] == 206){
            iv.setImageResource(image206);
        }


        //check which image is selected and save it to temporary variable
        if(cardNumber == 1){

            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if(cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard  = secondCard  - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            im_1.setEnabled(false);
            im_2.setEnabled(false);
            im_3.setEnabled(false);
            im_4.setEnabled(false);
            im_11.setEnabled(false);
            im_12.setEnabled(false);
            im_13.setEnabled(false);
            im_14.setEnabled(false);
            im_21.setEnabled(false);
            im_22.setEnabled(false);
            im_23.setEnabled(false);
            im_24.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected images are equal
                    calculate();
                }
            },1000);
        }

    }

    private void calculate(){
        //if images are equal remove them and add point
        if(firstCard == secondCard) {
            if (clickedFirst == 0) {
                im_1.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                im_2.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                im_3.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                im_4.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                im_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                im_12.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                im_13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                im_14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                im_21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                im_22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                im_23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                im_24.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0) {
                im_1.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                im_2.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                im_3.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                im_4.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                im_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                im_12.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                im_13.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                im_14.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                im_21.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                im_22.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                im_23.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                im_24.setVisibility(View.INVISIBLE);
            }

            //adding points to the correct player
            if (turn == 1) {
                playerPoints++;
                player1.setText(" Player1  \n      " + playerPoints);
            } else if (turn == 2) {
                cpuPoints++;
                player2.setText(" Player2  \n      " + cpuPoints);
            }

        }else{

                im_1.setImageResource(R.drawable.back);
                im_2.setImageResource(R.drawable.back);
                im_3.setImageResource(R.drawable.back);
                im_4.setImageResource(R.drawable.back);
                im_11.setImageResource(R.drawable.back);
                im_12.setImageResource(R.drawable.back);
                im_13.setImageResource(R.drawable.back);
                im_14.setImageResource(R.drawable.back);
                im_21.setImageResource(R.drawable.back);
                im_22.setImageResource(R.drawable.back);
                im_23.setImageResource(R.drawable.back);
                im_24.setImageResource(R.drawable.back);

                //changing the player turn
                if(turn == 1){
                    turn =2;
                    player1.setTextColor(Color.GRAY);
                    player2.setTextColor(Color.BLACK);
                }else if(turn == 2){
                    turn =1;
                    player2.setTextColor(Color.GRAY);
                    player1.setTextColor(Color.BLACK);
                }

            }
        im_1.setEnabled(true);
        im_2.setEnabled(true);
        im_3.setEnabled(true);
        im_4.setEnabled(true);
        im_11.setEnabled(true);
        im_12.setEnabled(true);
        im_13.setEnabled(true);
        im_14.setEnabled(true);
        im_21.setEnabled(true);
        im_22.setEnabled(true);
        im_23.setEnabled(true);
        im_24.setEnabled(true);

        //check if the game is over
        checkEnd();


    }
    public void checkEnd(){
        if(im_1.getVisibility() == View.INVISIBLE &&
           im_2.getVisibility() == View.INVISIBLE &&
           im_3.getVisibility() == View.INVISIBLE &&
           im_4.getVisibility() == View.INVISIBLE &&
           im_11.getVisibility() == View.INVISIBLE &&
           im_12.getVisibility() == View.INVISIBLE &&
           im_13.getVisibility() == View.INVISIBLE &&
           im_14.getVisibility() == View.INVISIBLE &&
           im_21.getVisibility() == View.INVISIBLE &&
           im_22.getVisibility() == View.INVISIBLE &&
           im_23.getVisibility() == View.INVISIBLE &&
           im_24.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

            alertDialogBuilder.setMessage("Gamer Over!\nPlayer1 : " + playerPoints + "\nPlayer2 : " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

    }
    public void frontOfCardResources(){
        image101 = R.drawable.im_101;
        image102 = R.drawable.im_102;
        image103 = R.drawable.im_103;
        image104 = R.drawable.im_104;
        image105 = R.drawable.im_105;
        image106 = R.drawable.im_106;
        image201 = R.drawable.im_201;
        image202 = R.drawable.im_202;
        image203 = R.drawable.im_203;
        image204 = R.drawable.im_204;
        image205 = R.drawable.im_205;
        image206 = R.drawable.im_206;
    }
}