package org.com.ita.test.api.models;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookingPostResponse {
    private int bookingid;
    public BookingResponse booking;
}
