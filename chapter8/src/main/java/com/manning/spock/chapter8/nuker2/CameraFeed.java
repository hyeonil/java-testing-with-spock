package com.manning.spock.chapter8.nuker2;

import java.awt.Image;


public class CameraFeed {

	private Image image;
	
	public void setCurrentFrame(Image image)
	{
		this.image = image;
	}
	
	public Image getCurrentFrame()
	{
		return image;
	}
	
}
