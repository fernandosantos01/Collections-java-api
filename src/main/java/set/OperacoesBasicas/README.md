# EQUALS E HASHCODE

<p align="center">
<img src="https://miro.medium.com/v2/resize:fit:500/1*x5UK5p0mqcr3EBKwlKNRwg.png" alt="Equal() and hashcode() in Java"><br>
<a href="https://medium.com/javarevisited/equal-and-hashcode-in-java-e599d6db1a3">Equal() and hashcode() in Java </a>
</p>

### 1. O que é o método equals?
O método `equals` é usado para comparar dois objetos e verificar se eles são iguais. Ele é definido na classe `Object` (a classe base de todas as classes em Java) e pode ser sobrescrito `(@Override)` para fornecer uma lógica personalizada de comparação.

```java
@Override
public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    PalavrasUnicas that = (PalavrasUnicas) o;
    return Objects.equals(getPalavra(), that.getPalavra());
}
```

<b>O que ele faz:</b>

#### 1. Verifica se o objeto é nulo:
- Se o for `null`, retorna `false`, pois um objeto não pode ser igual a null.
#### 2. Verifica se os objetos são da mesma classe:
- Usa `getClass() != o.getClass()` para garantir que os objetos sejam da mesma classe. Se não forem, retorna false.
#### 3. Faz o cast do objeto:
- Converte o objeto o para o tipo `PalavrasUnicas (usando (PalavrasUnicas) o)`.
#### 4. Compara os atributos relevantes:
- Usa `Objects.equals(getPalavra()`, `that.getPalavra())` para comparar o atributo palavra dos dois objetos. Se forem iguais, retorna `true`; caso contrário, retorna `false`.

<b>Quando usar:</b>
- O equals é usado quando você precisa comparar dois objetos para verificar se eles são semanticamente iguais (ou seja, se representam a mesma coisa).

### 2. O que é o método hashCode?
O método hashCode retorna um valor numérico (um int) que representa o objeto. Ele é usado principalmente em estruturas de dados que dependem de hashing, como HashSet, HashMap e HashTable.
```java
@Override
public int hashCode() {
    return Objects.hashCode(getPalavra());
}
```
<b>O que ele faz:</b>
#### 1. Gera um código hash:

- Usa Objects.hashCode(getPalavra()) para gerar um código hash com base no atributo palavra.

#### 2. Garante consistência com o equals:

- Se dois objetos são considerados iguais pelo método equals, eles devem retornar o mesmo valor de hashCode.

<b>Quando usar:</b>

 - O hashCode é usado em estruturas de dados que dependem de hashing para armazenar e recuperar objetos de forma eficiente.
### 3. Relação entre equals e hashCode:
Existe um contrato entre equals e hashCode que deve ser respeitado:

#### 1. Consistência:

- Se dois objetos são iguais segundo o equals, eles devem ter o mesmo hashCode.

- No entanto, o inverso não é verdadeiro: dois objetos com o mesmo hashCode não precisam ser iguais segundo o equals.

#### 2. Performance:

- Estruturas como HashSet e HashMap usam o hashCode para determinar rapidamente onde um objeto deve ser armazenado ou buscado. Se o hashCode for bem implementado, a performance dessas estruturas será otimizada.

### 4. Exemplo prático:
Vamos supor que você tenha a seguinte classe PalavrasUnicas:

```java
import java.util.Objects;

public class PalavrasUnicas {
    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PalavrasUnicas that = (PalavrasUnicas) o;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavra());
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
```
<b>Testando o equals e hashCode:</b>
```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PalavrasUnicas p1 = new PalavrasUnicas("Java");
        PalavrasUnicas p2 = new PalavrasUnicas("Java");
        PalavrasUnicas p3 = new PalavrasUnicas("Python");

        // Testando o equals
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false

        // Testando o hashCode
        System.out.println("p1.hashCode(): " + p1.hashCode()); // Código hash baseado em "Java"
        System.out.println("p2.hashCode(): " + p2.hashCode()); // Mesmo código hash que p1
        System.out.println("p3.hashCode(): " + p3.hashCode()); // Código hash baseado em "Python"

        // Usando em um HashSet
        Set<PalavrasUnicas> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println("Tamanho do HashSet: " + set.size()); // 2 (p1 e p3, pois p2 é igual a p1)
    }
}
```
<b> Saída esperada:</b>
```
Saída esperada:
p1.equals(p2): true
p1.equals(p3): false
p1.hashCode(): 2301506
p2.hashCode(): 2301506
p3.hashCode(): -973197092
Tamanho do HashSet: 2
```

### 5. Por que são importantes?
- **`Equals`**:
  - Permite comparar objetos de forma lógica, não apenas por referência.
  - Fundamental para operações como `contains` em listas ou conjuntos.

- **`HashCode`**:

    - Melhora a performance em estruturas baseadas em hashing.

    - Garante que objetos iguais sejam armazenados no mesmo "bucket" em estruturas como HashSet ou HashMap.

### 6. Boas práticas:
#### 1. Sobrescreva hashCode sempre que sobrescrever equals:

