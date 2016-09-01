/**
 * Created by Armen on 8/31/2016.
 */
enum TypeNumber{
    MOBILE(1),
    HOME(2),
    FAX(3);
    int id;
    TypeNumber(int id) {
       this.id = id;
    }
    int getId() {
        return this.id;
    }
}

public class Number {
    private String phoneNumber;
    private TypeNumber numb;


    Number(String number) {
        this.phoneNumber = number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

