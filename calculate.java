

/**
 *
 * @author cj
 */
package f1;
import java.lang.Math;
public class calculate extends go
    {
//String[] figure = {"kiwi.jpg", "appleRed.jpg", "appleGreen.jpg", "banana.jpg", "Taxi.jpg", "busYellow.jpg", "busRed.jpg", "truck.jpg", "1.jpg", "2.jpg", "3.jpg", "asterisk.jpg", "dollar.jpg"};
String[] color = {"g", "r", "g", "y", "y", "y", "r", "g"};
int[] value = {10, 15, 18, 12, 8, 15, 20, 5, 10, 20, 30, 40, 100};
int[] cat= {5,5,5,5,3,3,3,3,8,8,8,80,80};
int calc (int[] arr)
  {
    int i=arr[0];
    int j=arr[1];
    int k=arr[2];        
    int p1=0, p2=0, p3=0,p=0;
    if (i==j && j==k)
      {
        p1= value[i]*10; //3 identical figures
      }
    else
    if (i==j || j==k || i==k ) //2 identical figures
      {
        if (Math.max(cat[i],cat[j])==80)
          {
            p1= 5*value[k];   //when i or j is the wildcard
          }
        else
        if (Math.max(cat[k],cat[j])==80)
          {
            p1= 5*value[i];   //when j or k is the wildcard
          }
        else
          {
            p1= 3*Math.max(value[i],value[j]); //No wildcard and 2 identical figures
          }
      }    //end of IF

    if (cat[i]==cat[j] && cat[j]==cat[k])
      {
        p2=2*cat[i];            //for Same category
      }    //end of IF
try{
    if (color[i].equals(color[j]) && color[j].equals(color[k]))
      {
        p3=3*Math.max(value[i],Math.max(value[j],value[k]));}    //for Same ColourType
      }catch(ArrayIndexOutOfBoundsException exception) {p3=0;}
          //end of IF
    System.out.println(p1+" "+ p2+" "+ p3);
    p=value[i]+value[j]+value[k];
    p=Math.max(p, Math.max(p1,Math.max(p2,p3)));
    return p;
   }

}
