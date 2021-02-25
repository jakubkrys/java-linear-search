import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WebinarApp {
    public static final int FIRST_INDEX = 0;
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
            Webinar webinar;

            switch (option) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Link: ");
                    String link = scanner.nextLine();

                    webinar = new Webinar(title,description,link);
                    webinarRepository.add(webinar);

                    break;
                case 2:
                    webinarRepository.display();

                    break;
                case 3:
                    System.out.println("Title: ");
                    title = scanner.nextLine();
                    webinar = webinarRepository.search(title, FIRST_INDEX);
                    if (webinar != null){
                        webinar.display();
                    } else {
                        System.out.println("Not found.");
                    }

                    break;
            }
        } while (option != 0);
    }
}
