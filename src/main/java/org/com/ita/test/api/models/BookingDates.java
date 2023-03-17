package org.com.ita.test.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingDates {
    private String checkin;
    private String checkout;

    public BookingDates(){
        this.checkin = checkin;
        this.checkout = checkout;
    }
}
