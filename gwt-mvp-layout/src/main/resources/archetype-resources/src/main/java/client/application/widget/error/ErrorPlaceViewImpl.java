#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widget.error;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ErrorPlaceViewImpl extends Composite implements ErrorPlaceView {

    private static ErrorPlaceViewImplUiBinder uiBinder = GWT.create(ErrorPlaceViewImplUiBinder.class);

    interface ErrorPlaceViewImplUiBinder extends UiBinder<Widget, ErrorPlaceViewImpl> {
    }

    private Presenter presenter;


    public ErrorPlaceViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

}
