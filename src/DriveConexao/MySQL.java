package DriveConexao;
import java.sql.*;

public class MySQL{
   
        private Connection conn = null;
        private Statement statement;
        private ResultSet resultSet;
        
        private String servidor = "localhost:3306";
        private String nome_banco = "LojaLotus";
        private String usuario = "root";
        private String senha = "Nasc1ment0@#$%";   
        
        public MySQL(){}
        
        public MySQL(String servidor, String nome_banco, String usuario, String senha){
            this.servidor = servidor;
            this.nome_banco = nome_banco;
            this.usuario = usuario;
            this.senha = senha;
    }
        public Connection getConn() {
            return conn;
        }

        public void setConn(Connection conn) {
            this.conn = conn;
        }

        public Statement getStatement() {
            return statement;
        }

        public void setStatement(Statement statement) {
            this.statement = statement;
        }

        public ResultSet getResultSet() {
            return resultSet;
        }

        public void setResultSet(ResultSet resultSet) {
            this.resultSet = resultSet;
        }
        
        public void conectaBanco(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nome_banco, usuario, senha);            
            if(conn != null){
                System.out.println("Conexão realizada com sucesso!");
            
            }        
        
        }catch(Exception e){
            
            System.out.println("Falha ao realizar a conexão - ERRO: " + e.getMessage());        
        
        }   
    }
        public boolean fechaBanco(){
        try{
            conn.close();
            return true;
        
        
        }catch(Exception e){
            System.out.println("Falha ao fechar o banco" + e.getMessage());
            return false;
        }
    }
    public int insertSql(String SQL){
        int status = 0;
        try{
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());            
            
            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(SQL);
            
            return status;           
        
        }catch(SQLException ex){
            ex.printStackTrace();
            return status;       
        
        }  
    
    }
    public void executarSQL(String sql){
    
        try{
            this.statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            this.resultSet = this.statement.executeQuery(sql);
            
        
        }catch(SQLException sqlex){        
            sqlex.printStackTrace();
        }
    
    }
    public boolean updateSQL(String pSQL){
        try{
            //createStatement de conn para criar o Statement
            this.setStatement(getConn().createStatement());
            
            // Definido o Statement, executamos a query no banco de dados
            getStatement().executeUpdate(pSQL);
        
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        
        }    
        return true;
    }  
    
    
}
