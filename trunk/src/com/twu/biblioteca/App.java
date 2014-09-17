package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/17/14.
 */
public abstract class App {
    private boolean isQuit = false;

    protected abstract void loop();
    protected abstract void exit();

    private boolean quit() {
        return isQuit;
    }

    protected boolean setQuit() {
        return isQuit = true;
    }

    protected abstract void init();

    public void run(){
        init();
        while(!quit()){
            loop();
        }
        exit();
    }
}
