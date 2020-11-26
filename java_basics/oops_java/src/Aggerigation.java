

public class Aggerigation {

	public static void main(String[] args) {

		HotelBooking booking = new HotelBooking();
		System.out.println(booking.getHotelData(0, 5));

	}

}

class HotelBooking {

	int hotelId;;

	int hotelStstus;;

	Address address;

	public String getHotelData(int hotelId, int hotelStatus) {

		this.hotelId = hotelId;

		this.hotelStstus = hotelStatus;

		address = new Address();

		return "Hotel Detail : " + hotelId + " : " + hotelStatus + " star" + " : " + address.hotelCity + " : "
				+ address.hotelState + " : " + address.hotelCountry;
	}

}

class Address {

	String hotelState = "Gujarat";

	String hotelCity = "Junagadh";

	String hotelCountry = "india";

}
