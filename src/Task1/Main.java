package Task1;

public class Main {
    public static void main(String[] args){
        run();
    }
    public static void run(){
        Product[]products=FileService.readFile();
        for (Product p:products
             ) {
            System.out.println(p);
        }
    }
}