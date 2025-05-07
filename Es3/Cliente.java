package Es3;

public class Cliente {
    private String codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String codiceCliente, String nomeCognome, String email, String dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    @Override
    public String toString() {
        return nomeCognome + " (" + email + "), Iscritto il: " + dataIscrizione;
    }
}
