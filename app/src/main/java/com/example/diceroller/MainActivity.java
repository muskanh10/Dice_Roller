package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.button_roll);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView diceImage = (ImageView) findViewById(R.id.dice_image);
                Random random = new Random();
                int randomNumber = random.nextInt(7 - 1 ) + 1;
                switch(randomNumber){
                    case 1:
                        diceImage.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        diceImage.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        diceImage.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        diceImage.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        diceImage.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        diceImage.setImageResource(R.drawable.dice_6);
                        break;
                }

            }
        });
    }
}
