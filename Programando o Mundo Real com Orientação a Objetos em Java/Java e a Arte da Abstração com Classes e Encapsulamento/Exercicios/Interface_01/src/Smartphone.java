public class Smartphone implements VideoPlayer, MusicPlayer{

    @Override
    public void playVideo() {
        System.out.println("Smartphone is playing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Smartphone is stopping video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("The video is paused in Smartphone");
    }

    @Override
    public void Video() {

    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone is Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Smartphone is Stopping music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Smartphone is Pausing music");
    }

    @Override
    public void Music() {

    }
}
