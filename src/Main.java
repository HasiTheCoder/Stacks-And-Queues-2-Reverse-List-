import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        Stack s = null;
        while ((choice = menu()) != 12) {
            input.nextLine();
            if ((s = StackOptions(choice, s)) == null) {
                System.out.println("Stack not created");
            }
        }
    }
    public static Stack StackOptions(int choice, Stack s) {
        if (choice == 0) {
            s.makeEmpty();
        }
        else if (choice == 1) {
            s = new Stack();
        }
        else if (choice == 2) {
            System.out.println("Enter the size of the stack: ");
            s = new Stack(input.nextInt());
            input.nextLine();
        }
        else if (choice == 3) {
            int[] values = getStackValues();
            s = new Stack(values);
        }
        else if (choice == 4) {
            if (s == null) {
                System.out.println("Stack not created");
                return s;
            }
            System.out.println("Enter the value to add to the stack: ");
            int value = input.nextInt();
            input.nextLine();
            s.push(value);
        }
        else if (choice == 5) {
            if (s == null) {
                return s;
            }
            System.out.println("Value removed: " + s.pop());
        }
        else if (choice == 6) {
            if (s == null) {
                return s;
            }
            if (s.top() == -1) {
                System.out.println("Stack is empty");
            }
            else {
                System.out.println("Top value: " + s.top());
            }
        }
        else if (choice == 7) {
            System.out.println("Size of stack: " + s.size());
        }
        else if(choice == 8) {
            if (s.isEmpty()) {
                System.out.println("Stack is empty");
            }
            else {
                System.out.println("Stack is not empty");
            }
        }
        else if(choice == 9) {
            if (s.isFull()) {
                System.out.println("Stack is full");
            }
            else {
                System.out.println("Stack is not full");
            }
        }
        else if (choice == 10) {
            if (s == null) {
                return s;
            }
            System.out.println(s);
        }
        else if (choice == 11) {
            System.out.println(s.reverseStack());
        }
        return s;
    }
    public static int[] getStackValues() {
        System.out.println("Enter the size of the stack: ");
        int size = input.nextInt();
        input.nextLine();
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter value " + (i+1) + ":");
            values[i] = input.nextInt();
            input.nextLine();
        }
        return values;
    }
    public static int menu() {
        System.out.println("""
                Enter the number of the choice
                0. Make stack empty
                1. Create a stack with default size
                2. Create a stack with a given size
                3. Create a stack from an array
                4. Push
                5. Pop
                6. Top
                7. Size
                8. Is Empty
                9. Is Full
                10. Display
                11. Reverse Stack
                12. Exit
                Enter Choice:
                """);
        return input.nextInt();
    }

}