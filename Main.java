import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Field field = new Field();
        field.fillField();
        field.printField();
        start(field);
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void start(Field field) throws InterruptedException {
        field.renderNew();
        Thread.sleep(500);
        clearScreen();
        Thread.sleep(500);
        field.printField();
        if(field.isThereLife()) {
            start(field);
        }
    }

}
