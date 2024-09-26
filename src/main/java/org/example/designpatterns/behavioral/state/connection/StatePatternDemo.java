package org.example.designpatterns.behavioral.state.connection;

//This is a class.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StatePatternDemo {

    public static void main (String args[]) throws IOException {
        System.out.print("Enter the name of Departmant: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String con = br.readLine();
        Controller controller = new Controller();
        //the following trigger should be made by the user
        if (con.equalsIgnoreCase("management"))
            controller.setManagementConnection();
        if (con.equalsIgnoreCase("sales"))
            controller.setSalesConnection();
        if (con.equalsIgnoreCase("accounting"))
            controller.setAccountingConnection();
        controller.open();
        controller.log();
        controller.close();
        controller.update();

    }

}// End of the StatePatternDemo class.
