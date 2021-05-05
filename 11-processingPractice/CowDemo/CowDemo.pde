ArrayList<Cow> particles;

void setup() {
    frameRate(30);
    size(1000, 800);
    particles = new ArrayList<Cow>();
    for (int i = 0; i < 100; i++)
        particles.add(new Cow());
}

void draw() {
    background(200);
    for (Cow c : particles) {
        c.move();
        c.display();
    }
    fill(0);
    textSize(20);
    text("FPS: "+frameRate+"\nCows: "+particles.size(),0,20);
}

void mousePressed() {
    //Read about mouseClicked()/mousePressed() and related methods in the documentation.
    //Right click: add a cow at the mouse location.
    //Left click: call the click of each cow
    //println(mouseButton);
    if(mouseButton == 37) { // left button
        for(Cow c : particles) c.click();
    }
    if(mouseButton == 39) { //right button
        particles.add(new Cow(20+(int)(Math.random()*30), mouseX, mouseY,
                              random(6)-3, random(6)-3));
    }
}

void keyPressed() {
  //Read about keyPressed() in the documentation.
  //hint:
  //println(keyCode);
  if(key == 32) {
    particles = new ArrayList<Cow>(0);
  }
}
