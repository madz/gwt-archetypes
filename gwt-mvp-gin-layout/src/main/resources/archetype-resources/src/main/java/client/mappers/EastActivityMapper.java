package ${package}.client.mappers;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.activities.ActivityAsyncProxy;
import ${package}.client.activities.EastActivity;
import ${package}.client.place.DefaultPlace;

public class EastActivityMapper implements ActivityMapper {

	private final Provider<ActivityAsyncProxy<EastActivity>> eastActivityProvider;

	@Inject
	public EastActivityMapper(Provider<ActivityAsyncProxy<EastActivity>> eastActivityProvider) {
		this.eastActivityProvider = eastActivityProvider;
	}

	@Override
	public Activity getActivity(Place place) {
		if(place instanceof DefaultPlace) {
			ActivityAsyncProxy<EastActivity> activityAsyncProxy = eastActivityProvider.get();
			return activityAsyncProxy;
		}
		return null;
	}
}