public class OSFactory {
    public OS getInstance(String os) {
        if (os.equals("OpenSource"))
            return new Android();

        else if (os.equals("CrossPlatform"))
            return new IOS();

        else
            return new Windows();
    }
}