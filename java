//// Project 4:  click button to change background.
////Evelyn Levine

int r,g,b;
float b1X=100, b1Y=100, b1W=80, b1H=40;
int counter=0;

//// SETUP:  size only.  Also set colors.
void setup() {
  size( 640, 480 );
  reset();
}
///reset color
void reset() {
  r=  100;
  g=  200;
  b=  250;
}


//// NEXT:  button only.
void draw() {
  background( r,g,b );
  showButton( b1X, b1Y, b1W, b1H );
  fill(100,0,0);
  text( "Click me!", b1X+b1W/4, b1Y+b1H*2/3 );
}
// Drawing the button.
void showButton( float x, float y, float w, float h ) {
  fill( 255,255,0 );
  rect ( x,y, w,h );
}

//// HANDLERS:  keys & click
void keyPressed() {
  if (key == 'q') exit();
  if (key == 'r') reset();
}
void mousePressed() {
  if ( hit( mouseX,mouseY, 100,100, 80,40 ) ) {
    counter=  counter+1;
    if (counter % 2 > 0) {
      r=  255;
      g=  0;
      b=  0;
    } else {
      reset();
    }
  }
}

//// OTHER METHODS:  detect "hit"
// Return true if "near"
boolean hit( float x1, float y1, float x2, float y2, float w, float h ) {
  boolean result;

  // +++++ STUB ALWAYS RETURNS TRUE!
  if ( abs(x1-x2) < w && abs(y1-y2)<h ) {
    result=  true;
  } else {
    result=false;
  }

  return result;
