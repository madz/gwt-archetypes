#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widget.error;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import ${package}.client.util.ActivityCustom;

public class ErrorPlaceActivity extends AbstractActivity implements ErrorPlaceView.Presenter, ActivityCustom {

    private final ErrorPlaceView view;

    public ErrorPlaceActivity(ErrorPlaceView view) {
        this.view = view;
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        panel.setWidget(view.asWidget());
        view.setPresenter(ErrorPlaceActivity.this);
    }

    @Override
    public void setPlace(Place place) {
        // TODO Auto-generated method stub

    }

    @Override
    public Place getPlace() {
        // TODO Auto-generated method stub
        return null;
    }
}
