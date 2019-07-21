PImage pictureOfRecord; 
int x = 0;
import ddf.minim.*;
Minim minim;  
AudioPlayer song;


void setup() {
  size(600,600);    
  pictureOfRecord= loadImage("record.png");  
   pictureOfRecord.resize(600,600); 
   minim = new Minim(this);
   song = minim.loadFile("awesomeTrack.mp3", 512); 
  song.play();
}

void draw() {
image(pictureOfRecord, 0, 0);
rotateImage(pictureOfRecord, x);
image(pictureOfRecord, 0, 0);
x = x+100;
if(mousePressed) {
x=0;
}
   if(mousePressed) {
   song.pause();
   }
   
   else {
   song.play();
   }
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
