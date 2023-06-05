package GoalNumOneLviv.API;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.http.ContentType;

import java.util.List;
import java.util.stream.Collectors;

import static GoalNumOneLviv.API.Constants.*;
import static io.restassured.RestAssured.given;

public class RegressTest {


    @Test
    public void checkAvatarAndIdTest() {


        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(url + "api/users?page=2")
                .then()
                .log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        for (UserData i : users) {
            Assert.assertTrue(i.getAvatar().contains(i.getId().toString()));
            System.out.println(i.getAvatar());
        }
        users.stream().forEach(i -> Assert.assertTrue(i.getAvatar().contains(i.getId().toString())));
        users.stream().forEach(i -> System.out.println(i.getAvatar()));
        users.stream().forEach(System.out::println);

        for (UserData i : users) {
            Assert.assertTrue(i.getEmail().endsWith("@reqres.in"));
        }

        Assert.assertTrue(users.stream().allMatch(i -> i.getEmail().endsWith("@reqres.in")));
        System.out.println(users.stream().allMatch(i -> i.getEmail().endsWith("@reqres.in")));
        List<String> avatars = users.stream().map(element -> element.getAvatar()).collect(Collectors.toList());
        List<String> id = users.stream().map(element -> element.getId().toString()).collect(Collectors.toList());
        List<String> idTwo = users.stream().map(element -> String.valueOf(element.getId())).collect(Collectors.toList());
        System.out.println(id);
        System.out.println(idTwo);
        for (int i = 0; i < avatars.size(); i++) {
            System.out.println(avatars.get(i).contains(id.get(i)));
            Assert.assertTrue(avatars.get(i).contains(id.get(i)));
        }
        List<String> email = users.stream().map(element -> element.getEmail()).collect(Collectors.toList());

        for (int i = 0; i < email.size(); i++) {
            System.out.println(email.get(i).endsWith("@reqres.in"));
            Assert.assertTrue(email.stream().allMatch(element -> element.endsWith("@reqres.in")));
            Assert.assertTrue(email.get(i).endsWith("@reqres.in"));

        }


    }
    @Test
    public void checkAvatarAndIdTestSecond() {
        Specification.installSpecification(Specification.requestSpecification(url),
                Specification.responseSpecification200());
        List<UserData> users = given()
                .when()
                .get( "api/users?page=2")
                .then()
                .log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

    }

    @Test
    public void successfulRegistration(){
        Specification.installSpecification(Specification.requestSpecification(url),
                Specification.responseSpecification200());
        //TODO Expected result
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in","pistol");
        SuccessRegister successRegister = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessRegister.class);
        Assert.assertEquals(id,successRegister.getId());
        Assert.assertEquals(token,successRegister.getToken());


    }


    @Test
    public void successfulRegistrationRFI(){
        Specification.installSpecification(Specification.requestSpecification(urlSecond),
                Specification.responseSpecification200());
        RegisterRFI user = new RegisterRFI("serhii","serhiistrong");
        SuccessRegisterRFI successRegister =  given()
                .body(user)
                .when()
                .post(urlSecond+ "/auth-token/")
                .then().log().all()
                .extract().as(SuccessRegisterRFI.class);
    }
    @Test
    public void createRule(){
        Specification.installSpecification(Specification.requestSpecification(urlSecond),
                Specification.responseSpecification201());
                 given().auth().preemptive()
                         .basic("serhii","serhiistrong")
                         .body(PostBodyJson).when()
                         .post(urlSecond +"/api/rules/")
                         .then().log().all();;



    }


}
