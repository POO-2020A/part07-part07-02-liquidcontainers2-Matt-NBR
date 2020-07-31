
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container bucket = new Container();
        Container vikingWarriorSkull = new Container();

        while (true) {
            System.out.println("First: " + bucket);
            System.out.println("Second: " + vikingWarriorSkull);
            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if (parts[0].equals("add")) {
                int amount = Integer.valueOf(parts[1]);
                bucket.add(amount);
            } else if (parts[0].equals("move")) {
                int amount = Integer.valueOf(parts[1]);
                if (amount > bucket.contains()) {
                    vikingWarriorSkull.add(bucket.contains());
                    bucket.remove(bucket.contains());
                } else {
                    vikingWarriorSkull.add(amount);
                    bucket.remove(amount);
                }
            } else if (parts[0].equals("remove")) {
                int amount = Integer.valueOf(parts[1]);
                vikingWarriorSkull.remove(amount);
            }
        }
    }
}
