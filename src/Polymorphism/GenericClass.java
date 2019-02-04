package Polymorphism;

public class GenericClass<Integer, String> {

    private String name;
    private Integer id;
    private String returnData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.lang.String getReturnData(String name, Integer id) {
        return "Your id is: " + id + "and name is: " + name;
    }
}
