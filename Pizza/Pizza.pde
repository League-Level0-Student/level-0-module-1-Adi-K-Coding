void setup(){
size(800, 600);
fill(173,113,49); ellipse(400,300,500,500);
fill(200,50,50); ellipse(400,300,490,490);
fill(250,239,13); ellipse(400,300,480,480);
}
void draw(){
PImage baseball = loadImage("baseball.ppm.gif");
baseball.resize(100,100);
PImage pizza = loadImage("Pizza.gif");
pizza.resize(100,100);
if(mousePressed &&(mouseButton == LEFT)){
image (pizza, mouseX-50,mouseY-50);
}
if(mousePressed &&(mouseButton == RIGHT)){
image (baseball, mouseX-50,mouseY-50);
}
}