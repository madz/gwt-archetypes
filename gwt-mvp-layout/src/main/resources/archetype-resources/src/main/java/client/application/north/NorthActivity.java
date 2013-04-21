#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.north;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ${package}.client.util.ActivityCustom;

public class NorthActivity extends AbstractActivity implements NorthView.Presenter, ActivityCustom {


    private final NorthView view;
    private final EventBus eventBus;
    private final PlaceController placeController;

    public NorthActivity(NorthView view, EventBus eventBus,
                         PlaceController placeController) {

        this.view = view;
        this.eventBus = eventBus;
        this.placeController = placeController;
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        panel.setWidget(view.asWidget());
        view.setPresenter(NorthActivity.this);
    }

    @Override
    public void setPlace(Place place) {

    }

    @Override
    public Place getPlace() {
        return null;
    }

}
