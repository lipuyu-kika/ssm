import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.Response;
import org.apache.http.HttpHost;

import java.io.IOException;
import java.util.Collections;

public class Test {
    public static void main(String[] args){
        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200, "http"))
                .build();
        try {
            Response response = restClient.performRequest("GET", "/", Collections.singletonMap("pretty", "true"));
            System.out.println(EntityUtils.toString(response.getEntity()));
            restClient.close();
        }catch (IOException ie){
            System.out.println(ie);
        }
    }
}
