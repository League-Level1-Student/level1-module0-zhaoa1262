package Worksheets;

public class ModuleCheckpoint {
public static void main(String[] args) {
	
	if() {
	speak("ouch");
	}
}

static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
}



