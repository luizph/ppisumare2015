package utilitarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection abrirConexao(){
            Connection con = null;
                try{
                        String url = "";
                        url = "jdbc:mysql://127.0.0.1/cadastrocliente?user=root&password=root";
                        con = (Connection) DriverManager.getConnection(url);
                }catch(SQLException e){
                    e.getMessage();
                   }
                return con;
        }
        public static void fecharConexao(Connection con){
            try{
                    con.close();
          }catch(SQLException e){
                    e.getMessage();

        }}}
    

