package com.owenpeterson;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot robot = new Robot();

        while (true) {
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();

            //Creates variables to be used for mouse logic
            int x = (int) b.getX();
            int y = (int) b.getY();

            //Moves mouse the given coordinates +- a small value rapidly to "shake" the mouse
            robot.mouseMove(x + 10 , y + 5);
            Thread.sleep(25);
            robot.mouseMove(x - 10 , y + 5);
            Thread.sleep(25);
            robot.mouseMove(x + 10 , y - 5);
            Thread.sleep(25);
            robot.mouseMove(x - 10 , y - 5);

            //Slows the program slightly to allow actual usage of the mouse
            Thread.sleep(150);

       }

    }
}
