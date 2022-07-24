
public class Video extends Media implements Viewable, Playable{

	private int volume;
	private int brightness;
	private int duration;
	

	
	public Video(String title, int brightness, int duration, int volume) {
		super(title);
		
		this.volume = volume;
		this.brightness = brightness;
		this.duration = duration;
		
		

	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		String volumeCount = "";
	
		for ( int i = 0; i < this.volume; i++ ) {
			
			volumeCount += "!";
			
			}
		
		String brightnessCount = "";
		
		for ( int i = 0; i < this.brightness; i++ ) {
			
			brightnessCount += "*";
			
			}
		
		for ( int i = 0; i < this.duration; i++ ) {
			
			System.out.println(title + volumeCount + brightnessCount);
			
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


	@Override
	public void increaseBightness() {
		brightness++;
	}


	@Override
	public void decreaseBightness() {
		brightness--;
	}

}
