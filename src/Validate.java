import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Validate{
    static Map<String, String> map = new HashMap<String, String>();
static Map<String,String>map2=new HashMap<String, String>();
    public static boolean checkAdmin (String email, String pass){
        map2.put("admin","admin");

        map.put("heshmat","123456");
        map.put("ali","12345");
        map.put("fatla","12345");
        if(map2.containsKey(email)&&map2.containsValue(pass)){

        return true;
    }


return false;}





    public static boolean checkUser(String email, String pass)

    {
        boolean st =false;
        try{




           if(map.containsKey(email)&&map.containsValue(pass)){



                return true;
            }


            else
                return false;

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }

}