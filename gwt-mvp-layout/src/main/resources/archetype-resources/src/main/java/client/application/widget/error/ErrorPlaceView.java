#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widget.error;

import com.google.gwt.user.client.ui.IsWidget;

public interface ErrorPlaceView extends IsWidget {
    void setPresenter(Presenter presenter);

    public interface Presenter {
    }
}
