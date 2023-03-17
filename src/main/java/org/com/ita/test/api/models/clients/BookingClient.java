package org.com.ita.test.api.models.clients;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.com.ita.test.api.models.*;

import static io.restassured.RestAssured.given;


public class BookingClient extends BaseClient{
    private final String token;
    private static final String type = "application/json; text/plain; charset=utf-8";
    public BookingClient(String token){super(); this.token = token;}

    public  BookingPostResponse bookingPost(BookingPostRequest request) {
               return given().contentType(ContentType.JSON)
                       .accept(type)
                       .body(request)
                       .when()
                       .post(baseUrl + "/booking")
                       .as(BookingPostResponse.class);

    }

   public Response getBookingByName(String firstName, String lastName) {
        return given().param("firstname", firstName)
                .param("lastname", lastName)
                .when()
                .get(baseUrl+"/booking/11251");
    }
    public Response putUpdate(BookingPostRequest request,int totalprice, String token) {
       return given().contentType(ContentType.JSON)
                .accept(type)
               .header("Cookie", "token=" + token)
                .body(request)
                .when()
                .put(baseUrl+"/booking/11251");

    }
  public Response patchUpdate(BookingPostRequest request,int totalprice,String token) {
       return given().contentType(ContentType.JSON)
               .header("Cookie", "token=" + token)
                .accept(type)

                .body(request)
                .when()
                .put(baseUrl+"/booking/11251");

    }

 public Response getIdByDateAndName(String firstname,String lastname,String checkin,String checkout) {
       return given().param("firstname", firstname)
               .param("lastname", lastname)
               .param("checkin",checkin)
               .param("checkou",checkout)
               .when()
               .get(baseUrl+"/booking");


    }

   public Response getIds(){
        return given().when().get(baseUrl+"/booking");
   }


   public Response deleteBooking(int id,String token){
     return
             given().header("Cookie", "token=" + token)
                     .when()
                     .delete(baseUrl+"/booking/11251");
   }


}
