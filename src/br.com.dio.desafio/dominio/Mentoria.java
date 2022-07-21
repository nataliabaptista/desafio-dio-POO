package dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo { //Tudo que eu tenho em conteudo vai ter em mentoria (mas nem tudo que eu tenho em mentoria não necessariamente terei em conteudo)

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
public String toString() {
    return "Titulo: " + getTitulo() + '\n' +
     "Descrição: " + getDescricao() + '\n' +
     "Data: "+ data;
}

    }

