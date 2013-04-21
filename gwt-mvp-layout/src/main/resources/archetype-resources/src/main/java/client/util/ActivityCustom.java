#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.util;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;

public interface ActivityCustom extends Activity {
    /**
     * @param place - This will get the parameter/s from a place
     */
    public void setPlace(Place place);

    public Place getPlace();
}