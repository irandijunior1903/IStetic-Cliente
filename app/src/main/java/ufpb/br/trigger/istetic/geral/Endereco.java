package ufpb.br.trigger.istetic.geral;

public class Endereco {
    private String rua;
    private String number;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {
        this.rua = "";
        this.number = "";
        this.bairro = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
    }
    public Endereco(String street, String district, String number, String city, String state, String zipCode) {
        this.rua = street;
        this.bairro = district;
        this.number = number;
        this.cidade = city;
        this.estado = state;
        this.cep = zipCode;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
