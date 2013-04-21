#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widget.loading;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.PopupPanel;

public interface LoadingPopUpView extends IsWidget {
    void setPresenter(Presenter presenter);

    PopupPanel getLoadingWidget();

    HasText getLblMessage();

    public interface Presenter {
        void showAndSetPopupPosition();

        void close();

        void setMessage(String message);

        void setAutoHide(boolean isAutoHide);
    }
}
