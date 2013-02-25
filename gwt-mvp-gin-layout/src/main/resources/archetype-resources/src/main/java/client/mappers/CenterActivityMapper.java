package ${package}.client.mappers;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.activities.ActivityAsyncProxy;
import ${package}.client.activities.CenterActivity;
import ${package}.client.place.DefaultPlace;

public class CenterActivityMapper implements ActivityMapper {

	private final Provider<ActivityAsyncProxy<CenterActivity>> centerActivityProvider;

	@Inject
	public CenterActivityMapper(Provider<ActivityAsyncProxy<CenterActivity>> centerActivityProvider) {
		this.centerActivityProvider = centerActivityProvider;
	}

	@Override
	public Activity getActivity(Place place) {
		if(place instanceof DefaultPlace) {
			ActivityAsyncProxy<CenterActivity> activityAsyncProxy = centerActivityProvider.get();
			return activityAsyncProxy;
		}
		return null;
	}
}