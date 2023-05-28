package GoalNumOneLviv.WorkUa;

public class Resume {

    private String gender;
    private int  date ;
    private String  city ;
    private boolean  liveNativePlace;
    private boolean Tick;

    public Resume(String gender, int date, String city, boolean liveNativePlace, boolean tick) {
        this.gender = gender;
        this.date = date;
        this.city = city;
        this.liveNativePlace = liveNativePlace;
        Tick = tick;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isLiveNativePlace() {
        return liveNativePlace;
    }

    public void setLiveNativePlace(boolean liveNativePlace) {
        this.liveNativePlace = liveNativePlace;
    }

    public boolean isTick() {
        return Tick;
    }

    public void setTick(boolean tick) {
        Tick = tick;
    }
}
