package PR_260124_260125;

interface Playable {
void play();
}


class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }
}


public class PlayMain {
    public static void main(String[] args) {
        Playable myPlayer = new MusicPlayer();
        myPlayer.play();
    }
}