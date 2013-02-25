package ${package}.client.view;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.DockLayoutPanel;

public interface AppLayout {

	DockLayoutPanel getMainLayoutPanel();

	AcceptsOneWidget getNorthContainer();

	AcceptsOneWidget getSouthContainer();

	AcceptsOneWidget getWestContainer();

	AcceptsOneWidget getEastContainer();

	AcceptsOneWidget getCenterContainer();

	void setDefaultLayout();
	
	void setErrorLayout();
	
	void setLoginLayout();

//	void setNoUserLayout();
//
//	void setProfileLayout();
//
//	void setErrorLayout();

}
