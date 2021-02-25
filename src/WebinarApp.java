import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WebinarApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        int option;

        System.out.print("Size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // \n
        WebinarRepository webinarRepository = new WebinarRepository(size);

        do {
            System.out.println("----- Webinar App -----");
            System.out.println("1 - add");
            System.out.println("2 - display");
            System.out.println("3 - search");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine(); // \n

            switch (option) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Link: ");
                    String link = scanner.nextLine();

                    Webinar webinar = new Webinar(title,description,link);
                    webinarRepository.add(webinar);
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        } while (option != 0);
    }
}
