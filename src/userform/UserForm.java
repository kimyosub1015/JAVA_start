package userform;

public class UserForm {
	private String name = "";
	private String phone_number = "";
	private String id = "";
	private String password = "";
	private String mmslist = "";
	private int level = 0;

	public String getMmslist() {
		return mmslist;
	}

	public void setMmslist(String mmslist) {
		this.mmslist = mmslist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
