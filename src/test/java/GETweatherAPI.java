import com.jayway.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

public class GETweatherAPI {

    //GET request of the weather API by zip code
    @Test
    public void Test_01() {
        Response myResponse=when().
                get("http://api.openweathermap.org/data/2.5/weather?zip=11102,us&appid=c940eb5f253efbe21da26756b9b39ce3");

        try{
            Assert.assertEquals(myResponse.getStatusCode(), 200);
        }
        catch (Exception e) {
            System.out.println(myResponse.getStatusCode());
        }
    }

}
