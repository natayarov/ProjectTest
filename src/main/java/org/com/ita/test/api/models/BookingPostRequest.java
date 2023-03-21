package org.com.ita.test.api.models;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class BookingPostRequest {
  private String firstname;
  private String lastname;
  private int totalprice;
  private Boolean depositpaid;
  public BookingDates bookingdates;
  private String additionalneeds;


}
