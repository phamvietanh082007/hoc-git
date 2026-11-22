import java.util.*;

interface hoicuoi{
    void xong();

}
 class voiu {
  public int tuoi;
  public double sodu;
  public double chotien(double a){
   System.out.println("give vanh $"+a+" as sinh le");
   return a;
  }

}
class ChuRe extends voiu implements hoicuoi{
    @Override
    public void xong() {
        System.out.println("Dam cuoi thanh cong!");
    }
}
public class PR_alone{
    public static void main (String[] args){
   ChuRe h = new ChuRe();

        h.tuoi = 35;
        h.chotien(5.4);
        h.xong();
}}