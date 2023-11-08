package Entidades;

public class Terceirizado extends Funcionario{

    private Double valorAdicional;

    public Terceirizado(){}

    public Terceirizado(Double valorAdicionsl) {
        this.valorAdicional = valorAdicionsl;
    }

    public Terceirizado(String nome, Integer horas, Double valorPorHora, Double valorAdicionsl) {
        super(nome, horas, valorPorHora);
        this.valorAdicional = valorAdicionsl;
    }

    public Double getValorAdicionsl() {
        return valorAdicional;
    }

    public void setValorAdicionsl(Double valorAdicionsl) {
        this.valorAdicional = valorAdicionsl;
    }

    @Override
    public Double pagamento() {
        valorAdicional = (valorAdicional * 110) / 100;
        return super.pagamento() + valorAdicional;

    }
}
