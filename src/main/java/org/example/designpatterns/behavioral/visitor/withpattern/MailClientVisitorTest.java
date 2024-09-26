package org.example.designpatterns.behavioral.visitor.withpattern;

public class MailClientVisitorTest {
    public static void main(String[] args) {
        MacMailClientVisitor macVisitor = new MacMailClientVisitor();
        LinuxMailClientVisitor linuxVisitor = new LinuxMailClientVisitor();
        WindowsMailClientVisitor windowsVisitor = new WindowsMailClientVisitor();

        OperaMailClient operaMailClient = new OperaMailClient();
        SquirrelMailClient squirrelMailClient = new SquirrelMailClient();
        ZimbraMailClient zimbraMailClient = new ZimbraMailClient();

        operaMailClient.accept(macVisitor);
        operaMailClient.accept(linuxVisitor);
        operaMailClient.accept(windowsVisitor);

        squirrelMailClient.accept(macVisitor);
        squirrelMailClient.accept(linuxVisitor);
        squirrelMailClient.accept(windowsVisitor);

        zimbraMailClient.accept(macVisitor);
        zimbraMailClient.accept(linuxVisitor);
        zimbraMailClient.accept(windowsVisitor);


    }
}
