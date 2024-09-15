

public class UserInfo {
	private String userName;
	private String userId;
	
	public UserInfo(String userName) {
		this.userName = userName;
		this.userId = generateUserId();
	}
	
	private String generateUserId() {
		if(userName.contains(" ")) {
			String [] splitName = userName.split(" ");
			String firstInitial = splitName[0].substring(0, 1).toUpperCase();
			String surname = splitName[splitName.length -1];
			return firstInitial + surname;
		}
		else {
			return "guest";
		}
	}
	
	public String getName() {
		return userName;
	}
	
	public String getUserId() {
		return userId;
	}

}
