package org.example.designpatterns.behavioral.mediator.chat;
//This is a class.

public class MediatorPatternDemo {

    public static void main(String args[])
    {

        ZoomChatRoom chat = new ZoomChatRoomImpl();

        User u1=new User(chat);
        u1.setname("Ahmet Can");
        u1.sendMsg("Merhaba Gözde! Nasılsın?");


        User u2=new User(chat);
        u2.setname("Gözde Arıkan");
        u2.sendMsg("İyiyim ! Sen?");
    }

}// End of the MediatorPatternDemo class.
