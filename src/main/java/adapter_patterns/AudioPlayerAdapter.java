package adapter_patterns;

/**
 * Created by yang on 2019/4/15.
 */
public class AudioPlayerAdapter implements AdvancedMediaPlayer {

    MediaPlayer mediaPlayer;

    public AudioPlayerAdapter(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void playMp3() {
        mediaPlayer.playMp3();
    }

    public void playMp4() {

    }
}
