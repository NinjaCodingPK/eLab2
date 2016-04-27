package main;

import model.Model;
/**
 * Created by wookie on 4/26/16.
 */
public class Main {
    public static void main(String args[]) {

        //Model model = new Model(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        Model model = new Model(1, 2, 3, 9);
        model.calculateMean();
        model.round();

    }
}