
public class Audio extends Media implements Playable{

	private int duration;
	private int volume;
	
	public Audio(String title, int duration, int volume) {
		super(title);
		
		this.duration = duration;
		this.volume = volume;
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		String volumeCount = "";
	
		for ( int i = 0; i < this.volume; i++ ) {
			
			volumeCount += "!";
			
			}
		
		for ( int i = 0; i < this.duration; i++ ) {
			
			System.out.println(title + volumeCount);
			
			}
		
		
	}

	@Override
	public void increaseVolume() {
		volume++;
	}

	@Override
	public void decreaseVolume() {
		volume--;
	}

}
