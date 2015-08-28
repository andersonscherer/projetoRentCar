package Cadastro;

import java.time.LocalDate;

public class Veiculo {

	public Integer anoFabricacao;
	public LocalDate dataFabricacao;
	public String quilometragem;
	public String combustivel;
	public String quantidadedePortas;
	public String corExterna;
	public String placaCarro;
	public String blindagem;
	
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getQuantidadedePortas() {
		return quantidadedePortas;
	}
	public void setQuantidadedePortas(String quantidadedePortas) {
		this.quantidadedePortas = quantidadedePortas;
	}
	public String getCorExterna() {
		return corExterna;
	}
	public void setCorExterna(String corExterna) {
		this.corExterna = corExterna;
	}
	public String getPlacaCarro() {
		return placaCarro;
	}
	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}
	public String getBlindagem() {
		return blindagem;
	}
	public void setBlindagem(String blindagem) {
		this.blindagem = blindagem;
	}
	
}
