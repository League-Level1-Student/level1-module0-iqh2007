int x = 50;

int y = 10;

int speed =5;

int speed1 =7;

import ddf.minim.*;  

Minim minim;
AudioSample sound;

void setup(){
  
size(800, 800);

background(0, 0, 200);

minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);

  
}

void draw(){
  
background(0, 0, 0);

fill(255, 255, 255);

stroke(200, 0, 0);

ellipse(x, y, 25, 25);


x += speed;

y += speed1;
  
if(x > 800 || x<0){
  speed*=-1;
}

if(y > 800 || y<0){
  speed1*=-1;
}

if(y > 800){
  sound.trigger();
}
 
fill(255,255,255); 
 
rect(mouseX,mouseY, 80, 10);

boolean hit = intersects(x,y,mouseX,mouseY,80);

if(hit == true){
  speed1*=-1;
}




  
  
  
  
  
  
  
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
