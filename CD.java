

public class CD implements Packable{
    private String artist;
    private String name;
    private int published;
    private double weight = 0.1;
    
    public CD(String artist, String name, int published){
        this.artist = artist;
        this.name = name;        
        this.published = published;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.name + " (" + this.published + ")";
    }

    @Override
    public double weight() {
        return this.weight;
    }


}
