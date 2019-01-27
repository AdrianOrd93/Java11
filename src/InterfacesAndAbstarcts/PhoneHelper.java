package InterfacesAndAbstarcts;

public class PhoneHelper extends Iphone{
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.call("123456789");
        iphone.sendTxt("123456789");
        iphone.takePicture();
    }

}
