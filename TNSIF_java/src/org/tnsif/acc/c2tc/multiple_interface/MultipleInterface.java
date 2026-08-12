package org.tnsif.acc.c2tc.multiple_interface;

class SmartPhone implements Camera,MusicPlayer{

	@Override
	public void playMusic() 
	{
		System.out.println("Playing music using smartphone ");
		
	}

	@Override
	public void takePhoto() 
	{
		System.out.println("Taking Photo using SmartPhone");
		
	}
	
}

public class MultipleInterface {

	public static void main(String[] args) {
		
		SmartPhone smart = new SmartPhone();
		
		smart.playMusic();
		smart.takePhoto();
		

	}

}
