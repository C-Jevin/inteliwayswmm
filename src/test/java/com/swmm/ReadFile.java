package com.swmm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author Chenjh
 * @create 2019-08-03-10:50
 */
public class ReadFile {

    private Logger log = LoggerFactory.getLogger(ReadFile.class);
    public static void readTxtFileAndInsert(String filePath, Connection conn) {
        try {
            String encoding = "UTF-8";
            File file = new File(filePath);
            if (file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt;
                String[] s;
                StringBuffer suffix = new StringBuffer();
                String prefix = "INSERT INTO linkoutm (dt,link,pollutant,depth,flow,velocity,volume,capacity,qual) VALUES ";
                //Objects.requireNonNull(conn).setAutoCommit(false);
                conn.setAutoCommit(false);
                // Statement st = conn.createStatement();
                // 比起st，pst会更好些
                PreparedStatement pst = conn.prepareStatement("");
                long i = 1;
                int j = 1;
                long count = 0;
                Long begin = System.currentTimeMillis();
                while ((lineTxt = bufferedReader.readLine()) != null) {

                    s=lineTxt.split("\t");
                    if(s[0].equals("Date")) continue;
                    //System.out.println(lineTxt);
                    StringBuffer dt = new StringBuffer();
                    dt.append(s[0].substring(6)).append("/").append(s[0], 0, 5);
                    //System.out.println(dt);
                    if (i<=10000) {
                        suffix.append("(").append("\'").append(dt).append(" ").append(s[1]).append("\'").append(", ").append("\'").append(s[2]).append("\'")
                                .append(", ").append("\'").append(s[3]).append("\'").append(", ").append(s[4]).append(", ").append(s[5])
                                .append(", ").append(s[6]).append(", ").append(s[7]).append(", ").append(s[8]).append(", ").append(0).append("),");
                        //j++;
                    }
                   // System.out.println(suffix);
                    if(i==10000){
                        String sql = prefix + suffix.substring(0, suffix.length() - 1);
                        //System.out.println(sql);
                        // 添加执行sql
                        pst.addBatch(sql);
                        // 执行操作
                        pst.executeBatch();
                        // 提交事务
                        conn.commit();

                        pst.clearBatch();
                        i=0;
                        //j=1;
                        suffix = new StringBuffer();
                    }
                    i++;
                    //TestInsert.inserttest();
                    //count++;
                    //if(count==10000000) break;
                    //System.out.println(lineTxt);
                    s = null;
                    //break;
                }
                if(suffix.length()!=0){
                    String sql = prefix + suffix.substring(0, suffix.length() - 1);
                    //System.out.println(sql);
                    // 添加执行sql
                    pst.addBatch(sql);
                    // 执行操作
                    pst.executeBatch();
                    // 提交事务
                    conn.commit();
                }
                pst.close();
                conn.close();
                read.close();
                Long end = System.currentTimeMillis();
                // 耗时
                System.out.println("cast : " + (end - begin) / 1000 + " s");
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
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
            String filepath = "D:\\InteliwaySwmmProject\\SwmmModel\\LinkOUT.txt";
            ReadFile.readTxtFileAndInsert(filepath,conn);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}