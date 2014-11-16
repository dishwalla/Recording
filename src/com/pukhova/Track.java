package com.pukhova;

/**
 * This class represents all main information about music song
 * 
*/

public class Track extends AudioFile implements Comparable<Track> {
	
	@Override
	public String toString() {
		return "\nTrack [trackName=" + trackName + ", artist=" + artist
				+ ", album=" + album + ", style=" + style + ", duration=" 
				+ super.getDuration() + "]";
	}

	private String trackName;
	private String artist;
	private String album;
	private String style;
	
	public Track(String name, String art, String alb, String stl, int dur){
		this.trackName = name;
		this.artist = art;
		this.album = alb;
		this.style = stl;
		super.setDuration(dur);
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}

	public String getTrackName() {
		return trackName;
	}

	public String getStyle() {
		return style;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((album == null) ? 0 : album.hashCode());
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		result = prime * result
				+ ((trackName == null) ? 0 : trackName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Track other = (Track) obj;
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (style == null) {
			if (other.style != null)
				return false;
		} else if (!style.equals(other.style))
			return false;
		if (trackName == null) {
			if (other.trackName != null)
				return false;
		} else if (!trackName.equals(other.trackName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Track o) {
		return style.compareTo(o.getStyle());
	}

}
