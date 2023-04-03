package kr.ac.yeonsung.seoj.mobile1project_1205_01;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    //리스너로 사용될 애들 먼저 필드로 선언
    MediaPlayer player;
    Switch switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = findViewById(R.id.switch1);
        player = MediaPlayer.create(this, R.raw.music01);
        switch1.setOnCheckedChangeListener(switchL);
    }
    CompoundButton.OnCheckedChangeListener switchL = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            // b = switch가 체크되면 true
            if(isChecked){
                player.start();
            }else{
                player.stop();
            }
        }
    };
}