package org.com.ita.test.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingResponse {
    private String firstname;
    private String lastname;
    private int totalprice;
    private Boolean depositpaid;
    public BookingDates bookingdates;
    private String additionalneeds;

}
