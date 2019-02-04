package Inheritance;

public class AndroidSystem extends Activity {
    public static void main(String[] args) {
        AndroidSystem androidSystem = new AndroidSystem();
        androidSystem.onCreate();
        androidSystem.onPause();
        androidSystem.onStop();
    }

    @Override
    void onCreate() {
        System.out.println("Create system for Android");
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
