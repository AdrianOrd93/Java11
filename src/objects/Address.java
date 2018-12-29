package objects;

public class Address {
    private String postCode;
    private String postOffice;

    public Address(String postCode, String postOffice) {
        this.postCode = postCode;
        this.postOffice = postOffice;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }
}
