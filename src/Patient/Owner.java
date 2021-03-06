package Patient;

public class Owner {

    private String DNI;
    private String name;
    private String cellphone;
    private int age;

    public Owner(String DNI, String name, String cellphone, int age) {
        this.DNI = DNI;
        this.name = name;
        this.cellphone = cellphone;
        this.age = age;
    }
    public Owner() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
