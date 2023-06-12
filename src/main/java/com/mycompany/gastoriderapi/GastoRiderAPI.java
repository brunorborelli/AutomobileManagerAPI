/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gastoriderapi;


import static DB.DataBaseConnection.Conexao;
import com.mycompany.gastoriderapi.Controller.UsuarioController;
import com.mycompany.gastoriderapi.DAO.UsuarioDao;
import static com.mycompany.gastoriderapi.OperacoesIniciais.exibirMenu;
import com.mycompany.gastoriderapi.Servico.UsuarioService;
import java.io.IOException;
import java.util.Scanner;

public class GastoRiderAPI {


    public static void main(String[] args) throws IOException {
        
        Conexao(); 
        exibirMenu();
  
//        UsuarioDao usuarioDao = new UsuarioDao();
//        UsuarioService usuarioService = new UsuarioService(usuarioDao);
//        UsuarioController usuarioController = new UsuarioController(usuarioService);
//        Scanner scanner = new Scanner(System.in);
//        int opcao = 0;
//
//        while (opcao != 2) {
//            System.out.println("=== Menu de Opções ===");
//            System.out.println("1. Exibir todos os usuários");
//            System.out.println("2. Sair");
//            System.out.print("Digite a opção desejada: ");
//            opcao = scanner.nextInt();
//            scanner.nextLine(); // Limpar o buffer
//
//            switch (opcao) {
//                case 1:
//                    usuarioController.exibirUsuarios();
//                    break;
//                case 2:
//                    System.out.println("Encerrando o programa.");
//                    break;
//                default:
//                    System.out.println("Opção inválida. Tente novamente.");
//                    break;
//            }
//        
//        }
//        
//        scanner.close();
    }
            
        
    }

            
            //------------------------------Start 'Hard Test Insert'-------------------------------------//
//            String sqlInsert = "INSERT INTO carros (descricao, status) VALUES (?, ?)";;
//            PreparedStatement statement2 = connection.prepareStatement(sqlInsert);
//            statement2.setString(1, "Kombi");
//            statement2.setInt(2,1);
//
//            int rowsInserted = statement2.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("Registro inserido com sucesso!");
//            }
            //------------------------------End 'Hard Test Insert'---------------------------------------//
           
            //------------------------------Start 'Hard Test Get'----------------------------------------//
            
//            String sqlGet = "SELECT id, descricao, status FROM carros";
//            PreparedStatement statement1 = connection.prepareStatement(sqlGet);
//            ResultSet result = statement1.executeQuery();
//            
//              while (result.next()) {
//                long id = result.getLong("id");
//                String descricao = result.getString("descricao");
//                boolean status = result.getBoolean("status");
//
//                System.out.println("Carro ID: " + id + ", Descrição: " + descricao + ", Status: " + status);
//            }
            //------------------------------End 'Hard Test Get'-----------------------------------------//
            

            
            //------------------------------Start 'Hard Test Delete'------------------------------------//
            
//            String sqlDelete = "DELETE FROM carros WHERE id = ?";
//            PreparedStatement statement3 = connection.prepareStatement(sqlDelete);
//            statement3.setLong(1, 5L); // Valor do ID a ser excluído
//
//            int rowsDeleted = statement3.executeUpdate();
//            if (rowsDeleted > 0) {
//                System.out.println("Registro excluído com sucesso!");
//            } else {
//                System.out.println("Nenhum registro foi excluído.");
//            }
            
            //------------------------------End 'Hard Test Delete'--------------------------------------//
            
            //------------------------------Start 'Hard Test Update'------------------------------------//
            
//            String sqlUpdate = "UPDATE carros SET status = ? WHERE id = ?";
//            PreparedStatement statement = connection.prepareStatement(sqlUpdate);
//            statement.setInt(1, 0); // Novo valor do campo 'status'
//            statement.setLong(2, 2L); // Valor do ID do registro a ser atualizado
//
//            int rowsUpdated = statement.executeUpdate();
//            if (rowsUpdated > 0) {
//                System.out.println("Registro atualizado com sucesso!");
//            } else {
//                System.out.println("Nenhum registro foi atualizado.");
//            }
            
            //------------------------------End 'Hard Test Update'--------------------------------------//
            

        


