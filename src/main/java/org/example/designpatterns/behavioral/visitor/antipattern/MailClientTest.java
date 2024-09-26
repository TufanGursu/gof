package org.example.designpatterns.behavioral.visitor.antipattern;

public class MailClientTest {
    public static void main(String[] args) {
        MailClient mailClient = new OperaMailClient();
        mailClient.configureForMac();
        mailClient.configureForWindows();
        mailClient.sendMail(new String[]{"Hello", "World"});
        SquirrelMailClient squirrelMailClient = new SquirrelMailClient();
        squirrelMailClient.configureForMac();
        squirrelMailClient.configureForWindows();
        squirrelMailClient.sendMail(new String[]{"Hello", "World"});
    }
    /*
    Imagine that a new requirement comes in to provide support for Linux.
     We not only need to update the MailClient interface with a new configureForLinux() method,
      we will also need to update each of the concrete subclasses
      to provide implementation of the new configureForLinux() method.
      Things might not appear as bad in the current structure as we have only two concrete classes,
       but consider providing configuration support on Linux for more than 30 mail clients that
       our application supports.
     */
}
