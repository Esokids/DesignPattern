public class Main {
    public static void main(String[] args) {
        // OS obj = new Windows();
        // obj.spec();

        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("OpenSource");
        // OS obj = osf.getInstance("CrossPlatform");
        // OS obj = osf.getInstance("SomethingElse");
        obj.spec();
    }
}