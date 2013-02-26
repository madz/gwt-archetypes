package ${package}.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class AppLayoutImpl implements AppLayout {

	interface AppLayoutUiBinder extends UiBinder<DockLayoutPanel, AppLayoutImpl> {
	}

	private static AppLayoutUiBinder uiBinder = GWT.create(AppLayoutUiBinder.class);

	private final DockLayoutPanel mainLayoutPanel;

	@UiField
	SimplePanel northPanel;

	@UiField
	SimplePanel eastPanel;

	@UiField
	SimplePanel westPanel;

	@UiField
	SimplePanel centerPanel;

	@UiField
	SimplePanel southPanel;


	public AppLayoutImpl() {
		mainLayoutPanel = uiBinder.createAndBindUi(this);
	}

	@Override
	public DockLayoutPanel getMainLayoutPanel() {
		return mainLayoutPanel;
	}

	@Override
	public AcceptsOneWidget getNorthContainer() {
		return northPanel;
	}

	@Override
	public AcceptsOneWidget getSouthContainer() {
		return southPanel;
	}

	@Override
	public AcceptsOneWidget getWestContainer() {
		return westPanel;
	}

	@Override
	public AcceptsOneWidget getEastContainer() {
		return eastPanel;
	}

	@Override
	public AcceptsOneWidget getCenterContainer() {
		return centerPanel;
	}
	
	@Override
	public void setDefaultLayout() {
		mainLayoutPanel.setWidgetSize(northPanel, 10);
		mainLayoutPanel.setWidgetSize(southPanel, 10);
		mainLayoutPanel.setWidgetSize(westPanel, 10);
		mainLayoutPanel.setWidgetSize(eastPanel, 10);
	}
	
}
