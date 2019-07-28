int y = 0;
    int randomNumber = (int) random (500);
  int score = 0;
  
void setup() {
  size(500, 500);

}

void draw() {

background(255, 255, 255);
fill(0, 142, 255, 100);
stroke(0, 70, 255, 100);
ellipse(randomNumber, y, 10, 10);
y = y + 7;

fill(240, 75, 86);
stroke(240, 44, 57);
rect(mouseX, 450, 50, 50);
  
   if(y==448) {
checkCatch(randomNumber);
   }

if (y>501) {
y = 0;
randomNumber = (int) random (500);
}

fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}

void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
