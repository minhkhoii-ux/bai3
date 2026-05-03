import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static boolean isValid(int value) {
        logger.info("Checking validity for value: {}", value);
        return value > 0;
    }

    public static void main(String[] args) {
        logger.info("App started");
        System.out.println("isValid(5) = " + isValid(5));
        System.out.println("isValid(-1) = " + isValid(-1));
    }
}