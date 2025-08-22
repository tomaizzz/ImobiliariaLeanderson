package imobiliaria;

public class Imovel {
    private int id;
    private String endereco;
    private double valor;
    private boolean disponivel;

    public Imovel(int id, String endereco, double valor, boolean disponivel) {
        this.id = id;
        this.endereco = endereco;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public int getId() { return id; }
    public String getEndereco() { return endereco; }
    public double getValor() { return valor; }
    public boolean isDisponivel() { return disponivel; }
}
