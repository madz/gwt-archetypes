package ${package}.client.provider;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.activities.WestActivity;
import ${package}.client.view.WestView;

/**
 * 
 */
public class WestActivityProvider implements Provider<WestActivity> {
	private final WestView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public WestActivityProvider(WestView view, EventBus eventBus, PlaceController placeController) {
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;
	}

	@Override
	public WestActivity get() {
		return new WestActivity(view, eventBus, placeController);
	}
}
