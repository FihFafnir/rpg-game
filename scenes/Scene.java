package scenes;

import java.util.Scanner;

public abstract class Scene {
    private int typingTime = 30;
    Scanner in = new Scanner(System.in);

    public void br() {
        System.out.print("\n");
    }

    public void showOptions(String... options) {
        for (int i = 0; i < options.length; i++)
            write(String.format("[%d] - %s", i + 1, options[i]));
    }

    public void showStatus(String stat, double value) {
        write(String.format("%s: %f", stat, value));
    }

    public void showStatus(String stat, int value) {
        write(String.format("%s: %d", stat, value));
    }

    public void showStatus(String stat, String value) {
        write(String.format("%s: %d", stat, value));
    }

    public void write(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(typingTime);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        br();
    }

}
