package com.pukhova;

/**
 * This class contains methods for management of set of songs, written to disk
 * and we gave possibility to write it down track by track, or in some collection
 */

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Disk {

	public Set<Track> diskCollection = new HashSet<Track>();

	public void writeDisk(Track t){
		diskCollection.add(t);
	}

	public void writeDisk(Collection<Track> tracks){
		diskCollection.addAll(tracks);
	}

	public int countTotalDuration(){
		int totalDur = 0;
		for (Track t : diskCollection){
			totalDur += t.getDuration();
		}
		return totalDur;

	}
	/**
	 * This method stands for sorting out our collection by adding it to TreeSet
	 */
	public TreeSet<Track> sortByStyle(){
		return new TreeSet<Track>(diskCollection);
	}

	/**
	 * In this method we can search songs, that match some needed range of duration
	 */
	public Set<Track> searchByDuration(int minDur, int maxDur){
		Set<Track> searchByDuration = new HashSet<Track>();
		if (minDur >= maxDur){
			throw new IllegalArgumentException();
		}
		for (Track t : diskCollection){
			if(t.getDuration() >= minDur && t.getDuration() <=maxDur){
				searchByDuration.add(t);
			}
		}
		return searchByDuration;
	}

	@Override
	public String toString() {
		return "Disk [diskCollection=" + diskCollection + "]";
	}
	
	public int getTracksCount(){
		return diskCollection.size();
	}

}
