package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receiveListActivity = getIntent();
        int randomInt = receiveListActivity.getIntExtra("randInt",0);


        User user1 = new User("Dalbert " + randomInt, "i touch cats\ni eat chicken\nMAD is a good module", 1, false);

        Button followBtn = findViewById(R.id.followBtn);
        Button messageBtn = findViewById(R.id.messageBtn);
        TextView username = findViewById(R.id.username);
        username.setText(user1.Name);
        TextView desc = findViewById(R.id.desc);
        desc.setText(user1.Description);

        followBtn.setText(user1.Followed ? "Unfollow" : "Follow");
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (followBtn.getText() == "Follow")    //followBtn.setText(user1.Followed ? "Unfollow" : "Follow")
                {
                    followBtn.setText("Unfollow");
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    followBtn.setText("Follow");
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
                user1.Followed = !user1.Followed;
            }
        });

        messageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent messageGroup = new Intent(MainActivity.this, MessageGroup.class);
                startActivity(messageGroup);
            }
        });
    }
}