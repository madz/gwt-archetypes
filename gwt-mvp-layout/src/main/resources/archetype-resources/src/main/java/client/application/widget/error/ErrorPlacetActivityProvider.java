#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widget.error;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ErrorPlacetActivityProvider implements Provider<ErrorPlaceActivity> {
    private final ErrorPlaceView view;

    @Inject
    public ErrorPlacetActivityProvider(ErrorPlaceView view) {
        this.view = view;
    }

    @Override
    public ErrorPlaceActivity get() {
        return new ErrorPlaceActivity(view);
    }
}
