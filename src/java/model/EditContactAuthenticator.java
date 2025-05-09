package model;

import db.DBConnector;
import dto.ContactDTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author purvi
 */
public class EditContactAuthenticator 
{
    public boolean isEdit(ContactDTO cont)
    {
        String id = cont.getId();
        String name = cont.getName();
        String email = cont.getEmail();
        String phone =  cont.getPhone();
        
        if (id == null || name == null || email == null || phone == null ||phone.trim().isEmpty() || name.trim().isEmpty()) 
        {
            return false;
        }
        
        Statement st = DBConnector.getStatement();
        try
        {
            String query = "UPDATE contacts set name = '"+name+"',phone = '"+phone+"',email = '"+email+"' where id ='"+id+"'";
            int i = st.executeUpdate(query);
            if(i>0)
            {
                System.out.println(i+" Record  Upadted");
                return true;
            }
            else
            {
                System.out.println(" Record Updation Failed");
                return false;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
        }

    }
}

