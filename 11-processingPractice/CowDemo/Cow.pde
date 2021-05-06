public class Cow {
    float x, y, dx, dy, radius;
    color c;
    boolean colliding;
    boolean selected;

    Cow(float rad, float x, float y, float dx, float dy) {
        radius = rad;
        this.x = x;
        this.y = y;
        this.dx = (int)(dx*100)/100.0;
        this.dy = (int)(dy*100)/100.0;
        c = color(random(255),random(255),random(255));
    }

    Cow() {
        this(20+(int)(Math.random()*30), width/2, height/2,
        random(6)-3,
        random(6)-3);
    }

    void move() {
        x += dx;
        y += dy;
        if (x >= width - radius || x <= radius) dx *= -1;
        if (y >= height - radius || y <= radius) dy *= -1;
    }

    void display() {
        // collide(particles);
        if(colliding) fill(187, 0, 0, 100); // translucent red on collision
        else fill(c);
        stroke(0);
        ellipse(x, y, radius*2, radius*2);
        if(selected) {
            fill(0); // eyes
            noStroke();
            ellipse(x - .2 * radius, y - .7 * 10, radius * .1, radius * .6);
            ellipse(x + .2 * radius, y - .7 * 10, radius * .1, radius * .6);

            textSize(10); // velocities
            text("dx: " + dx + "\ndy: " + dy,
                 x + radius + 5, y);

            noFill(); // smile
            stroke(0);
            beginShape();
            curveVertex(x - .8 * radius, y);
            curveVertex(x - .8 * radius, y);
            curveVertex(x - .5 * radius, y + .5 * radius);
            curveVertex(x, y + .7 * radius);
            curveVertex(x + .5 * radius, y + .5 * radius);
            curveVertex(x + .8 * radius, y);
            curveVertex(x + .8 * radius, y);
            endShape();
        }
    }

    void click(){
    //if the mouseX and mouseY are touching this cow, change the cow somehow.
        if(dist(mouseX, mouseY, x, y) <= radius) {
            c = color(random(255),random(255),random(255));
            selected = !selected;
        }
    }

    void collide(ArrayList<Cow> others) {
        colliding = false;
        for(Cow c : others){
            if(c != this) {
                // colliding = dist(x, y, c.x, c.y) <= radius + c.radius ? true : false;
                if(dist(x, y, c.x, c.y) <= radius + c.radius) colliding = true;
            }
        }

    }

}
