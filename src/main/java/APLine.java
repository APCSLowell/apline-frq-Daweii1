public class APLine
{
  private double a,b,c;

  public APLine(int x,int y,int z) {
    a = x;
    b = y;
    z = c;

  }

  public double getSlope() {
  double boom = (-a)/b;
    return boom;


  }

  public boolean isOnLine(int xCord, int yCord) {
  if(yCord == (((-a*xCord)-c)/b))
    return true;

    else
    return false;

  }

  
}
