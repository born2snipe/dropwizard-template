package b2s;

public class App {
    public static void main(String[] args) throws Exception {
        String configFile = args[0];

        Service service = new Service();
        service.run(new String[]{"db", "migrate", configFile});
        service.run(new String[]{"server", configFile});
    }
}