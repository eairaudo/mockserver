import com.google.gson.Gson;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.model.Delay;
import org.mockserver.model.Header;

import java.util.concurrent.TimeUnit;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;


import static org.mockserver.integration.ClientAndServer.startClientAndServer;

public class Server {

    static MockServerClient mockServer = startClientAndServer(8081);
    static Gson gson;

    public static void consulta(String metodo , String ruta, int codigo , String content , String body , int delay){

        mockServer.when(
                request()   .withMethod(metodo)
                            .withPath(ruta)
        ).respond(
                response()  .withStatusCode(codigo)
                            .withHeader(new Header("Content-Type", content))
                            .withBody(body)
                            .withDelay(new Delay(TimeUnit.MILLISECONDS, delay))
        );

    }

    public static void main(String[] args) {
        gson = new Gson();
        Item item = new Item(1234);
        Site site = new Site();
        Sites sites = new Sites();
        Country country = new Country();
        User user = new User();

        consulta("GET" , "/items/.*", 200,"application/json; charset=utf-8",gson.toJson(item),1000);
        consulta("GET" , "/sites/", 200,"application/json; charset=utf-8",sites.toString(),1000);
        consulta("GET" , "/site/.*", 200,"application/json; charset=utf-8",site.toString(),1000);
        consulta("GET" , "/countries/.*", 500,"application/json; charset=utf-8",country.toString(),1000);
        consulta("GET" , "/users/.*", 200,"application/json; charset=utf-8",user.toString(),1000);
    }


}
