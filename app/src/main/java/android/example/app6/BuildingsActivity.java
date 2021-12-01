package android.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuildingsActivity extends AppCompatActivity {
    private Button scienceHall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildings);

        scienceHall = findViewById(R.id.scienceHall);
        scienceHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { ScienceHall(); }
        });
    }
    public void ScienceHall(){
        Intent intent = new Intent(this, ScienceHallActivity.class);
        startActivity(intent);
    }
}