#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.center;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.place.DefaultPlace;
import ${package}.client.util.ActivityAsyncProxy;

public class CenterActivityMapper implements ActivityMapper {

    private final Provider<ActivityAsyncProxy<CenterActivity>> centerActivityProvider;

    @Inject
    public CenterActivityMapper(Provider<ActivityAsyncProxy<CenterActivity>> centerActivityProvider) {
        this.centerActivityProvider = centerActivityProvider;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof DefaultPlace) {
            ActivityAsyncProxy<CenterActivity> activityAsyncProxy = centerActivityProvider.get();
            return activityAsyncProxy;
        }
        return null;
    }
}