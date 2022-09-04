import GLOOP.*;

public class Baum{
    protected GLZylinder stamm;
    protected GLKugel krone;
    
    protected int stammlaenge = 150;
    Baum(double x, double z){
        stamm = new GLZylinder(x, 150/ 2, z , 30 , 150);
    }
}