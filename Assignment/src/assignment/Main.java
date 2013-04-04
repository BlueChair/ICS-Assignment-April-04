/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;
import java.util.*;
/**
 *
 * @author choik8962
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int cash;

        System.out.println("Welcome to the Carnival!! We have 3 games that you can play!");
        System.out.println("The games are: ");
        System.out.println("What is your name?");
        name = in.next();
        System.out.println("How much money do you have?");
        cash = in.nextInt();
        Player player1 = new Player(name, cash);
        System.out.println("What game do you want to play?");

    }

}
