package imobiliaria;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;

    public Cliente(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
}
