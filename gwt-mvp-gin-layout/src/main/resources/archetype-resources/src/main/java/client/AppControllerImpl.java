package ${package}.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.inject.Inject;
import ${package}.client.place.DefaultPlace;
import ${package}.client.view.AppLayout;

public class AppControllerImpl implements AppController {

	private static Logger logger = Logger.getLogger("AppControllerImpl");

	private final PlaceController placeController;
	private final PlaceHistoryHandler placeHistoryHandler;
	private final AppLayout appPanelView;
	private EventBus eventBus;

	/**
	 * All parameters are injected by GIN
	 * 
	 * @param placeController
	 *            the application's PlaceController
	 * @param eventBus
	 *            the application's EventBus
	 * @param placeHistoryHandler
	 *            the application's PlaceHistoryHandler
	 * @param appLayout
	 *            this is the application's main panel
	 * @param activityManagerInitializer
	 *            unused parameter, it's here just to force GIN's initialization
	 *            of ActivityManagers
	 */
	@Inject
	public AppControllerImpl(PlaceController placeController, EventBus eventBus, PlaceHistoryHandler placeHistoryHandler, AppLayout appLayout, ActivityManagerInitializer activityManagerInitializer) {
		this.placeController = placeController;
		this.placeHistoryHandler = placeHistoryHandler;
		this.appPanelView = appLayout;
		this.eventBus = eventBus;
	}


	private void handleError(Throwable caught) {
		logger.log(Level.SEVERE, caught.getMessage());
	}


	@Override
	public void start() {
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceLayoutHandler(appPanelView));

		placeHistoryHandler.register(placeController, eventBus, new DefaultPlace());
		
		RootLayoutPanel.get().add(appPanelView.getMainLayoutPanel());
		
		placeHistoryHandler.handleCurrentHistory();

	}

}