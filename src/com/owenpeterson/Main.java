package com.owenpeterson;

import java.awt.*;
import java.awt.event.InputEvent;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {
	// write your code here
        Robot robot = new Robot();


        while (true) {
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();

            robot.mouseMove(x + 10 , y + 5);
            Thread.sleep(25);
            robot.mouseMove(x - 10 , y + 5);
            Thread.sleep(25);
            robot.mouseMove(x + 10 , y - 5);
            Thread.sleep(25);
            robot.mouseMove(x - 10 , y - 5);
            Thread.sleep(25);
            robot.mouseMove(x + 10 , y + 5);
            Thread.sleep(25);
            robot.mouseMove(x - 10 , y + 5);
            Thread.sleep(25);
            robot.mouseMove(x + 10 , y - 5);
            Thread.sleep(25);
            robot.mouseMove(x - 10 , y - 5);


            Thread.sleep(200);

       }

    }
}
