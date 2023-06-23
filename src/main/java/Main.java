import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {

        filterOption(getOption());
    }

    private static int getOption() {
        System.out.println("""
                Choose an option:
                1 - create file
                2 - read file
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void filterOption(int option) {
        switch (option) {
            case 1 -> {
                FileWriteService.main(getName(), getText());

//
            }
            case 2 -> {
                FileReadService.main(getName());

            }
        }
    }

    public static String getName() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");


        return scanner.nextLine();
    }

    public static String getText() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file text: ");


        return scanner.nextLine();
    }


}
