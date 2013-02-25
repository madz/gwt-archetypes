package ${package}.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;

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
