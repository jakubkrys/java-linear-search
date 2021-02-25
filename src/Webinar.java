public class Webinar {
    private String title;
    private String description;
    private String link;

    public Webinar(String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public void display() {
        System.out.print("Title: "+title);
        System.out.println("Description: "+description);
        System.out.println("Link: "+link);
    }
}
