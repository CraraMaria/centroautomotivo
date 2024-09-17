package centroautomotivo;

public class OrdemdeServico {
	public int numeroOS;
	public String nomeResponsavelTecnico;
	public String nomeMecanico;
	public Boolean isAutorizadoLavagem;
	public Boolean isOSfinalizada;
	public String relatosDefeitoCliente;
	
	
	public OrdemdeServico () {}
	

	public int getNumeroOS() {
		return numeroOS;
	}

	public void setNumeroOS(int numeroOS) {
		this.numeroOS = numeroOS;
	}

	public String getNomeResponsavelTecnico() {
		return nomeResponsavelTecnico;
	}

	public void setNomeResponsavelTecnico(String nomeResponsavelTecnico) {
		this.nomeResponsavelTecnico = nomeResponsavelTecnico;
	}

	public String getNomeMecanico() {
		return nomeMecanico;
	}

	public void setNomeMecanico(String nomeMecanico) {
		this.nomeMecanico = nomeMecanico;
	}

	public Boolean getIsAutorizadoLavagem() {
		return isAutorizadoLavagem;
	}

	public void setIsAutorizadoLavagem(Boolean isAutorizadoLavagem) {
		this.isAutorizadoLavagem = isAutorizadoLavagem;
	}

	public Boolean getIsOSfinalizada() {
		return isOSfinalizada;
	}

	public void setIsOSfinalizada(Boolean isOSfinalizada) {
		this.isOSfinalizada = isOSfinalizada;
	}

	public String getRelatosDefeitoCliente() {
		return relatosDefeitoCliente;
	}

	public void setRelatosDefeitoCliente(String relatosDefeitoCliente) {
		this.relatosDefeitoCliente = relatosDefeitoCliente;
	}
	
    public OrdemdeServico(int numeroOS, String nomeResponsavelTecnico, String nomeMecanico, Boolean isAutorizadoLavagem, Boolean isOSfinalizada, String relatosDefeitoCliente) {
        this.numeroOS = numeroOS;
        this.nomeResponsavelTecnico = nomeResponsavelTecnico;
        this.nomeMecanico = nomeMecanico;
        this.isAutorizadoLavagem = isAutorizadoLavagem;
        this.isOSfinalizada = isOSfinalizada;
        this.relatosDefeitoCliente = relatosDefeitoCliente;
    }

	public static void main(String[] args) {
        OrdemdeServico ordemdeServico = new OrdemdeServico();

        // Definindo atributos usando setters
        ordemdeServico.setNumeroOS(1111);
        ordemdeServico.setNomeResponsavelTecnico("João Marcos");
        ordemdeServico.setNomeMecanico("Ana Maria");
        ordemdeServico.setIsAutorizadoLavagem(true);
        ordemdeServico.setIsOSfinalizada(false);
        ordemdeServico.setRelatosDefeitoCliente("Não teve defeito");

        // Imprimindo informações completas da ordem de serviço
        System.out.println("Informações do Serviço:");
        System.out.println("Número do Serviço: " + ordemdeServico.getNumeroOS());
        System.out.println("Responsável Técnico: " + ordemdeServico.getNomeResponsavelTecnico());
        System.out.println("Nome do Mecânico: " + ordemdeServico.getNomeMecanico());
        System.out.println("Lavagem Autorizada: " + ordemdeServico.getIsAutorizadoLavagem());
        System.out.println("Serviço Finalizado: " + ordemdeServico.getIsOSfinalizada());
        System.out.println("Relatos de Defeito pelo Cliente: " + ordemdeServico.getRelatosDefeitoCliente());
    }
	
}
