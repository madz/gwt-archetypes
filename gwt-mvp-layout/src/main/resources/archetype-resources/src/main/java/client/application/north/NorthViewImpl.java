#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.north;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class NorthViewImpl extends Composite implements NorthView {

    private static CenterViewImplUiBinder uiBinder = GWT
            .create(CenterViewImplUiBinder.class);

    interface CenterViewImplUiBinder extends UiBinder<Widget, NorthViewImpl> {
    }

    private Presenter presenter;

    public NorthViewImpl() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public NorthViewImpl(String firstName) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public HasText getValue() {
        return null;
    }

}
