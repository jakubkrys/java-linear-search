public class WebinarRepository {
    private Webinar[] webinars;
    private int webinarIndex = 0;

    public WebinarRepository(int size) {
        webinars = new Webinar[size];
    }

    public void add(Webinar webinar) {
        webinars[webinarIndex++] = webinar;
    }

    public void display() {
        for (int i = 0; i < webinars.length && webinars[i] != null; i++) {
           webinars[i].display();
        }
    }
}
