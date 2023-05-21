package WorkUa;

import org.junit.Test;

public class WorkTest extends BaseTest{
    private final static String URL = "https://www.work.ua/resumes/7015382/#contactInfo";

    @Test
    public void checkAttributeHashMap(){
        WorkResumePage workResumePage = new WorkResumePage(URL);
          boolean flag = workResumePage.isReadyToRemout();


    }




}
