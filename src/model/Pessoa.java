package model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dataDeNacimento;
    private List<String> collection = new ArrayList<>();

    public Pessoa(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataDeNacimento() {
        return dataDeNacimento;
    }

    public void setDataDeNacimento(LocalDate dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }

    public int calculaIdade()
    {
        return Period.between(this.dataDeNacimento,LocalDate.now()).getYears();
    }

    public String addPessoa(Pessoa pessoa)
    {
        int tamanhoNome = pessoa.getNome().length();
        int idade = pessoa.calculaIdade();

        if (tamanhoNome > 4 && idade > 17)
        {
            collection.add(pessoa.getNome());
            return pessoa.getNome();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataDeNacimento=" + dataDeNacimento +
                '}';
    }
}
