/**
 * Creates class CD, Takes songs into array list and creates methods to complete a task.
 * @author Kyrtis Scott
 *
 */

import java.util.ArrayList;

public class CD implements DigitalAlbum{

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
	public CD(String song1, String song2, String song3, String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}

	/**
	 * Sets the string fromBegin to the value of playing song 1 and current index.
	 */
	@Override
	public String playFromBeginning() {
		String fromBegin = "Playing song 1 : " + songs.get(currentIndex +1);
		currentIndex++;
		return fromBegin;
	}

	/**
	 * Sets the string playSong to the value of playing, number of the song and name of the song.
	 */
	@Override
	public String playSong(int num) {
		String playSong = "Playing " + String.valueOf(currentIndex +1) + " : "+ songs.get(currentIndex);
		currentIndex++;
		return playSong;
	}

	@Override
	public String prevSong() {
		String prevSong = "Skipping back and playing : " + songs.get(currentIndex-2);
		currentIndex--;
		return prevSong;
	}

	/**
	 * , sets the current index and selects the next song.
	 */
	@Override
	public String nextSong() {
		String nextSong = "Playing " + String.valueOf(currentIndex +1) + " : "+ songs.get(currentIndex);
		currentIndex++;
		return nextSong;
	}

	/**
	 * Stops the song and ejects.
	 */
	@Override
	public String stop() {
		return "Stopping cassett and ejecting.";
	}

	/**
	 * Pauses the song.
	 */
	@Override
	public String pause() {
		return "Pausing";
	}
}
