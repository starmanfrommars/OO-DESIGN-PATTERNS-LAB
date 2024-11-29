
import java.io.*;
import java.util.*;

/**
 * @author Deepak D Nayak
 */
public class TVDisplay implements Observer {

    /**
     * Default constructor
     */
    public TVDisplay() {
    }

    /**
     *
     */
    public String weather;

    /**
     * @param weather
     * @return
     */
    public void update(String weather) {
        // TODO implement here
        this.weather = weather;
        display();
    }

    /**
     * @return
     */
    public void display() {
        // TODO implement here
        System.out.println("TV Display: Current weather is " + weather);
    }
}