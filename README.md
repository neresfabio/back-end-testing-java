# Back End - JAVA

## Exercício

Crie um aplicativo com uma pessoa para ser salva em uma coleção, apenas se a
pessoa for maior de idade (18 anos) e o nome contiver 5 letras ou mais. Por
exemplo, ''Arthur'' deve ser salvo.

```Java
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
```

## Crie um teste que instancia 10 pessoas:

- 5 delas devem ter um nome com menos de 5 letras.
- As outras 5 pessoas devem ter um nome de 5 letras ou mais.
- Apenas 2 das pessoas com nomes com mais de 4 letras devem ser maiores de idade.
- Faça uma asserção confirmando que apenas 2 pessoas estão na lista.

Nesta solução, a criação dos objetos é carregado antes dos testes **@BeforeEach**

Em seguida criou-se um teste para printar na tela os obejtos criados.

Porfim, o teste em 'si', que adiciona dos objetos criados somente os cujo o nome tem o numero de letras maior que 4 e que são maiores de idade.
```Java
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
```


## Links

[DEVMIDIA: como utilizar collections](https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450)

[GeeksforGeeks: Period.between()](https://www.geeksforgeeks.org/period-between-method-in-java-with-examples/)

[GeeksforGeeks: LocalDate.now()](https://www.geeksforgeeks.org/localdate-now-method-in-java-with-examples/)

[DTabnine: .getYears()](https://www.tabnine.com/code/java/methods/org.joda.time.Period/getYears)

[Teste JUnit 5](https://netbeans.apache.org/kb/docs/java/junit-intro_pt_BR.html)