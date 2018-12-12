package com.example.jay.practice3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MusicActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private ArrayAdapter<String> adapter;
    private ListView musicListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        String[] musiclist = getResources().getStringArray(R.array.musiclist);
        adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, musiclist);
        musicListView = (ListView) findViewById(R.id.musicListView);
        musicListView.setAdapter(adapter);

        musicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mp == null) { // 만약, mp에게 아무런 음악 소스가 없다면, 음악 소스 설정
                    switch (position) {
                        case 0:
                            mp = MediaPlayer.create(MusicActivity.this, R.raw.happy);
                            break;
                        case 1:
                            mp = MediaPlayer.create(MusicActivity.this, R.raw.twice);
                            break;
                        case 2:
                            mp = MediaPlayer.create(MusicActivity.this, R.raw.wildflower);
                            break;
                    }
                    mpCheck();
                } else {
                    mpCheck();
                }
            }
        });
    }

    private void mpCheck() { // 음악이 현재 진행중인지 아닌지를 구분, 만약 진행중이면 두 번째 터치를 했을 때 중지를 시켜준다.
        if (!mp.isPlaying()) { // 실행 중이지 않다면, 실행을 시켜준다
            mp.start();
        } else { // 실행 중이다면 중지 시키고, mp의 값을 초기화
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.release();
            mp = null;
        }
    }
}
