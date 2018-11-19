package PostIt;

import Sharpies.Sharpie;

public class Main {
    public static void main(String[] args) {

        BlogPost b1 = new BlogPost();
        BlogPost b2 = new BlogPost();

        PostIt p1 = new PostIt();
        PostIt p2 = new PostIt();
        PostIt p3 = new PostIt();

        b1.authorName = "Ben Dover";
        b1.title = "HeMan";
        b1.text = "Fun foreva";
        b1.publicationDate = "Some time ago";

        b2.authorName = "Will Power";
        b2.title = "You will know";
        b2.text = "Need to move that bridge?";
        b2.publicationDate = "Always and ever";

        p1.backgroundColor = "blue";
        p1.text = "Hello-bello";
        p1.textColor = "Batman Blue";

        p2.backgroundColor = "orange";
        p2.text = "Test something";
        p2.textColor = "Purple creative";

        p3.backgroundColor = "denim blue";
        p3.text = "Ocean 11 + a million divided by 13";
        p3.textColor = "Deep sea aqua marin blue";

        System.out.println(p3.textColor + " on " +p2.backgroundColor + " which has " + p1.textColor);
        System.out.println(b1.authorName + " and " + b2.authorName + " are some friends in " + p3.text);
    }
}
