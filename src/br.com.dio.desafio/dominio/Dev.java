package dominio;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp){
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }
    }


    public double calcularTotalXp(){
        return this.conteudoConcluido
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }
    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }
    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

@Override
public int hashCode() {
    return Objects.hash(nome, conteudoInscrito, conteudoConcluido);
}


}