- Isso garante que o contrato entre os dois métodos seja respeitado.

#### 2. Use Objects.equals e Objects.hashCode:

- Esses métodos ajudam a evitar erros comuns, como NullPointerException.

#### 3. Considere todos os atributos relevantes:

- No equals e hashCode, inclua apenas os atributos que definem a igualdade do objeto.
## FIXANDO A EXPLICAÇÃO DE CONSISTÊNCIA

A consistência entre `equals` e `hashCode` é um contrato que deve ser seguido em Java. Ele estabelece que:

1. Se dois objetos são iguais segundo o `equals`, eles devem ter o mesmo `hashCode`.

2. O inverso não é obrigatório: dois objetos com o mesmo `hashCode` não precisam ser iguais segundo o `equals`.

Esse contrato é essencial para o funcionamento correto de estruturas de dados baseadas em hashing, como `HashSet`, `HashMap` e `HashTable`.

### Por que essa consistência é importante?

Estruturas de dados como `HashSet` e `HashMap` usam o `hashCode` para organizar e buscar objetos de forma eficiente. Se o contrato não for respeitado, essas estruturas podem não funcionar corretamente.

Por exemplo:

- Se dois objetos são iguais segundo o `equals`, mas têm `hashCode` diferentes, o `HashSet` pode armazenar os dois objetos como se fossem diferentes, o que é incorreto.

- Se dois objetos têm o mesmo `hashCode`, mas são diferentes segundo o `equals`, o `HashSet` ainda funcionará corretamente, mas poderá haver <b>colisões de hash</b>, o que pode afetar a performance.

### Exemplo prático:
Vamos criar uma classe Produto com dois atributos: `id` e `nome`. Vamos implementar o `equals` e o `hashCode` de duas formas: uma correta (respeitando o contrato) e outra incorreta (quebrando o contrato).

`Classe Produto`:

```java
import java.util.Objects;

public class Produto {
    private int id;
    private String nome;

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
```
## Cenário 1: Implementação correta (respeitando o contrato)
Aqui, o `equals` e o `hashCode` são implementados de forma consistente. O `equals` considera apenas o `id`, e o `hashCode` também é baseado apenas no `id`.
```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Produto produto = (Produto) o;
    return id == produto.id; // Considera apenas o id para igualdade
}

@Override
public int hashCode() {
    return Objects.hash(id); // Gera hashCode apenas com o id
}
```
<b>Testando</b>
```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Notebook");
        Produto p2 = new Produto(1, "Notebook"); // Mesmo id, mesmo objeto
        Produto p3 = new Produto(2, "Teclado"); // Id diferente

        Set<Produto> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println("Tamanho do HashSet: " + set.size()); // 2 (p1 e p3)
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode())); // true
    }
}
```
<b>Saída Esperada</b>
```
Tamanho do HashSet: 2
p1.equals(p2): true
p1.hashCode() == p2.hashCode(): true
```
<b>Explicação</b>

`p1` e `p2` têm o mesmo `id`, então são considerados iguais pelo `equals` e têm o mesmo `hashCode`.

O `HashSet` não adiciona `p2` porque ele já contém um objeto igual `(p1)`.

`p3` tem um `id` diferente, então é adicionado ao conjunto.

## Cenário 2: Implementação incorreta (quebrando o contrato)
Agora, vamos quebrar o contrato. O `equals` continua considerando apenas o `id`, mas o `hashCode` é baseado no nome. Isso viola a regra de consistência.
```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Produto produto = (Produto) o;
    return id == produto.id; // Considera apenas o id para igualdade
}

@Override
public int hashCode() {
    return Objects.hash(nome); // Gera hashCode com o nome (errado!)
}
```
<b>Testando</b>
```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Notebook");
        Produto p2 = new Produto(1, "Notebook"); // Mesmo id, mesmo objeto
        Produto p3 = new Produto(2, "Teclado"); // Id diferente

        Set<Produto> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println("Tamanho do HashSet: " + set.size()); // 3 (errado!)
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode())); // true (por acaso)
    }
}
```
<b>Saída Esperada</b>

```
Tamanho do HashSet: 3
p1.equals(p2): true
p1.hashCode() == p2.hashCode(): true
```

<b>Explicação:</b>

- `p1` e `p2` são iguais segundo o `equals`, mas o `hashCode` é baseado no nome. Como o nome é o mesmo, o `hashCode` acaba sendo igual por coincidência.

- No entanto, se o nome fosse diferente, o `hashCode` seria diferente, e o `HashSet` armazenaria `p1` e `p2` como objetos distintos, mesmo que eles fossem iguais segundo o `equals`. Isso quebra o contrato e causa comportamentos inesperados.

## Conclusão:
A consistência entre `equals` e `hashCode` garante que:

1. Objetos iguais segundo o `equals` tenham o mesmo `hashCode`.

2. Estruturas de dados como `HashSet` e `HashMap` funcionem corretamente.

Se você quebrar esse contrato, pode causar bugs difíceis de detectar, como objetos duplicados em conjuntos ou chaves perdidas em mapas.

Se ainda tiver dúvidas, é só perguntar! 😊