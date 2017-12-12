package services;

        import beans.TechnologicalProcess;
        import db.Database;

        import javax.swing.*;
        import java.sql.Connection;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;
        import java.util.ArrayList;
        import java.util.logging.Level;
        import java.util.logging.Logger;

public class TechnologicalProcessList {

    private ArrayList<TechnologicalProcess> technologicalProcessList = new ArrayList<TechnologicalProcess>();

    private ArrayList<TechnologicalProcess> getTechnologicalProceses (String str) {

        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = Database.getConnection();

            stmt = conn.createStatement();
            System.out.println(str);
            rs = stmt.executeQuery(str);
            while (rs.next()) {
                TechnologicalProcess technologicalProcess = new TechnologicalProcess();
                technologicalProcess.setId(rs.getLong("id"));
                technologicalProcess.setNameOperation(rs.getString("nameOperation"));
                technologicalProcess.setPerformance(rs.getInt("performance"));
                technologicalProcess.setEquipment(rs.getString("equipment"));
                technologicalProcess.setSequence(rs.getInt("sequence"));
                technologicalProcess.setImage(rs.getBytes("image"));
                technologicalProcessList.add(technologicalProcess);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TechnologicalProcessList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//            try {
//                if (stmt != null) {
//                    stmt.close();
//                }
//                if (rs != null) {
//                    rs.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(BookList.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        System.out.println(technologicalProcessList);
        return technologicalProcessList;
    }

    public ArrayList<TechnologicalProcess> getAllTechnologicalProcess() {
        if (!technologicalProcessList.isEmpty()) {
            return technologicalProcessList;
        } else {
            return getTechnologicalProceses("select * from smartFactory.technologicalprocess");
        }
    }



    public ArrayList<TechnologicalProcess> getTechnologicalProcessByNameOperation(long id) {
        return getTechnologicalProceses("select * from smartFactory.technologicalprocess where="+id);

    }
}
