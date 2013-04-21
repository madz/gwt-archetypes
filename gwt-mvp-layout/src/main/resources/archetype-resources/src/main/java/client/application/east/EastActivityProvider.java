#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.east;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 *
 */
public class EastActivityProvider implements Provider<EastActivity> {
    private final EastView view;
    private final EventBus eventBus;
    private final PlaceController placeController;

    @Inject
    public EastActivityProvider(EastView view, EventBus eventBus, PlaceController placeController) {
        this.view = view;
        this.eventBus = eventBus;
        this.placeController = placeController;
    }

    @Override
    public EastActivity get() {
        return new EastActivity(view, eventBus, placeController);
    }
}
