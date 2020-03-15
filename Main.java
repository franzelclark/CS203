/**
 * Stack Data Structure Implementation using Java
 * @author Clark
 * @version 1.0
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Stack Data Structure Implementation using Java");
        Scanner myScan = new Scanner(System.in);
        int userOption;
        System.out.println("Enter max stack size: ");
        while (myScan.hasNext() && !myScan.hasNextInt()) {
            System.out.println("\nInvalid input");
            myScan.next();
        }
        int maxStackSize = Integer.parseInt(myScan.next());
        Stack<String> stringStack = new Stack<String>(maxStackSize);

        do {
//            System.out.println("\nSelect Option\n0 - new\n1 - push\n2 - pop\n3 - peek\n4 - isEmpty\n5 - isFull\n6 - clear\n9 - viewAll\n11 - Quit");
            System.out.println("\nSelect Option\n1 - push\n2 - pop\n3 - peek\n4 - clear\n5 - viewStack\n6 - viewAll\n7 - Quit");
            while (myScan.hasNext() && !myScan.hasNextInt()) {
                System.out.println("\nInvalid input");
                System.out.println("\nSelect Option\n1 - push\n2 - pop\n3 - peek\n4 - clear\n5 - viewStack\n6 - viewAll\n7 - Quit");
                myScan.next();
            }
            userOption = myScan.nextInt();
            if (userOption >= 1 && userOption <= 6) {
                switch (userOption) {
//                    case 0:
//                        System.out.println("\nEnter max stack size: ");
//                        int maxStkSize = Integer.parseInt(myScan.nextLine());
//                        Stack<String> stringStack = new Stack<String>(maxStkSize);
//                        break;

                    case 1:
                        if (stringStack.isFull()) {
                            System.out.println("\nStack already full");
                            break;
                        } else {
                            System.out.println("\nEnter value to be pushed: ");
                            String pushInput = myScan.next();
                            stringStack.push(pushInput);
                            break;
                        }

                    case 2:
                        stringStack.pop();
                        break;

                    case 3:
                        stringStack.peek();
                        break;

//                    case 4:
//                        stringStack.isEmpty();
//                        break;
//
//                    case 5:
//                        stringStack.isFull();
//                        break;

                    case 4:
                        stringStack.clear();
                        break;

                    case 5: stringStack.viewStack();
                    break;

                    case 6:
                        stringStack.viewAll();
                        break;
                }
            } else if (userOption == 7) {
                System.out.println("\nTerminating program...");
                break;
            } else System.out.println("\nInvalid input");
        } while (userOption != 7);
    }
}