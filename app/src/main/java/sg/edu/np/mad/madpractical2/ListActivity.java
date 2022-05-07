package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView list_icon = findViewById(R.id.list_icon);
        list_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder imageAB = new AlertDialog.Builder(ListActivity.this);

                imageAB.setTitle("Profile");
                imageAB.setMessage("MADness");
                imageAB.setCancelable(true);
                imageAB.setPositiveButton("View", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id)
                    {
                        Intent mainActivity = new Intent(ListActivity.this, MainActivity.class);
                        Random randomInt = new Random();
                        int randInt = randomInt.nextInt(1000000000);
                        mainActivity.putExtra("randInt", randInt);
                        startActivity(mainActivity);
                    }
                });
                imageAB.setNegativeButton("Close", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id)
                    {
                    }
                });

                AlertDialog imageAlert = imageAB.create();
                imageAB.show();

            }
        });
    }
}