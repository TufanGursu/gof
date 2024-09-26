package org.example.designpatterns.behavioral.templatemethod.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This is a class.
public class TemplatePatternDemo {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of the game you wanna play: ");
        String name = br.readLine();
        Game game = null;
        switch (name.toLowerCase()) {
            case "chess":
                game = new Chess();
                break;
            case "soccer":
                game = new Soccer();
                break;
            default:
                System.out.println("Invalid game name!");
                break;
        }
        if (game != null) {
            game.play();
        }
    }
}// End of the Soccer class.
