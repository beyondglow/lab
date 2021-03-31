package com.yifeng.lab.design.complex.bpm;

public interface ControllerInterface {
	
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
	void setBPM(int bpm);
}
