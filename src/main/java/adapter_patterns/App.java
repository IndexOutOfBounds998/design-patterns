package adapter_patterns;

/**
 * Created by yang on 2019/4/15.
 */
public class App {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        AudioPlayerAdapter adapter = new AudioPlayerAdapter(audioPlayer);
        adapter.playMp3();
    }
}
