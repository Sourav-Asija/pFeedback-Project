
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahil
 */
class abc {
       
    
    public static void main(String... a)
    {
        try
        {
            
         Class.forName("com.mysql.jdbc.Driver");
       System.out.println("loaded");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfeedback","root","root");
    System.out.println(" connected");
    PreparedStatement st=con.prepareStatement("insert into login(User_id,Password,Email_id)values(?,?,?)");
    st.setString(1,"ASija");
    st.setInt(2, 89012);
    st.setString(3, "souravasija874@gmail.com");
    int a1=st.executeUpdate(); 
    if(a1>0){
    System.out.println("row updated");
    }else {System.out.println("not updated");}
        }catch(SQLException e){}
        catch(Exception e1){e1.printStackTrace();}
        }

}