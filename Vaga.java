import java.util.ArrayList;

public class Vaga extends Generic {
    
    private String numero;
    private String tipo;
    private String tamanho;
    private String preco;
    

    private static ArrayList<Vaga> vagas = new ArrayList<Vaga>();

    public Vaga(String numero, String tipo, String tamanho, String preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;

        vagas.add(this);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getPreco(){
        return preco;
    }
    public void setPreco(String preco){
        this.preco = preco;
    }

    public static Vaga verificarId(int id) throws Exception{
        for(Vaga vaga : vagas){
            if(vaga.id == id){
                return vaga;
            }
        }
        throw new Exception("Vaga não existe");
    }


    public static void removeVaga(int id) throws Exception{
        Vaga vaga = getVaga(id);
        vagas.remove(vaga);
}

    @Override
    public String toString() {
        return "Id: " + id + "\n"
        + "Número: " + numero + "\n"
        + "Tipo: " + tipo + "\n"
        + "Tamanho: " + tamanho + "\n"
        + "Preço: " + preco + "\n";
    }
}
