Step 1: Create table in oracle database called prod with the following columns
Create table prod(p_pid number(5),p_name varchar2(20),p_price number(5,2));
Insert 3-4 records.
import java.io.*;
import java.sql.*;
class jdb_pre_stmt_dyn{
public static void main(String args[]){
try{
//step1 load the driver class
Class.forName("oracle.jdbc.driver.OracleDriver");
//step2 create the connection object
51
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@192.168.0.3:1521:orcl","cse3","cse3");
//step3 create the statement object
Statement stmt=con.createStatement();
PreparedStatement pstmt=con.prepareStatement("insert into prod values(?,?,?)");
try{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter prod ID No");
int no=Integer.parseInt(br.readLine());
System.out.println("Enter prod Name");
String name=br.readLine();
System.out.println("Enter prod Price");
double price=Double.parseDouble(br.readLine());
pstmt.setInt(1,no);
pstmt.setString(2,name);
pstmt.setDouble(3,price);
pstmt.executeUpdate();
System.out.println("One row inserted");
}
catch(SQLException sqle)
{
System.out.println("Could not insert tuple" +sqle);
}
//step4 execute query
ResultSet rs=stmt.executeQuery("select * from prod");
System.out.println("p_id\t"+"p_name\t"+"p_price\t");
System.out.println("===========================");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//step5 close the connection object
pstmt.close();
stmt.close();
con.close();
}catch(Exception e){ System.out.println(e);} } }