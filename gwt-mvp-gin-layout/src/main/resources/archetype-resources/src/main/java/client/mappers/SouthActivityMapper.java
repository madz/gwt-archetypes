package ${package}.client.mappers;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.activities.ActivityAsyncProxy;
import ${package}.client.activities.SouthActivity;
import ${package}.client.place.DefaultPlace;

public class SouthActivityMapper implements ActivityMapper {

	private final Provider<ActivityAsyncProxy<SouthActivity>> southActivityProvider;

	@Inject
	public SouthActivityMapper(
			Provider<ActivityAsyncProxy<SouthActivity>> southActivityProvider) {
		this.southActivityProvider = southActivityProvider;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof DefaultPlace) {
			ActivityAsyncProxy<SouthActivity> activityAsyncProxy = southActivityProvider
					.get();
			return activityAsyncProxy;
		}
		return null;
	}
}