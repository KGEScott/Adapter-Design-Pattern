/**
 * Creates class cassett, Takes songs into array list and creates methods to complete a task.
 * @author Kyrtis Scott
 *
 */

import java.util.ArrayList;

public class Cassett implements AnalogAlbum{

	/**
	 * Creates an ArrayList named songs and sets current index to 0.
	 */
	private ArrayList<String> songs = new ArrayList<String>();
	private int currentIndex = 0;
	
	/**
	 * Passes in songs from the driver.
	 * @param song1 passes in song 1 from driver.
	 * @param song2 passes in song 2 from driver.
	 * @param song3 passes in song 3 from driver.
	 * @param song4 passes in song 4 from driver.
	 * @param song5 passes in song 5 from driver.
	 */
	public Cassett(String song1, String song2, String song3, String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}

	/**
	 * Sets the string playSong to the value of playing song, number of the song, and name of the song..
	 */
	@Override
	public String play() {
		String playSong = "Playing song " + (currentIndex + 1) + " : ";
		currentIndex++;

		return playSong + songs.get(currentIndex-1);
	}

	/**
	 * checks if current index is greater than 1, then sets current index and rewinds the song.
	 */
	@Override
	public String rewind() {
		if(currentIndex > 1) {
			currentIndex = currentIndex -1;
			String rewind = "Rewinding to song " + String.valueOf(currentIndex +1);
			return rewind;
		}
		else {
			String rewind = "Fully Re-Wound";
			return rewind;
		}
	}

	/**
	 * checks if current index is within parameters, then
	 * , sets the current index and fast forwards the song.
	 */
	@Override
	public String ffwd() {
		if (currentIndex <= 4) {
			String ffwd = "Forwarding to song " + String.valueOf(currentIndex+2);
			currentIndex++;
			return ffwd;
		}
		else if(currentIndex == 5) {
			String ffwd = "Forwarded to the end of the cassett";
			return ffwd;
		}
		else {
			String ffwd = "At the end of the cassett, you need to rewind.";
			currentIndex++;
			return ffwd;
		}
	}

	/**
	 * Pauses the song.
	 */
	@Override
	public String pause() {
		return "Pausing...";
	}

	/**
	 * Stops and ejects the song.
	 */
	@Override
	public String stopEject() {
		return "Stopping cassett and ejecting.";
	}
}
