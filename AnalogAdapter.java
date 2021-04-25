/**
 * passes information to other class.
 * @author Kyrtis Scott
 *
 */
public class AnalogAdapter implements AnalogAlbum {
	private DigitalAlbum album;
	
	/**
	 * sets the information from album to this album.
	 * @param album passes in information to then be set as album.
	 */
	public AnalogAdapter(DigitalAlbum album) {
		this.album = album;
	}

	/**
	 * Plays the album song.
	 */
	@Override
	public String play() {
		return album.playSong(0);
		
	}

	/**
	 * selects the previous song in the album.
	 */
	@Override
	public String rewind() {
		return album.prevSong();
	}

	/**
	 * sets the next song in the album.
	 */
	@Override
	public String ffwd() {
		return album.nextSong();
	}

	/**
	 * pauses the song in the album.
	 */
	@Override
	public String pause() {
		return album.pause();
	}

	/**
	 * stops and ejects the song in the album.
	 */
	@Override
	public String stopEject() {
		return album.stop();
	}

}
