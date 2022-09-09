import java.util.Scanner;

public class SuperGreeter {
    public void start() {
        System.out.println("Det virker!");
    }
    public static void main(String[] args){
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println(" Hej " + name);
    }

}
