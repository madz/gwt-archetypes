package ${package}.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;


public class App implements EntryPoint {

	public void onModuleLoad() {
		Button btnClickMe = new Button("Click Me!");
		
		btnClickMe.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Hello GWT!");				
			}
		});
		
		RootPanel.get().add(btnClickMe);
	}

}
