
public class DefaultMethodDemo {

	public static void main(String[] args) {

		MyIfImp obj = new MyIfImp();
		
		System.out.println("User ID is: "+obj.getUserId());
		//can also call getAdminID() because of the default implementation
		System.out.println("Admin Id is: "+obj.getAdminId());
	}

}
