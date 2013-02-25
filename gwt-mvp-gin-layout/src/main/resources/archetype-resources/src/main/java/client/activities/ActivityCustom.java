package ${package}.client.activities;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;

public interface ActivityCustom extends Activity {
	/**
	 * 
	 * @param place - This will get the parameter/s from a place
	 */
	public void setPlace(Place place);
	
	public Place getPlace();
}