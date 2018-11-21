package Tier2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITier2 extends Remote
{
	public void Register(String id, String password,String phoneNumber,String fName,String lName) throws RemoteException;
	
	public static final String T2_SERVICE_NAME = "rmi://localhost/T2";

}
