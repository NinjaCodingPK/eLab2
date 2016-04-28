package model;

/**
 * Created by wookie on 4/26/16.
 */
public class Model {
    /**
     * Count of integer values
     */
    private final static int COUNT = 4;
    private int value1, value2, value3, value4;
    private double mean;
    private int rounded;

    public Model() {

    }

    public Model(int value1, int value2, int value3, int value4) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    /**
     * Method calculate mean value of 4 integers
     */
    public void calculateMean() {
        mean = (double)(value1 + value2 + value3 + value4)/COUNT;

    }

    /**
     * Method find the nearest integer value to this.mean
     */
    public void round() {
        rounded = (int) Math.round(mean);
    }

    /**
     * Set four values at once
     * @param _value1 first integer value
     * @param _value2 second integer value
     * @param _value3 third integer value
     * @param _value4 fours integer value
     */
    public void setValues(int value1, int value2, int value3, int value4) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public void setValue4(int value4) {
        this.value4 = value4;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public int getValue4() {
        return value4;
    }

    public double getMean() {
        return mean;
    }

    public int getRounded() {
        return rounded;
    }
}
