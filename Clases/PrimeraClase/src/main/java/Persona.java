public class Persona {
//Atributos/Propiedades
    private String name; //tipo de modificador de clase en java
    //private-> solo se puede acceder al modificador en su propia clase

    private int age;
    private String nac;

    private String gender;

    //constructor
    public Persona(String name, int age, String nac, String gender) {
        this.name = name;
        this.age = age;
        this.nac = nac;
        this.gender = gender;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public int getAge() {
        return age;
    }

    //setter
    public void setAge(int age) {
        this.age = age;
    }

    //getter
    public String getNac() {
        return nac;
    }

    //setter
    public void setNac(String nac) {
        this.nac = nac;
    }

    //getter
    public String getGender() {
        return gender;
    }

    //setter
    public void setGender(String gender) {
        this.gender = gender;
    }



}
