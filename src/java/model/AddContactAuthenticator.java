package model;

import db.DBConnector;
import dto.ContactDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author purvi
 */
public class AddContactAuthenticator 
{
    public boolean isAdd(ContactDTO cont)
    {
        String id = cont.getId();
        String name = cont.getName();
        String email = cont.getEmail();
        String phone =  cont.getPhone();
        
        Statement st = DBConnector.getStatement();
        try
        {
            String query = "INSERT INTO contacts values('"+id+"','"+name+"','"+phone+"','"+email+"')";
            System.out.println("Query = "+query);
            int i = st.executeUpdate(query);
            System.out.println("Record updated");
            if(i>0)
            {
                System.out.println(i+"Record Insered");
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(id!=null && name!=null && phone!=null && email!=null && !phone.trim().equals("") && !name.trim().equals(""))
        {
            return true;
        }
        return false;
    }
}
