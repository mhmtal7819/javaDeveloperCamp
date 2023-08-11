import java.sql.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws SQLException {
        InsertDemo();
        SelectDemo();
        UpdateDemo();
        DeleteDemo();
    }

    public static void SelectDemo() throws SQLException{
        Connection connection=null; //baglantı sorgulama
        Statement statement=null; //sonuc alma
        ResultSet resultSet;      //veritabanından alınan sonucu temsil eder
        DbHelper helper=new DbHelper();
        ArrayList<Country> countries=new ArrayList<Country>();
        try{

            connection= helper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select Code,Name,Continent,Region from country");
            while(resultSet.next()){
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region"))); //tum ulkelerin bilgilerini arraylist e aktardık
            }
            System.out.println(countries.size());
        }catch(SQLException exception){
            helper.ShowErrorMessage(exception);
        }
        finally{
            connection.close();
        }
    }

    public static void InsertDemo() throws SQLException { //kayıt ekleme
        Connection connection=null; //baglantı sorgulama
        PreparedStatement statement=null; //sonuc alma kayıt eklenirken prepared kullanılır
        ResultSet resultSet;      //veritabanından alınan sonucu temsil eder
        DbHelper helper=new DbHelper();

        try{

            connection= helper.getConnection();


            statement=connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values ('Düzce','TUR','Düzce',50000)");
            statement.executeUpdate(); //guncelleme yapar
          System.out.println("Yeni kayıt olusturuldu");
        }catch(SQLException exception){
            helper.ShowErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
        }
    }

    public static void UpdateDemo() throws SQLException { //guncelleme kodları
        Connection connection=null; //baglantı sorgulama
        PreparedStatement statement=null; //sonuc alma kayıt eklenirken prepared kullanılır
        ResultSet resultSet;      //veritabanından alınan sonucu temsil eder
        DbHelper helper=new DbHelper();

        try{

            connection= helper.getConnection();
            String sql="update city set population = 80000 where ?"; //4082 numaralı sehrin nufusunu değiştir


            statement=connection.prepareStatement(sql);
            statement.setInt(1,4082); //4082 yi kullanıcıdan aldık
            statement.executeUpdate(); //guncelleme yapar
            System.out.println("Kayıt Güncellendi");
        }catch(SQLException exception){
            helper.ShowErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
        }

    }

    public static void DeleteDemo() throws SQLException { //kayıt silme
        Connection connection=null; //baglantı sorgulama
        PreparedStatement statement=null; //sonuc alma kayıt eklenirken prepared kullanılır
        ResultSet resultSet;      //veritabanından alınan sonucu temsil eder
        DbHelper helper=new DbHelper();

        try{

            connection= helper.getConnection();
            String sql="delete city set population = 80000 where ?"; //4082 numaralı sehrin nufusunu değiştir


            statement=connection.prepareStatement(sql);
            statement.setInt(1,4082); //4082 yi kullanıcıdan aldık
            statement.executeUpdate(); //guncelleme yapar
            System.out.println("Kayıt Silindi");
        }catch(SQLException exception){
            helper.ShowErrorMessage(exception);
        }
        finally{
            statement.close();
            connection.close();
        }
    }
}