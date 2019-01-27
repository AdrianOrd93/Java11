package InterfacesAndAbstarcts;

public class Iphone implements Phone {

    @Override
    public void call(String number) {
        System.out.println("Wybierz połączenie na numer: " + number);
    }

    @Override
    public void sendTxt(String number) {
        System.out.println("Napisz wiadomość na numer:  " + number);
    }

    @Override
    public void takePicture() {
        System.out.println("Zrób zdjecie z Iphone");
    }

}


