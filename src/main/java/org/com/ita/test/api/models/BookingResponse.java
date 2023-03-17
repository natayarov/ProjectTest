package org.com.ita.test.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class BookingResponse {
    private String firstname;
    private String lastname;
    @JsonProperty("totalprice")
    private int totalprice;
    private Boolean depositpaid;
    public BookingDates bookingdates;
    private String additionalneeds;

}
