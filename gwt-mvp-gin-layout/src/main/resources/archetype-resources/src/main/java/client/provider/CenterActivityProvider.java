package ${package}.client.provider;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import ${package}.client.activities.CenterActivity;
import ${package}.client.view.CenterView;

/**
 * 
 */
public class CenterActivityProvider implements Provider<CenterActivity> {
	private final CenterView view;
	private final EventBus eventBus;
	private final PlaceController placeController;

	@Inject
	public CenterActivityProvider(CenterView view, EventBus eventBus, PlaceController placeController) {
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;
	}

	@Override
	public CenterActivity get() {
		return new CenterActivity(view, eventBus, placeController);
	}
}
