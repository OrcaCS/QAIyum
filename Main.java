import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        System.out.println("Hello! I'm QAIyum, a robot version of Mr. Qayum. I amm realy goood aat speling.");
        
        while (true) {
        input = keyboard.nextLine().toLowerCase().trim();
        
            if (input.equals("one banana")) {
                twoBanana();
            }
            
            if (Math.random() <= 0.49) { // random from .0 to .99
                oneBanana(); // 0.49 is 50% chance
            }
        }
    }
    
    public static void twoBanana() {
        System.out.println("Two banana.");
    }
    
    public static void oneBanana() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("One banana.");
        
        while (true) {
            String input = keyboard.nextLine().toLowerCase().trim();
            if (input.equals("two banana")) {
                System.out.println("One pound!!1! \n");
                break;
            }
        }
    }
}
