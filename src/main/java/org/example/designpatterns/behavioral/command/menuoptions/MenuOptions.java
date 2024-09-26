package org.example.designpatterns.behavioral.command.menuoptions;

public class MenuOptions {
    private final ActionListenerCommand clickOpen;
    private final ActionListenerCommand clickSave;

    public MenuOptions (ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
        this.clickOpen = clickOpen;
        this.clickSave = clickSave;
    }

    public void clickOpen () {
        clickOpen.execute();
    }

    public void clickSave () {
        clickSave.execute();
    }
}
