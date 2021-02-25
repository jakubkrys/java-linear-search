public class WebinarRepository {
    private Webinar[] webinars;
    private int webinarIndex = 0;

    public WebinarRepository(int size) {
        webinars = new Webinar[size];
    }

    public void add(Webinar webinar) {
        webinars[webinarIndex++] = webinar;
    }
}
