
package Objetos;

import Objetos.Cliente;
import DriveConexao.MySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {
    public static ResultSet carregaTabela() throws SQLException{
        MySQL conecta = new MySQL();
        PreparedStatement pmst = conecta.getConn().prepareStatement(
                "SELECT id, nomeCliente, cpf FROM CadastroCliente");
        ResultSet rs = pmst.executeQuery();
        return rs;
    }
}
