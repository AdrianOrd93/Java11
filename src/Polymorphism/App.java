package Polymorphism;

public class App extends GenericClass {
    public static void main(String[] args) {
        GenericClass<Integer, String> genericClass = new GenericClass<>();
        GenericClass<Integer, String> genericClass1 = new GenericClass<>();
        GenericClass<Integer, String> genericClass2 = new GenericClass<>();
        GenericClass<Integer, String> genericClass3 = new GenericClass<>();

        genericClass.setName("Test");
        genericClass.setId(1);

        genericClass1.setName("Test1");
        genericClass1.setId(2);


        genericClass2.setName("Test2");
        genericClass2.setId(3);


        genericClass3.setName("Test3");
        genericClass3.setId(4);


        System.out.println(genericClass.getReturnData(genericClass.getName(), genericClass.getId()));
        System.out.println("-----------------");
        System.out.println(genericClass1.getReturnData(genericClass1.getName(), genericClass1.getId()));
        System.out.println("-----------------");
        System.out.println(genericClass2.getReturnData(genericClass2.getName(), genericClass2.getId()));
        System.out.println("-----------------");
        System.out.println(genericClass3.getReturnData(genericClass3.getName(), genericClass3.getId()));

    }
}
