# Sanduíches 
Este projeto Java demonstra a implementação do Padrão de Projeto Builder, aplicado à criação de sanduíches personalizados de forma flexível e escalável.  

O padrão Builder facilita a construção de objetos complexos passo a passo, desacoplando a criação da representação final.  

## Funcionalidades

- Construção de sanduíches personalizados
- Encadeamento fluente de métodos
- Separação entre o processo de construção e o objeto final

---

## Estrutura de Classes

### Sanduiche
Representa o produto final (sanduíche), com atributos como:
- tipo de pão
- tipo de carne
- tipo de queijo
- salada
- molho

### SanduicheBuilder
Classe responsável por montar o sanduíche passo a passo. Oferece os métodos:
- comPao(String p)
- comCarne(String c)
- comQueijo(String q)
- comSalada(String s)
- comMolho(String m)
- build(): retorna um objeto `Sanduiche` pronto

### Main
Classe de exemplo com o uso do builder para montar diferentes sanduíches.

---

## Exemplo de Uso

```java
Sanduiche sanduiche = new SanduicheBuilder()
    .comPao("Integral")
    .comCarne("Frango")
    .comQueijo("Cheddar")
    .comSalada("Alface")
    .comMolho("Barbecue")
    .build();

System.out.println(sanduiche);
```
## Diagram de Classes
<img width="530" height="274" alt="image" src="https://github.com/user-attachments/assets/875359f2-740a-4446-ba1b-efde9dc33395" />


