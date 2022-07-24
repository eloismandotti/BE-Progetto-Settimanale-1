
public class Image extends Media implements Viewable{

	private int brightness;
	
	public Image(String title, int brightness) {
		super(title);
		
		this.brightness = brightness;

	
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		String brightnessCount = "";
		
		for ( int i = 0; i < this.brightness; i++ ) {
			
			brightnessCount += "*";
			
			}
		
		System.out.println(title + brightnessCount);
		
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
