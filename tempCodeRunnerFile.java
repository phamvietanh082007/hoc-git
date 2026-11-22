import java.util.*
interface hoicuoi(){
    void xong();

}
public abstract class voiu implements hoicuoi (){
  public int tuoi;
  public double sodu;
  public abstract double chotien(double a){
    System.out.printf(" give viet anh $"+a+ " as sinh le");
    return a;
  }

}

public class Main{
    public static void main (String[] args){
     voiu h = new voiu();
     h.tuoi=35;
     h.chotien(5.4);  
    }
}