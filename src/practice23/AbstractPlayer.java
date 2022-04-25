package practice23;

public abstract class AbstractPlayer {
	private String mediaName;
	protected abstract void loadDisc();
	protected abstract void playDisc();
	public void play() {
		loadDisc();
		playDisc();
	}
	public String getMediaName() {
		return mediaName;
	}
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

}
