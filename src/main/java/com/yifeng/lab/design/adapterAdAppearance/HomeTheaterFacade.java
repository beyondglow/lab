package com.yifeng.lab.design.adapterAdAppearance;

public class HomeTheaterFacade {
	
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	public HomeTheaterFacade(Amplifier amp, 
			Tuner tuner, 
			DvdPlayer dvd, 
			CdPlayer cd, 
			Projector projector,
			TheaterLights lights, 
			Screen screen, 
			PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie){
		System.out.println("准备看电影喽.......");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.paly(movie);
	}
	
	public void endMovie(){
		System.out.println("\n关闭家庭影院......");
		popper.off();
		lights.off();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
