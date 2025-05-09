package dao;

import db.DBConnector;
import dto.ContactDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author purvi
 */
public class ContactDAO 
{
   void getUserDetail(String username)
    {
        
    }
   
   public ArrayList<ContactDTO> getAllUserDetails()
    {
        ArrayList<ContactDTO> l1 = new ArrayList<ContactDTO>();
        try
        {
            Statement st =  DBConnector.getStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM contacts");
            while(rs.next())
            {
                
                ContactDTO cont  =  new ContactDTO();
                cont.setId(rs.getString(1));
                cont.setName(rs.getString(2));
                cont.setPhone(rs.getString(3));
                cont.setEmail(rs.getString(4));
                l1.add(cont);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return l1;
    }
}


