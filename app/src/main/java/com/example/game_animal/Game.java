package com.example.game_animal;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final ImageView selectpig = (ImageView) this.findViewById(R.id.imgView_pig);
        selectpig.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent intent = new Intent(Game.this, End_Pass.class);
                startActivity(intent);
            }
        });


        final ImageView selecttiger = (ImageView) this.findViewById(R.id.imgView_tiger);
        selecttiger.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent intent = new Intent(Game.this, End_Lose.class);
                startActivity(intent);
            }
        });
    }
}
