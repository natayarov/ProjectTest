package org.com.ita.test.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Data
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class BookingPostResponse {
@JsonProperty("bookingid")
    private int bookingid;
@JsonProperty("booking")
    public BookingResponse booking;
}
