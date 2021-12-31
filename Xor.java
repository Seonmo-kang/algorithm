
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Xor {

    public static String stringsXOR(String s, String t) {
        String res = "";
        String resTemp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)){
                res = "0";
                resTemp = resTemp.concat(res);
            }
            else{
                res = "1";
                resTemp = resTemp.concat(res);
            }
        }
        return resTemp;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        //System.out.println(stringsXOR(s, t));
        //From SonarLint, It must be with logger.log("Message");
        Logger logger = Logger.getLogger(Xor.class.getName());
        logger.log(Level.INFO,"{0}",stringsXOR(s, t));
        in.close();
    }

}



