package android.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buildings;
    private Button lunchPlaces;
    private Button coffeePlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buildings = (Button) findViewById(R.id.buildings);
        buildings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { BuildingsActivity(); }
        });

        lunchPlaces = (Button) findViewById(R.id.coffeePlaces);
        lunchPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LunchPlacesActivity();
            }
        });

        coffeePlaces = (Button) findViewById(R.id.lunchPlaces);
        coffeePlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CoffeePlacesActivity();
            }
        });


    }
    public void BuildingsActivity(){
        Intent intent = new Intent(this, BuildingsActivity.class);
        startActivity(intent);
    }

    public void LunchPlacesActivity(){
        Intent intent = new Intent(this, LunchPlacesActivity.class);
        startActivity(intent);
    }

    public void CoffeePlacesActivity(){
        Intent intent = new Intent(this, CoffeePlacesActivity.class);
        startActivity(intent);
    }
}