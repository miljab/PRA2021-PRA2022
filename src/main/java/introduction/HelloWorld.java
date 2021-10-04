package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    static Logger log = Logger.getLogger("name");

    public static void main(String [ ] args) {

        log.info("message");
        System.out.println("Hello! Witaj!");
    }
}