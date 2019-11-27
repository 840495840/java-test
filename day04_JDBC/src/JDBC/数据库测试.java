package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ConcurrentModificationException;

public class 数据库测试
{
    public static void main(String[] args)
    {
        //1.导入驱动jar包
        //2.注册驱动

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (Exception e)
        {

        }
        //3.获取数据库连接对象
        try
        {
            //serverTimezone=Asia/Shanghai
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studb?serverTimezone=UTC", "root", "840495840");
            System.out.println("数据库连接成功");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}
