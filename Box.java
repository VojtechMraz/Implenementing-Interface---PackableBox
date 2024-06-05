import java.util.ArrayList;


public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double maximumCapacity){
        this.capacity = maximumCapacity;
        this.list = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(this.weight() + item.weight() <= this.capacity){
            this.list.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for(Packable i: this.list){
            weight = weight + i.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + list.size() + " items, total weight " + weight() + " kg";
    }
    
}
