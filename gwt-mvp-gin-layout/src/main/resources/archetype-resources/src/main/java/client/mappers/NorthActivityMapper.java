package ${package}.client.mappers;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.activities.ActivityAsyncProxy;
import ${package}.client.activities.NorthActivity;
import ${package}.client.place.DefaultPlace;

public class NorthActivityMapper implements ActivityMapper {

	private final Provider<ActivityAsyncProxy<NorthActivity>> northActivityProvider;

	@Inject
	public NorthActivityMapper(
			Provider<ActivityAsyncProxy<NorthActivity>> northActivityProvider) {
		this.northActivityProvider = northActivityProvider;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof DefaultPlace) {
			ActivityAsyncProxy<NorthActivity> activityAsyncProxy = northActivityProvider
					.get();
			return activityAsyncProxy;
		}
		return null;
	}
}