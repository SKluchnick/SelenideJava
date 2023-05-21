package WorkUa;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WorkTest extends BaseTest{
    private final static String URL = "https://www.work.ua/resumes/7015382/#contactInfo";

    @Test
    public void checkAttributeHashMap(){
        WorkResumePage workResumePage = new WorkResumePage(URL);

        Map <String, Object> exp = new HashMap<>();
        exp.put(WorkResumePage.Gender, "m");
        exp.put(WorkResumePage.Date, 202023);
        exp.put(WorkResumePage.City, "Дніпро");
        exp.put(WorkResumePage.LiveNativePlace, true);
        exp.put(WorkResumePage.Tick, false);

        Map <String, Object> act = workResumePage.getAttributes();
        Assert.assertEquals(exp,act);






    }




}
