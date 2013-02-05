package ${package}.server;

import ${package}.client.LoginService;
import ${package}.shared.LoginInfo;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {
	/**
	 * 
	 */
	private static final long serialVersionUID = -207230206237309774L;
	private final UserService userService;

	public LoginServiceImpl() {
		this(UserServiceFactory.getUserService());
	}

	public LoginServiceImpl(UserService userService) {
		this.userService = userService;
	}

	public LoginInfo login(String requestUri) {
		User user = userService.getCurrentUser();

		if (user == null) {
			LoginInfo info = new LoginInfo();
			info.setLoginUrl(userService.createLoginURL(requestUri));
			return info;
		}

		LoginInfo info = new LoginInfo(user.getEmail(), user.getNickname());
		info.setLogoutUrl(userService.createLogoutURL(requestUri));

		return info;
	}
}