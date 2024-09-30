package management;

public class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    private TicketBooking() { }

    public static class TicketBookingBuilder {
        private TicketBooking booking = new TicketBooking();

        public TicketBookingBuilder setMovieTitle(String title) {
            booking.movieTitle = title;
            return this;
        }

        public TicketBookingBuilder setSeatNumber(String seat) {
            booking.seatNumber = seat;
            return this;
        }

        public TicketBookingBuilder setSnackCombo(String combo) {
            booking.snackCombo = combo;
            return this;
        }

        public TicketBooking build() {
            return booking;
        }
    }
}

