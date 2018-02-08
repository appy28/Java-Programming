
public interface MyIf {

	//This is a normal interface method declaration
	int getUserId();
	
	//This is Default method with Default implementation
	default int getAdminId()
	{ return 1; }
}
