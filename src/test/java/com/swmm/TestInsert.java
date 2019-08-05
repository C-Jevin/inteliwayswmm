package com.swmm;

//import com.mysql.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Objects;

/**
 * @author Chenjh
 * @create 2019-08-02-20:04
 */
public class TestInsert {

    public static void exec3(Connection conn){
        try {
            conn.setAutoCommit(false);
            Long beginTime = System.currentTimeMillis();
            //String prefix = "INSERT INTO inserttest (id,testnum,tesnum1) VALUES ";
            //构造预处理statement
            PreparedStatement pst = conn.prepareStatement("INSERT INTO inserttest (testnum,testnum1) VALUES(?,?) ");
            //1万次循环
            for(int i=1;i<=1000000;i++){
                pst.setInt(1, (int) (i*Math.random()));
                pst.setInt(2, (int) (i*Math.random()*2));
                pst.addBatch();
                //每1000次提交一次
                if(i%10000==0){//可以设置不同的大小；如50，100，500，1000等等
                    pst.executeBatch();
                    conn.commit();
                    pst.clearBatch();
                }
            }
            Long endTime = System.currentTimeMillis();
            System.out.println("pst+batch："+(endTime-beginTime)/1000+"秒");
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     static void inserttest(StringBuilder suffix){
        Connection conn = null;
        if (conn==null){
            conn = createConn();
        }

        //Long begin = new Date().getTime();
        Long begin = System.currentTimeMillis();
        // sql前缀
        String prefix = "INSERT INTO linkout (dt,link,pollutant,depth,flow,velocity,volume,capacity,qual) VALUES ";
        try {
            // 保存sql后缀
            //StringBuffer suffix = new StringBuffer();
            // 设置事务为非自动提交
            Objects.requireNonNull(conn).setAutoCommit(false);
            // Statement st = conn.createStatement();
            // 比起st，pst会更好些
            PreparedStatement pst = conn.prepareStatement("");
            String sql = prefix + suffix.substring(0, suffix.length() - 1);
            // 添加执行sql
            pst.addBatch(sql);
            // 执行操作
            pst.executeBatch();
            // 提交事务
            conn.commit();
            // 外层循环，总提交事务次数
           /* for (int i = 1; i <= 100; i++) {
                // 第次提交步长
                for (int j = 1; j <= 10000; j++) {
                    // 构建sql后缀
                    suffix.append("(" + j * i + ", " + i * j
                            * Math.random() + "),");
                }
                // 构建完整sql
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // 添加执行sql
                pst.addBatch(sql);
                // 执行操作
                pst.executeBatch();
                // 提交事务
                conn.commit();
                // 清空上一次添加的数据
                //suffix = new StringBuffer();
            }*/
            // 头等连接
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 结束时间
        //Long end = new Date().getTime();
        Long end = System.currentTimeMillis();
        // 耗时
        System.out.println("cast : " + (end - begin) / 1000 + " s");
    }

     static Connection createConn(){
        Connection conn = null ;
        String url = "jdbc:mysql://localhost:3306/test";
        String name = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "root";
        try {
            Class.forName(name);
            conn = (Connection) DriverManager.getConnection(url, username, password);
            return conn;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String [] args){
        Connection conn = null ;
        String url = "jdbc:mysql://localhost:3306/test";
        String name = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "root";
        try {
            Class.forName(name);
            conn = (Connection) DriverManager.getConnection(url, username, password);
            //preparedStatement = connection.prepareStatement(sql);
            //exec3(conn);
            //inserttest(conn);
            String filepath = "D:\\InteliwaySwmmProject\\LinkOUT.txt";
            ReadFile.readTxtFileAndInsert(filepath,conn);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}


