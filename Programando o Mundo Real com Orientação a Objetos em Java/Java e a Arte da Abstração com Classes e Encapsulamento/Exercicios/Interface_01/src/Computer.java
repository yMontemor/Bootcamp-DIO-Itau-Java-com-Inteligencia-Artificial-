public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("The computer is playing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("The computer is stopping video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("The computer is paused");
    }

    @Override
    public void Video() {

    }

    @Override
    public void playMusic() {
        System.out.println("The computer is playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("The computer is stopping music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("The computer is paused music");
    }

    @Override
    public void Music() {

    }
}
