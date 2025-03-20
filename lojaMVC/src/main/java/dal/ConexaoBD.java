package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
  private static final String URL_MYSQL = "jdbc:mysql://local host:3306/lojabd";
  private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
  private static final String USER = "root";
  private static final String PASSWORD = "aluno";
  
  public static Connection conectar (){
      try {
          Class.forName(DRIVER_CLASS);
          return DriverManager.getConnection(URL_MYSQL, USER, PASSWORD);
      } catch(ClassNotFoundException | SQLException e){
          e.getMessage();
      }
      return null;
  }
  
  public void desconectar (Connection conexao){
      try {
          conexao.close();
      } catch(SQLException e){
          e.getMessage();
      }
  }
}
