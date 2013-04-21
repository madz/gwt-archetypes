#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application;

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

}
