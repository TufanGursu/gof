package org.example.designpatterns.behavioral.mediator.chat;

public class User extends Participant {

    private String name;
    private ZoomChatRoom chat;

    @Override
    public void sendMsg(String msg) {
        chat.showMsg(msg,this);

    }

    @Override
    public void setname(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User (ZoomChatRoom chat){
        this.chat=chat;
    }

}// End of the User class.
