package ${package}.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class EastViewImpl extends Composite implements EastView {

	private static CenterViewImplUiBinder uiBinder = GWT
			.create(CenterViewImplUiBinder.class);

	interface CenterViewImplUiBinder extends UiBinder<Widget, EastViewImpl> {
	}
	
	private Presenter presenter;

	public EastViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public EastViewImpl(String firstName) {
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
