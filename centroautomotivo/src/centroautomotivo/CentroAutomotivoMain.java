// nota para revisar essa parte aqui
// aprender a usar Igerenciamento

package centroautomotivo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CentroAutomotivoMain {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Toyota", "Etios", "ABC1234", new Date(), 50000.0f, "Maria Clara Fontenele", "123.456.789-00");
        Veiculo veiculo2 = new Veiculo("Honda", "Civic", "XYZ5678", new Date(), 30000.0f, "João Silva", "987.654.321-00");

        OrdemdeServico ordemServico1 = new OrdemdeServico(1111, "João Marcos", "Ana Maria", true, false, "Nenhum defeito");
        OrdemdeServico ordemServico2 = new OrdemdeServico(2222, "Clara Souza", "Pedro Alves", true, true, "Troca de óleo");

        EntregaVeiculoCliente entrega1 = EntregaVeiculoCliente.cadastrarEntrega(1, new Date(), "Maria Clara Fontenele", ordemServico1, true);
        EntregaVeiculoCliente entrega2 = EntregaVeiculoCliente.cadastrarEntrega(2, new Date(), "João Silva", ordemServico2, false);

        List<EntregaVeiculoCliente> entregas = new ArrayList<>();
        entregas.add(entrega1);
        entregas.add(entrega2);

        System.out.println("Consulta da Entrega com número 1:");
        EntregaVeiculoCliente.printInformacoesEntrega(1, entregas);

        boolean isConcluida = EntregaVeiculoCliente.verificarEntregaConcluida(2, entregas);
        System.out.println("Entrega com número 2 concluída: " + (isConcluida ? "Sim" : "Não"));

    }
}
