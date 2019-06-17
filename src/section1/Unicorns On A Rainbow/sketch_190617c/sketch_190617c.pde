PImage rainbow;
  PImage unicorn;
void setup(){rainbow = loadImage("image1.png");
size(800, 600);
rainbow.resize(width,height);
unicorn = loadImage("image2.jpg");}
void draw(){
  image(unicorn, 0, 0);
background(rainbow);}
