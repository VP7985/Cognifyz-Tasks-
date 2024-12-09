import java.util.Scanner;

public class NumberPatternMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menu for pattern selection
            System.out.println("\nChoose a pattern type:");
            System.out.println("1. Pyramid");
            System.out.println("2. Inverted Pyramid");
            System.out.println("3. Diamond");
            System.out.println("4. Right-Aligned Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            switch (choice) {
                case 1:
                    generatePyramid(rows);
                    break;
                case 2:
                    generateInvertedPyramid(rows);
                    break;
                case 3:
                    generateDiamond(rows);
                    break;
                case 4:
                    generateRightAlignedTriangle(rows);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // Pattern 1: Pyramid
    public static void generatePyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 2: Inverted Pyramid
    public static void generateInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 3: Diamond
    public static void generateDiamond(int rows) {
        // Top half
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Bottom half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 4: Right-Aligned Triangle
    public static void generateRightAlignedTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
