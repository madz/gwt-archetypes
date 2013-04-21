#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widget.loading;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.PopupPanel.PositionCallback;

public class LoadingPopUpActivity implements LoadingPopUpView.Presenter {
    private LoadingPopUpView view;
    private boolean isAutoHide = true;

    public LoadingPopUpActivity(LoadingPopUpView view) {
        this.view = view;
        setAutoHide(isAutoHide);
        setMessage("Loading...");
    }

    @Override
    public void showAndSetPopupPosition() {
        view.getLoadingWidget().setPopupPositionAndShow(new PositionCallback() {

            @Override
            public void setPosition(int offsetWidth, int offsetHeight) {
                int left = (Window.getClientWidth() - offsetWidth) >> 1;
                int top = (Window.getClientHeight() - offsetHeight) >> 4;
                view.getLoadingWidget().setPopupPosition(Math.max(Window.getScrollLeft() + left, 0), Math.max(Window.getScrollTop() + top, 0));
            }
        });
    }

    @Override
    public void close() {
        view.getLoadingWidget().hide();

    }

    @Override
    public void setMessage(String message) {
        view.getLblMessage().setText(message);
    }

    @Override
    public void setAutoHide(boolean isAutoHide) {
        view.getLoadingWidget().setAutoHideEnabled(isAutoHide);
    }

}