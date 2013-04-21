#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.west;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.place.DefaultPlace;
import ${package}.client.util.ActivityAsyncProxy;

public class WestActivityMapper implements ActivityMapper {

    private final Provider<ActivityAsyncProxy<WestActivity>> westActivityProvider;

    @Inject
    public WestActivityMapper(
            Provider<ActivityAsyncProxy<WestActivity>> westActivityProvider) {
        this.westActivityProvider = westActivityProvider;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof DefaultPlace) {
            ActivityAsyncProxy<WestActivity> activityAsyncProxy = westActivityProvider
                    .get();
            return activityAsyncProxy;
        }
        return null;
    }
}