package Inheritance;

public abstract class Activity {
    abstract void onCreate();

    public void onPause(){
        System.out.println("Pause system.");
    }

    public void onStop(){
        System.out.println("Stop system.");
    }
}
