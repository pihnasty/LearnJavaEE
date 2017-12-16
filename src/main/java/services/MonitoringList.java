package services;

import beans.Monitoring;
import db.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MonitoringList{
    private ArrayList<Monitoring> monitoringList = new ArrayList<Monitoring>();

    private ArrayList<Monitoring> getMonitoring (String str) {

        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = Database.getConnection();

            stmt = conn.createStatement();
            System.out.println(str);
            rs = stmt.executeQuery(str);
            while (rs.next()) {
                Monitoring monitoring = new Monitoring();
                monitoring.setId(rs.getLong("id"));
                monitoring.setNameOperation(rs.getString("nameOperation"));
                monitoring.setStatusPacklogs(rs.getLong("statusPacklogs"));
                monitoring.setPlanCapacity(rs.getLong("planCapacity"));
                monitoring.setActualCapacity(rs.getLong("actualCapacity"));
                monitoring.setPerformanceDeviation(rs.getLong("performanceDeviation"));
                monitoring.setPreparednessRatePlan(rs.getLong("preparednessRatePlan"));
                monitoring.setPreparednessRateFact(rs.getLong("preparednessRateFact"));
                monitoring.setPerformanceAberrant(rs.getLong("performanceAberrant"));

                monitoringList.add(monitoring);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MonitoringList.class.getName()).log(Level.SEVERE, null, ex);
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
        System.out.println(monitoringList);
        return monitoringList;
    }

    public ArrayList<Monitoring> getAllMonitoring() {
        if (!monitoringList.isEmpty()) {
            return monitoringList;
        } else {
            return getMonitoring("SELECT * FROM smartFactory.monitoring;");
        }
    }



    public ArrayList<Monitoring> getMonitoringListByNameOperation(long id) {
        return getMonitoring("select * from smartFactory.monitoring where="+id);

    }
}
