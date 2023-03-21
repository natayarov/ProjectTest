package org.com.ita.test.api.models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingGetRequest {
    private String firstname;
    private String lastname;
    private String checkin;
    private String checkout;
}
