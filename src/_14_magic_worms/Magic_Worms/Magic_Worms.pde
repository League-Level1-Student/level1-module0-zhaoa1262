void setup() {
size(500, 500);
background(255, 255, 255);

}

void draw() {
    makeMagical();
    
for(int i=0; i<300; i++) {
  fill(255, 243, 3);
  noStroke();
ellipse( getWormX(i), getWormY(i), 5, 5);
}

}

float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
