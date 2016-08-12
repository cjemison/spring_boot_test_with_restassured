import com.jayway.restassured.response.Response;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import example.domain.HelloVO;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by cjemison on 8/12/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(IntConfig.class)
@ActiveProfiles("test")
@WebIntegrationTest({"server.port:0"})
public class HelloIntTest {

  @Value("${local.server.port}")
  private int PORT;


  @Test
  public void happyPath() throws Exception {
    HelloVO vo = new HelloVO("Mark");

    //  given().contentType(MediaType.APPLICATION_JSON_VALUE)
    //       .body(vo).post("http://localhost:" + PORT + "/v1/hello").then().assertThat().statusCode
    //      (200);

    Response response = given().contentType(MediaType.APPLICATION_JSON_VALUE)
          .body(vo).post("http://localhost:" + PORT + "/v1/hello");

    assertThat(response.jsonPath().get("name"), is(equalTo(vo.getName())));


    assertTrue(vo.equals(response.as(HelloVO.class)));
  }


}
