package hr;

public class Resume {
    /**
     * Атрибуты для кандидата
     */
    private  String gender;
    private  String city;
    private  int age;
    private  boolean isNumberConfirmed;
    private  boolean isReadyToRelocate;

    public Resume(String gender, String city, int age, boolean isNumberConfirmed, boolean isReadyToRelocate) {
        this.gender = gender;
        this.city = city;
        this.age = age;
        this.isNumberConfirmed = isNumberConfirmed;
        this.isReadyToRelocate = isReadyToRelocate;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public boolean isNumberConfirmed() {
        return isNumberConfirmed;
    }

    public boolean isReadyToRelocate() {
        return isReadyToRelocate;
    }
}
