package com.yifeng.lab.design.complex.bpm;

public interface BeatModelInterface {

	void initialize();
	
	void on();
	
	void off();
	
	void setBPM(int bpm);
	
	int getBPM();
	
	
	void registerOberver(BeatObserver o);
	
	void removeObserver(BeatObserver o);
	
	void registerOberver(BPMObserver o);
	
	void removeObserver(BPMObserver o);
}
