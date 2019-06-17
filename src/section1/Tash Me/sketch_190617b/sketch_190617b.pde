PImage mustache;
  PImage friend;
void setup(){friend = loadImage("image1.png");
size(800, 600);
friend.resize(width,height);
mustache = loadImage("image2.png");}
void draw(){background(friend);}
