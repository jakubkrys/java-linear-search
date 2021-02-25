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
        for (int i = 0; i < webinarIndex; i++) {
            webinars[i].display();
        }
    }

    public Webinar search(String title, int p) {
        for (int i = 0; i < webinarIndex; i++) {
            if(webinars[i].getTitle().equals(title)){
                return webinars[i];
            }
        }
        return null;
    }
}
