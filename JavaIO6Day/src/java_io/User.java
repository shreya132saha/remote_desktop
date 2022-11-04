package java_io;

import java.io.Serializable;

public class User implements Serializable {

	int userId;
	String userName;
	String address;
	public User(int userId, String userName, String address)
	{
		super();
		this.userId=userId;
		this.userName=userName;
		this.address=address;
	}
	
	
} 


