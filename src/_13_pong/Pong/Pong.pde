int x = 10;
int y = 10;
int speed1 = +10;
int speed2 = +10;
void setup() {
size(800, 500);
background(255, 255, 255);

}

void draw () {
  background(255, 255, 255);
fill(255, 158, 0);
stroke(255, 200, 0);
ellipse(x, y, 30, 30);
x = x + speed1;
y = y + speed2;

if(x>=790) {
speed1=-speed1;
}

else if(x<=10) {
speed1=-speed1;
}

else if(y>=490) {
speed2=-speed2;
}

else if(y<=10) {
speed2=-speed2;
}



if(x<10 && x > width) {

}
}
