public class Song implements Reproducible{

    private String name;
    private String artist;


    public void play(){
        System.out.println("sonando");
    }

    public void stop(){
        System.out.println("sonando");
    }

    public void pause(){
        System.out.println("se esta pausando");
    }
}