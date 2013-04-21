#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.north;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 *
 */
public class NorthActivityProvider implements Provider<NorthActivity> {
    private final NorthView view;
    private final EventBus eventBus;
    private final PlaceController placeController;

    @Inject
    public NorthActivityProvider(NorthView view, EventBus eventBus, PlaceController placeController) {
        this.view = view;
        this.eventBus = eventBus;
        this.placeController = placeController;
    }

    @Override
    public NorthActivity get() {
        return new NorthActivity(view, eventBus, placeController);
    }
}
