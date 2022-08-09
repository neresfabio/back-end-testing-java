package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    List<String> collection = new ArrayList<>();
    @BeforeEach
    void doBefore (){
        //5 delas devem ter um nome com menos de 5 letras.
        p1 = new Pessoa("Ney", "Gato");
        p1.setDataDeNacimento(LocalDate.of(2010,2,22));
        p2 = new Pessoa("Joy", "Gato");
        p2.setDataDeNacimento(LocalDate.of(2012,2,22));
        p3 = new Pessoa("Luan", "Gata");
        p3.setDataDeNacimento(LocalDate.of(2013,2,22));
        p4 = new Pessoa("Chan", "Dog");
        p4.setDataDeNacimento(LocalDate.of(2014,2,22));
        p5 = new Pessoa("Meg", "Dog");
        p5.setDataDeNacimento(LocalDate.of(2015,2,22));
        // As outras 5 pessoas devem ter um nome de 5 letras ou mais.
        p6 = new Pessoa("Pitchula", "Gata");
        p6.setDataDeNacimento(LocalDate.of(2016,2,22));
        p7 = new Pessoa("Barto", "Pet");
        p7.setDataDeNacimento(LocalDate.of(2017,2,22));
        p8 = new Pessoa("Diego", "Ganda");
        p8.setDataDeNacimento(LocalDate.of(2018,2,22));
        // Apenas 2 das pessoas com nomes com mais de 4 letras devem ser
        //maiores de idade.
        p9 = new Pessoa("Olinda", "Ganda");
        p9.setDataDeNacimento(LocalDate.of(1982,2,22));
        p10 = new Pessoa("Macambira", "Ganda");
        p10.setDataDeNacimento(LocalDate.of(1999,2,22));
    }

    @Test

    void imprimirObjetos()
    {
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test

    void adicionarCollection(){
        collection.add(p1.addPessoa(p1));
        collection.add(p2.addPessoa(p2));
        collection.add(p3.addPessoa(p3));
        collection.add(p4.addPessoa(p4));
        collection.add(p5.addPessoa(p5));
        collection.add(p6.addPessoa(p6));
        collection.add(p7.addPessoa(p7));
        collection.add(p8.addPessoa(p8));
        collection.add(p9.addPessoa(p9));
        collection.add(p10.addPessoa(p10));

        List<String> collection2 = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            if (collection.get(i)!=null){
                collection2.add(collection.get(i));
            }
        }

        assertEquals(2,collection2.size());

    }
}