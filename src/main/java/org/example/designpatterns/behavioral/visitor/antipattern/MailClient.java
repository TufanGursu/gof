package org.example.designpatterns.behavioral.visitor.antipattern;

public interface MailClient {
    void sendMail(String[] mailInfo);
    void receiveMail(String[] mailInfo);
    boolean configureForMac();
    boolean configureForWindows();
}
