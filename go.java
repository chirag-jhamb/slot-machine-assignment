package f1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class go {

int honest()                      //function when NO cheat is applied
  {
    int out;
    Random rand = new Random();
    out = rand.nextInt(13);
    return out;
  }

int cheater(String cheat)         ////function when cheat is applied
  {
    Random rand = new Random();
    int out=honest();
    if ("CHEATCODE1".equals(cheat))
      {
        out = rand.nextInt(60);
        if (out>12)
          {out=2;}    //2 is GreenApple, with probability now as 80%
      }
    if ("HAPPYCODE".equals(cheat))
      {
        out = rand.nextInt(22);
        if (out>12)
          {
            if (out%2==0)
              out=11;   //asterisk is 11, with probability now as 25%
            else
              out=12;   //dollar is 12, with probability now as 25%
          }
      }                 //total probability of wildcards is now 50%
    if ("TESTINGCODE".equals(cheat))
        {
          out = rand.nextInt(180);
          if (out>12)
            {
              if (out%4==0)
                out=0;   //kiwi is 0, with probability now as 23.75%
              else
              if (out%3==0)
                out=1;   //RedApple is 1, with probability now as 23.75%
              else
              if (out%2==0)
                out=2;   //GreenApple is 2, with probability now as 23.75%
              else
                out=3;    //Banana is 3, with probability now as 23.75%
            }
        }                 //total probability of fruits is 95%
    if ("TESTING123".equals(cheat))
        {
          out = rand.nextInt(48);
          if (out>12)
            {out=5;}    //5 is Yellowbus, with probability now as 75%
        }
    if ("BINGO555".equals(cheat))
        {
          out = rand.nextInt(120);
          if (out>12)
            {out=12;}    //12 is Dollar, with probability now as 90%
        }  
    return out;
  }   
int[] go(String cheat){
  int x=0;
  int[] op= new int[3];
  
	String CheatFile = "/home/cj/NetBeansProjects/F1/src/f1/cheatCodes.txt";       //address of cheatcode file
	BufferedReader br = null;
	String line;
	String splitBy= ",";
	try {  
		br = new BufferedReader(new FileReader(CheatFile));
		while ((line = br.readLine()) != null) 
    {
      String[] arr = line.split(splitBy);
      if (arr[0].equals(cheat))
        {
          x=Integer.parseInt(arr[2]);          //save the REUSE value of the entered cheat
   
        }
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
  
  if (x==0)
    {
      for(int i=0; i<3; i++)
        {System.out.println(i+ "check 2" +x);
          op[i]= honest();                   //When REUSE value is 0, 
         
        }
    }
  else
  if(x!=0)
    {
      for(int i=0; i<3; i++)
        {System.out.println("check 3");
          op[i]=cheater(cheat);     //Cheat applied and result saved in array
          
        }
      x=x-1;                        //Cheat REUSE value decreased
    }               //END OF IFELSE       
    return op;
  }
 
}