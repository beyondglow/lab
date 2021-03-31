package com.yifeng.lab.design.adapterAdAppearance;

public class HomeTheaterTestDrive {
	
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		CdPlayer cd = new CdPlayer();
		DvdPlayer dvd = new DvdPlayer();
		PopcornPopper poper = new PopcornPopper();
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		Tuner tuner = new Tuner();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, poper);
		
		homeTheater.watchMovie("大话西游");
		homeTheater.endMovie();
	}
}
