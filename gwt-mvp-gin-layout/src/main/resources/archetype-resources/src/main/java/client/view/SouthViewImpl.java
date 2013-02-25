package ${package}.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class SouthViewImpl extends Composite implements SouthView {

	private static CenterViewImplUiBinder uiBinder = GWT
			.create(CenterViewImplUiBinder.class);

	interface CenterViewImplUiBinder extends UiBinder<Widget, SouthViewImpl> {
	}
	
	private Presenter presenter;

	public SouthViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public SouthViewImpl(String firstName) {
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
