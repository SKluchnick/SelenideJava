package GoalNumOneLviv.API;

public class Constants {
    public  static String url = "https://reqres.in/";
    public  static String urlSecond = "http://10.10.14.38:8000";


    public static String AuthPostBodyJson = "{\n" +
            "  \"username\": \"serhii\",\n" +
            "  \"password\": \"serhiistrong\"\n" +
            "}";
    public static String PostBodyJson = "{\n" +
            "  \"ticket\": {\n" +
            "    \"workflow\": {\n" +
            "      \"name\": \"Access Request\"\n" +
            "    },\n" +
            "    \"subject\": \"AAAAAA12345678^^^BBBB1234567^^^test@example.com^^^envname#some_long_hash^^^https://envname.service-now.com^^^Some additional text description from Ticket\",\n" +
            "    \"priority\": \"Normal\",\n" +
            "    \"steps\": {\n" +
            "      \"step\": [\n" +
            "        {\n" +
            "          \"name\": \"Open request\",\n" +
            "          \"tasks\": {\n" +
            "            \"task\": [\n" +
            "              {\n" +
            "                \"fields\": {\n" +
            "                  \"field\": [\n" +
            "                    {\n" +
            "                      \"name\": \"Requested Access\",\n" +
            "                      \"access_request\": [\n" +
            "                        {\n" +
            "                          \"use_topology\": true,\n" +
            "                          \"sources\": {\n" +
            "                            \"source\": [\n" +
            "                              {\n" +
            "                                \"@type\": \"IP\",\n" +
            "                                \"ip_address\": \"5.6.7.69/32\"\n" +
            "                              }\n" +
            "                            ]\n" +
            "                          },\n" +
            "                          \"source_domain\": \"Default\",\n" +
            "                          \"destinations\": {\n" +
            "                            \"destination\": [\n" +
            "                              {\n" +
            "                                \"@type\": \"IP\",\n" +
            "                                \"ip_address\": \"10.10.14.38/32\"\n" +
            "                              }\n" +
            "                            ]\n" +
            "                          },\n" +
            "                          \"action\": \"ACCEPT\",\n" +
            "                          \"comment\": \"Some additional comment\",\n" +
            "                          \"services\": {\n" +
            "                            \"service\": [\n" +
            "                              {\n" +
            "                                \"protocol\": \"TCP\",\n" +
            "                                \"port\": \"22\",\n" +
            "                                \"@type\": \"PROTOCOL\"\n" +
            "                              }\n" +
            "                            ]\n" +
            "                          },\n" +
            "                          \"destination_domain\": \"Default\"\n" +
            "                        }\n" +
            "                      ],\n" +
            "                      \"@xsi.type\": \"multi_access_request\"\n" +
            "                    }\n" +
            "                  ]\n" +
            "                }\n" +
            "              }\n" +
            "            ]\n" +
            "          }\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  }\n" +
            "}";

}
