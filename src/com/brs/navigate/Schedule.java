package src.com.brs.navigate;

import java.time.LocalDateTime;

public class Schedule {
    public Schedule(LocalDateTime arrivalDateTime, LocalDateTime departureDateTime) {
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
    }

    LocalDateTime arrivalDateTime;
    LocalDateTime departureDateTime;

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }
}
