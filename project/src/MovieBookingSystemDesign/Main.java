package MovieBookingSystemDesign;

import java.awt.print.Book;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main {
}

class Person{
    String userId;
    String name;
    String email;
    String password;
}
class Admin{
    public void addMovie(Movie movie){};
    public void deleteMovie(Movie movie){};
}

class User{
    List<Booking> bookings;

    public void createBooking(Booking booking){};
    public void cancelBooking(Booking booking){};

}
enum SeatStatus{
    BOOKED,
    AVAILABLE,
    RESERVED
}
abstract class Seat{
    String seat;
    SeatStatus seatStatus;
    double price;

    public void bookSeat(){}

    public abstract void setPrice();
    public boolean isSeatAvailable(){
        return true;
    }
}

class Gold extends Seat{
    public void setPrice(){}
}
class Silver extends Seat{
    public void setPrice(){}
}
class Platinum extends Seat{
    public void setPrice(){}
}

class Movie{
    String name;
    String genre;
    String language;
    List<String> cast;
}
class Show{
    Date startTime;
    Date endTime;
    int duration;
    Movie movie;

}

class City{
    String name;
    List<Theatre> theatres;
    String state;
    String zipCode;

}
class Theatre{
    int theatreId;
    List<Hall> halls;
    City city;
}
class Hall{
    int hallId;
    List<Seat> seats;
    List<Show> shows;
    Theatre theatre;
}


class MovieTicket{
    String ticketId;
    Seat seat;
    Show show;
    Hall hall;
}

enum BookingStatus{
    CONFIRMED,
    NOT_CONFIRMED,
    REJECTED
}
class Booking{
    String bookingId;
    BookingStatus bookingStatus;
    Movie movie;
    List<MovieTicket> tickets;
    double totalPrice;

    public boolean isBookingConfirmed(){
        return true;
    }
}
enum PaymentStatus{
    CONFIRMED,
    REJECTED,
    IN_PROGRESS,
    REFUNDED
}

abstract class Payment{
    String paymentId;
    Booking booking;

    public abstract void makePayment();
    public boolean isPaymentSuccessful(){
        return true;
    }
}

class CreditCard extends Payment{
    String creditCardNumber;
    String holderName;

    @Override
    public void makePayment() {

    }
}

abstract class Notification{
    public abstract void sendNotification(User user);
}

class EmailNotification extends Notification{
    @Override
    public void sendNotification(User user) {

    }
}

class MessageNotification extends Notification{
    @Override
    public void sendNotification(User user) {

    }
}

interface Search{
    List<Movie> searchMovieByTitle(String title);
    List<Movie> searchMovieByGenre(String genre);
    List<Movie> searchMovieByLanguage(String language);
}

class Catalog implements Search{
    HashMap<String, List<Movie>> movieTitle;
    HashMap<String, List<Movie>> movieGenre;
    HashMap<String, List<Movie>> movieLanguage;


    @Override
    public List<Movie> searchMovieByTitle(String title) {
        return movieTitle.get(title);
    }

    @Override
    public List<Movie> searchMovieByGenre(String genre) {
        return movieGenre.get(genre);
    }

    @Override
    public List<Movie> searchMovieByLanguage(String language) {
        return movieLanguage.get(language);
    }
}


