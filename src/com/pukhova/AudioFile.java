package com.pukhova;

/**
 * This class is superclass for all audio files, including format and size fields,
 * although we don't need them in this exact program
*/

public class AudioFile {

	protected int duration;
	protected String format;
	protected int size;

	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AudioFile other = (AudioFile) obj;
		if (duration != other.duration)
			return false;
		return true;
	}

}
