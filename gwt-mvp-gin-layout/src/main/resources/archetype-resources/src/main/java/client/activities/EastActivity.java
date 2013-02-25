package ${package}.client.activities;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ${package}.client.view.EastView;

public class EastActivity extends AbstractActivity implements EastView.Presenter, ActivityCustom {

	
	private final EastView view;
	private final EventBus eventBus;
	private final PlaceController placeController;
	
	public EastActivity(EastView view, EventBus eventBus,
			PlaceController placeController) {
		
		this.view = view;
		this.eventBus = eventBus;
		this.placeController = placeController;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		panel.setWidget(view.asWidget());
		view.setPresenter(EastActivity.this);
	}

	@Override
	public void setPlace(Place place) {
		
	}

	@Override
	public Place getPlace() {
		return null;
	}

}
