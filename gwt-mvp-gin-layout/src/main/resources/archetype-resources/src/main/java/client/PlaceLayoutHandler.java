package ${package}.client;

import com.google.gwt.place.shared.PlaceChangeEvent;
import ${package}.client.view.AppLayout;

/**
 * 
 * @author Mark This will set the layout triggered by the current place.
 */
public final class PlaceLayoutHandler implements PlaceChangeEvent.Handler {

	private final AppLayout appPanelView;

	public PlaceLayoutHandler(AppLayout appPanelView) {
		this.appPanelView = appPanelView;
	}

	@Override
	public void onPlaceChange(PlaceChangeEvent event) {
		appPanelView.setDefaultLayout();
	}
}
