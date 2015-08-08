package loc.com.media;

import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements OnCheckedChangeListener {
    RelativeLayout re;
    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re = (RelativeLayout) findViewById(R.id.demolist);
        group = (RadioGroup) findViewById(R.id.radioGroup1);
        group.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            // noi đây chưa môt sự kiện rụng cho điện thoại của bạn
            case R.id.radioRing:
                setVolumeControlStream(AudioManager.STREAM_RING);
                break;
            case R.id.radioMedia:
                // rung  và tiếng chuôn theo kiểu mạc định
                setVolumeControlStream(AudioManager.STREAM_MUSIC);
                break;
            case R.id.radioVoice:
                setVolumeControlStream(AudioManager.STREAM_VOICE_CALL);
                break;
            case R.id.c:
                setVolumeControlStream(AudioManager.STREAM_ALARM);
                break;

        }
    }
}
