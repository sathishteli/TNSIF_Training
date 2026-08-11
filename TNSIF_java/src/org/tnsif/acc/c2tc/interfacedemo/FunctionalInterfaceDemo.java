package org.tnsif.acc.c2tc.interfacedemo;

@FunctionalInterface
interface Notification
{
	void notifyUser(String message);
}

class EMailNotification implements Notification
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Email Message : "+message);
		
	}
	
}

class SMSNotification implements Notification
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending SMS Message " + message);
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) 
	{
		Notification email = new EMailNotification();
		email.notifyUser("Meeting @ 10Am");
		
		Notification sms = new SMSNotification();
		sms.notifyUser("Assignment Uploaded");

	}

}
