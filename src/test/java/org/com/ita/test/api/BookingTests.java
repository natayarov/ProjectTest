package org.com.ita.test.api;
import io.restassured.response.Response;
import org.com.ita.test.api.models.*;
import org.com.ita.test.api.models.clients.BookingClient;
import org.com.ita.test.api.models.clients.SignInClient;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class BookingTests {

    private BookingClient client;
    protected String token;


@BeforeMethod
public void beforeMethod(){
    SignInClient clientSI = new SignInClient();
    SignInRequest credential = new SignInRequest("admin","password123");
    SignInResponse response = clientSI.post(credential);
    client = new BookingClient(response.getToken());;
}

@Test
public void postBooking() {
    BookingDates bookingDates = new BookingDates("2023-06-05" , "2023-06-08");
    BookingPostRequest request = new BookingPostRequest("Sam",
            "Smith",
            45,
            true,
            bookingDates,
            "breakfast");
    BookingPostResponse bookingResponse = client.bookingPost(request);
     Assert.assertNotNull(bookingResponse.getBooking());
     System.out.println(bookingResponse.getBookingid());
 }

 @Test
 public void getBooking(){
Response bookingResponse = client.getBookingByName("Sam","Smith");
Assert.assertEquals(bookingResponse.getStatusCode(),200);
 }
 @Test
 public void updateBooking(){
     BookingDates bookingDates = new BookingDates("2023-06-05" , "2023-06-08");
     BookingPostRequest request = new BookingPostRequest("Sam",
             "Smith",
             45,
             true,
             bookingDates,
             "breakfast");
Response bookingResponse = client.putUpdate(request,67,token);
Assert.assertNotNull(bookingResponse.getBody());
 }
    @Test
    public void getBookingDetails(){
        BookingDates bookingDates = new BookingDates("2023-06-05" , "2023-06-08");
        BookingPostRequest request = new BookingPostRequest("Sam",
                "Smith",
                45,
                true,
                bookingDates,
                "breakfast");
        Response bookingResponse = client.patchUpdate(request,45,token);
        Assert.assertNotNull(bookingResponse.getBody());
    }

    @Test
    public void getBookingByNameAndDate(){
   Response response = client.getIdByDateAndName("Sam","Smith",
           "2023-06-05","2023-06-08");
   Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test
    public void getBookingids(){
    Response response = client.getIds();
    Assert.assertEquals(response.getStatusCode(),200);

    }

    @Test
    public void deleteBooking(){
    Response response = client.deleteBooking(11251,token);
    Assert.assertEquals(response.getStatusCode(),403);
    }
}
