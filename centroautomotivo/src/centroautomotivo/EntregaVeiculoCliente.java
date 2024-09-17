package centroautomotivo;

import java.util.Date;
import java.util.List;

public class EntregaVeiculoCliente {
    private int numeroEntrega;
    private Date dataEntrega;
    private String nomeCliente;
    private OrdemdeServico ordemServico; 
    private boolean isEntregaConcluida;

   
    public EntregaVeiculoCliente() {}

    // Getters e Setters
    public int getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(int numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public OrdemdeServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemdeServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public boolean isEntregaConcluida() {
        return isEntregaConcluida;
    }

    public void setEntregaConcluida(boolean isEntregaConcluida) {
        this.isEntregaConcluida = isEntregaConcluida;
    }


    public static EntregaVeiculoCliente cadastrarEntrega(int numeroEntrega, Date dataEntrega, 
                                                         String nomeCliente, OrdemdeServico ordemServico, 
                                                         boolean isEntregaConcluida) {
        EntregaVeiculoCliente entrega = new EntregaVeiculoCliente();
        entrega.setNumeroEntrega(numeroEntrega);
        entrega.setDataEntrega(dataEntrega);
        entrega.setNomeCliente(nomeCliente);
        entrega.setOrdemServico(ordemServico);
        entrega.setEntregaConcluida(isEntregaConcluida);
        return entrega;
    }

    
    public static void printInformacoesEntrega(int numeroEntrega, List<EntregaVeiculoCliente> entregas) {
        for (EntregaVeiculoCliente entrega : entregas) {
            if (entrega.getNumeroEntrega() == numeroEntrega) {
                System.out.println("Informações da Entrega de Veículo:");
                System.out.println("Número da Entrega: " + entrega.getNumeroEntrega());
                System.out.println("Data da Entrega: " + entrega.getDataEntrega());
                System.out.println("Nome do Cliente: " + entrega.getNomeCliente());
                System.out.println("Entrega Concluída: " + (entrega.isEntregaConcluida() ? "Sim" : "Não"));

                // Imprimindo informações da Ordem de Serviço associada
                if (entrega.getOrdemServico() != null) {
                    System.out.println("Informações da Ordem de Serviço Associada:");
                    System.out.println("Número da OS: " + entrega.getOrdemServico().getNumeroOS());
                    System.out.println("Nome do Responsável Técnico: " + entrega.getOrdemServico().getNomeResponsavelTecnico());
                    System.out.println("Nome do Mecânico: " + entrega.getOrdemServico().getNomeMecanico());
               
                }
                return;
            }
        }
        System.out.println("Entrega não encontrada.");
    }

    // Método para verificar se a entrega está concluída
    public static boolean verificarEntregaConcluida(int numeroEntrega, List<EntregaVeiculoCliente> entregas) {
        for (EntregaVeiculoCliente entrega : entregas) {
            if (entrega.getNumeroEntrega() == numeroEntrega) {
                return entrega.isEntregaConcluida();
            }
        }
        return false;
    }
}