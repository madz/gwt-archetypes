package ${package}.client.mappers;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.activities.ActivityAsyncProxy;
import ${package}.client.activities.WestActivity;
import ${package}.client.place.DefaultPlace;

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