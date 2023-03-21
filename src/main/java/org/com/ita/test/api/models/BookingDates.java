package org.com.ita.test.api.models;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class BookingDates {
    private String checkin;
    private String checkout;

    public BookingDates(){
        this.checkin = checkin;
        this.checkout = checkout;
    }
}
