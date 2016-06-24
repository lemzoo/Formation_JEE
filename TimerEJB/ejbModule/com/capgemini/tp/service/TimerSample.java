package com.capgemini.tp.service;

import javax.ejb.Remote;

@Remote
public interface TimerSample {
	public void scheduleTimer(long milliseconds);

	public String checkTimerStatus();
}
