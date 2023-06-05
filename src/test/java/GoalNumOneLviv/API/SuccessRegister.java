package GoalNumOneLviv.API;

public class SuccessRegister {
    public Integer id;
    public String token;

    public SuccessRegister(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public SuccessRegister() {
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}
