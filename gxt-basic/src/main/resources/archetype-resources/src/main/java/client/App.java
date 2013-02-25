package ${package}.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.box.MessageBox;

public class App implements EntryPoint {

	public void onModuleLoad() {
		MessageBox popup = new MessageBox("Title",
				"Hello World");
		RootPanel.get().add(popup);
		popup.show();
	}

}
