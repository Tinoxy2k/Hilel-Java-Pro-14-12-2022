package main.Homework4;

public class Record {
    private String name;
    private String phone;


    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }


    public Record(String name, String phone) {
        this.name = name;
        this.phone = phone;

    }

    @Override
    public String toString() {
        return "Record [name=" + name + ", phoneNumber="
                + phone + "]";
    }
}
