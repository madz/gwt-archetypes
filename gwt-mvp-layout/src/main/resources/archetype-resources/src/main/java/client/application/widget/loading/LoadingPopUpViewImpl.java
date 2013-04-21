#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widget.loading;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

public class LoadingPopUpViewImpl extends Composite implements LoadingPopUpView {

    private static LoadingPopUpUiBinder uiBinder = GWT
            .create(LoadingPopUpUiBinder.class);

    interface LoadingPopUpUiBinder extends UiBinder<Widget, LoadingPopUpViewImpl> {
    }

    @UiField
    PopupPanel popup;
    @UiField
    Label lblMsg;

    public LoadingPopUpViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));

    }


    @Override
    public void setPresenter(Presenter presenter) {

    }

    @Override
    public PopupPanel getLoadingWidget() {
        return popup;
    }


    @Override
    public HasText getLblMessage() {
        return lblMsg;
    }

}
