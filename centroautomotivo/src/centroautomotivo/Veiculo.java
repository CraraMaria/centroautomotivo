package centroautomotivo;

import java.util.Date;

public class Veiculo {
	public String marca;
	public String modelo;
	public String placa;
	public Date ano;
	public float quilometragemtotal;
	public String nomeproprietario;
	public String cpfproprietario;
	
	
	
	public Veiculo () {}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public float getQuilometragemtotal() {
		return quilometragemtotal;
	}

	public void setQuilometragemtotal(float quilometragemtotal) {
		this.quilometragemtotal = quilometragemtotal;
	}

	public String getNomeproprietario() {
		return nomeproprietario;
	}

	public void setNomeproprietario(String nomeproprietario) {
		this.nomeproprietario = nomeproprietario;
	}

	public String getCpfproprietario() {
		return cpfproprietario;
	}

	public void setCpfproprietario(String cpfproprietario) {
		this.cpfproprietario = cpfproprietario;
	}
	

// revisar essa parte
	
	public Veiculo(String marca, String modelo, String placa, Date ano, float quilometragemtotal, String nomeproprietario, String cpfproprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.quilometragemtotal = quilometragemtotal;
        this.nomeproprietario = nomeproprietario;
        this.cpfproprietario = cpfproprietario;
    }
	
	public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        // Definindo atributos 
        veiculo.setMarca("Toyota");
        veiculo.setModelo("Etios");
        veiculo.setPlaca("ABC1234");
        veiculo.setAno(new Date()); 
        veiculo.setQuilometragemtotal(50000.0f);
        veiculo.setNomeproprietario("Maria Clara Fontenele");
        veiculo.setCpfproprietario("123.456.789-00");

        // Imprimindo informações completas do veículo
        System.out.println("Informações do Veículo:");
        System.out.println("Marca do veículo: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Quilometragem total: " + veiculo.getQuilometragemtotal());
        System.out.println("Nome do Proprietário: " + veiculo.getNomeproprietario());
        System.out.println("CPF do Proprietário: " + veiculo.getCpfproprietario());
    }
}
