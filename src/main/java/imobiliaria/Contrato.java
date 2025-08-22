package imobiliaria;

import java.time.LocalDate;

public class Contrato {
    private int id;
    private int clienteId;
    private int imovelId;
    private double valor;
    private LocalDate inicio;
    private LocalDate fim;

    public Contrato(int id, int clienteId, int imovelId, double valor, LocalDate inicio, LocalDate fim) {
        this.id = id;
        this.clienteId = clienteId;
        this.imovelId = imovelId;
        this.valor = valor;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getId() { return id; }
    public int getClienteId() { return clienteId; }
    public int getImovelId() { return imovelId; }
    public double getValor() { return valor; }
    public LocalDate getInicio() { return inicio; }
    public LocalDate getFim() { return fim; }
}
