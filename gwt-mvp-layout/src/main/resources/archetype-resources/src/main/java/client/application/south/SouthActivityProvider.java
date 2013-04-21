#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.south;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 *
 */
public class SouthActivityProvider implements Provider<SouthActivity> {
    private final SouthView view;
    private final EventBus eventBus;
    private final PlaceController placeController;

    @Inject
    public SouthActivityProvider(SouthView view, EventBus eventBus,
                                 PlaceController placeController) {
        this.view = view;
        this.eventBus = eventBus;
        this.placeController = placeController;
    }

    @Override
    public SouthActivity get() {
        return new SouthActivity(view, eventBus, placeController);
    }
}
