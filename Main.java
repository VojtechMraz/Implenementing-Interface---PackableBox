
public class Main {

    public static void main(String[] args) {
        Packable cedo = new CD("Autor","JmenoCD",1999);
        System.out.println(cedo);
        
        Packable kniha = new Book("Autor","JmenoKnihy",5);
        System.out.println(kniha);
    }

}
