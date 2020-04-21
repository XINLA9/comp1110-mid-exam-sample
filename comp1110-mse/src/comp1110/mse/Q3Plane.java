package comp1110.mse;

/**
 * COMP1110 Mid-Semester Exam, Question 3
 */
public class Q3Plane {
   private String name;
   private int speed;
    /**
     * Constructor
     *
     * @param name The name of the plane
     * @param speed The speed of the plane (in km/h),
     */
    Q3Plane(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    /** Return the speed of the plane */
    int getSpeed() {
        return speed;
    }

    /**
     * Reset the speed of the plane according to the argument speed
     * @param speed The new speed of the plane
     */
    void resetSpeed(int speed) {
       this.speed=speed;
    }

    /**
     * Calculate the time to travel the specified distance at the current speed.
     * @param distance The distance (in km)
     * @return The time to travel the distance (in minutes)
     */
    int timeToTravel(int distance) {
        float min = distance*60/speed;
        return (int)min;
    }

    /**
     * Return a string describing the plane and its speed,
     * in the format
     *    "Plane NAME is travelling S km/h"
     * where NAME is replaced by the plane's name, and S is replaced by
     * the plane's speed.
     *
     * @return A string describing the plane and its speed
     */
    @Override
    public String toString() {
        return "Plane "+name +" is travelling "+speed+" km/h";
    }
}
