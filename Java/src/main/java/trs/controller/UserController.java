package trs.controller;

import trs.data.User;

public class UserController {
	private Controller controller;
	public User login(String username, String password) {
		User logUser = this.controller.getUserRepo().findUserByName(username);
		if(logUser.getPassword() == password) {
			controller.setCurrentUser(logUser);
			return logUser;
		}
		controller.setCurrentUser(null);
		return null;
	}

	public void createUser(String username, String password) {
		User user = new User(username, password);
		this.controller.getUserRepo().save(user);
	}

	public User searchUser(String username) {
		return this.controller.getUserRepo().findUserByName(username);
	}

	public boolean logout() {
		return this.controller.setCurrentUser(null);
	}

}
