package wk5_enums;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your favorite NFL Team's city: ");
        String favCity = keyboard.nextLine().toUpperCase();
        Team theTeam;
        if (favCity.contains("CH")) {
            theTeam = Team.CHICAGO;
        }
        else if (favCity.contains("DE")) {
            theTeam = Team.DETROIT;
        }
        else if (favCity.contains("GR")) {
            theTeam = Team.GREEN_BAY;
        }
        else if (favCity.contains("MI")) {
            theTeam = Team.MINNEAPOLIS;
        }
        else {
            theTeam = Team.OTHER;
        }
        printMascot(theTeam);
    }

    public static void printMascot(Team team) {
        String mascot="Cougars";

        switch(team) {
            case CHICAGO:
                mascot ="Bears ey?";break;
            case DETROIT:
                mascot ="La Lions";break;
            case GREEN_BAY:
                mascot ="Packers!!";break;
            case MINNEAPOLIS:
                mascot ="VI-Queens ;P";break;
            default:
                mascot ="Not a real Football team";
        }
        System.out.println(mascot);
    }

}
