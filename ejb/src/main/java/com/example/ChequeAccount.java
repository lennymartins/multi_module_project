package com.example;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.stream.Collectors;

@Stateless(name = "chk")
public class ChequeAccount implements Account {

    /*@Resource(name = "jdbc/ppbmuat")
    private DataSource dataSource;*/

    @PersistenceContext(unitName = "my_unit2")
    private EntityManager em;

    @Override
    public String getString() {
        return "string";
    }

    public String testDB(){
        Connection connection = null;
        String rez = null;
        /*try{
            connection = dataSource.getConnection();
            Statement stmt = connection.createStatement();
            String s = "select * from ppbm_auth_notes where rownum <= 10";
            ResultSet rs = stmt.executeQuery(s);
            int i = 0;
            while (rs.next()){
                rez = rs.getString(1) + " - "+ rs.getString(2);
                break;
            }
            rez = "returned value: " + rez;
            System.out.println(rez+ " returned");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }*/
        return rez;
    }

    @Override
    public List<PpbmAddressDetail> testPU() {
        List<PpbmAddressDetail> returned = null;
        try {
            //Query query = em.createNamedQuery("PpbmAddressDetail.findAll");
            Query query = em.createQuery("SELECT p FROM PpbmAddressDetail p where p.addressDetailId <= 572");
            List<PpbmAddressDetail> list = query.getResultList();
            returned = list.stream().limit(10).collect(Collectors.toList());
        }catch (Exception e){
            e.printStackTrace();
        }
        return returned;
    }
}
