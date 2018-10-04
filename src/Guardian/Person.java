package Guardian;

public class Person {
    private String name;
    private int age;
    private boolean informal, homeless;

    public Person(String name, int age, boolean informal, boolean homeless) {
        this.name = name;
        this.age = age;
        this.informal = informal;
        this.homeless = homeless;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isInformal() {
        return informal;
    }

    public boolean isHomeless() {
        return homeless;
    }
}
