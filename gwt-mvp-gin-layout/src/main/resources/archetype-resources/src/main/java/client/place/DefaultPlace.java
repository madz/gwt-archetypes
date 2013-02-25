package ${package}.client.place;

import com.google.gwt.place.shared.Place;

public class DefaultPlace extends Place {

	private String placeName;

	public DefaultPlace() {
		this.placeName = "";
	}

	public DefaultPlace(String token) {
		this.placeName = token;
	}

	public String getPlaceName() {
		return placeName;
	}
}
