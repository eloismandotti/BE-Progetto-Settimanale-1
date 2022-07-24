import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Media[] media = new Media[] { 
					new Image("olga.jpg", 5), 
					new Video("video1.mp4", 5, 4, 20), 
					new Video("video2.mp4", 1, 5, 25), 
					new Audio("audio1.mp3", 3, 30), 
					new Audio("audio2.mp3", 5, 25)
				};


		openMedia(media);
	
	}
	
	public static void openMedia(Media[] media) {
		System.out.println("Select the Media File you want to open:");
		System.out.println("1 - " + media[0].title);
		System.out.println("2 - " + media[1].title);
		System.out.println("3 - " + media[2].title);
		System.out.println("4 - " + media[3].title);
		System.out.println("5 - " + media[4].title);
		System.out.println("(0) - Exit");
		
		int selected = Integer.parseInt(scanner.nextLine());
		
		switch(selected) {
		  case 1:
			    media[0].show();
			  break;
		  case 2:
			  	media[1].play();		    
			    break;
		  case 3:
			  	media[2].play();		    
				break;
		  case 4:
			  	media[3].play();			    
				break;
		  case 5:
			  	media[4].play();			    
				break;
		  case 0:
			    System.out.println("Exiting...");			    
				break;
		  default:
			    // code block
		}
	}

}
