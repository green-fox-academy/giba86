public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        //String str = new StringBuilder(url).insert(5, ":").toString().replace("bots", "odds");
        System.out.println(new StringBuilder(url).insert(5, ":").toString().replace("bots", "odds"));

        //or
        String str = url.substring(0, 5) + ":" + url.substring(5, url.length()).replace("bots", "odds");
        System.out.println(str);
    }
}
