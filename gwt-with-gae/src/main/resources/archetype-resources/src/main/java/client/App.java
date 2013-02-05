package ${package}.client;

import ${package}.shared.LoginInfo;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.Window.Location;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class App implements EntryPoint {
	
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	private Anchor ancLogin = new Anchor();
	private Label lblUser = new Label();
	private VerticalPanel vPanel = new VerticalPanel();

	private LoginServiceAsync loginService = GWT.create(LoginService.class);

	@Override
	public void onModuleLoad() {
		callLoginService();
		
		vPanel.add(ancLogin);
		vPanel.add(lblUser);

		ancLogin.addClickHandler(createLoginHandler());

		RootPanel.get().add(vPanel);
	}

	private ClickHandler createLoginHandler() {
		ClickHandler handler = new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				callLoginService();
			}
		};
		return handler;
	}

	private void callLoginService() {
		loginService.login(Location.getHref(), new AsyncCallback<LoginInfo>() {

			@Override
			public void onSuccess(LoginInfo result) {
				if(result.isLoggedIn()) {
					lblUser.setText("HELLO: " + result.getNickname());
					ancLogin.setText("Logout");
					ancLogin.setHref(result.getLogoutUrl());
					
				} else {
					lblUser.setText("");
					ancLogin.setText("Login");
					ancLogin.setHref(result.getLoginUrl());
				}
				
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(SERVER_ERROR);
				System.out.println(caught.getMessage());
			}
		});
	}
}
