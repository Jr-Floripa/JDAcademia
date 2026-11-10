 <h1 align="center" style="color:red;">
    🏋️‍♂️ Academia 🏋️‍♀️
</h1>
<p align="center">
  <img src="https://svg-banners.vercel.app/api?type=origin&text1=Academia%20API&text2=Java%20%7C%20Spring%20Boot%20%7C%20Railway&width=900&height=250" />
</p>




## Projeto desenvolvido para conclusão do Santander Dev Week com parceria DIO.me 
Este sistema foi construído em Java, utilizando Spring Boot, Maven como gerenciador de dependências e H2 Database durante o desenvolvimento.

Trata-se de uma API Restful que permite aos alunos de uma academia consultar:

> Em quais categorias estão matriculados

> Os dias e horários das aulas

> O professor responsável por cada categoria

O objetivo é demonstrar domínio em backend Java, modelagem de dados, boas práticas de API e documentação.

## 🚀 Tecnologias utilizadas

![Java](https://img.shields.io/badge/Java-17-ff8c00?style=plastic&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-00ff7f?style=plastic&logo=springboot)
![Copilot](https://img.shields.io/badge/Copilot-AI_Assistant-00ffff?style=plastic&logo=microsoft)
![Maven](https://img.shields.io/badge/Maven-3.8.6-ff1493?style=plastic&logo=apachemaven)
![MySQL](https://img.shields.io/badge/Postgres-9.0-1e90ff?style=plastic&logo=mysql)
![Railway](https://img.shields.io/badge/Railway-Deploy-9400d3?style=plastic&logo=railway)


## Diagrama de classes do projeto:

``` mermaid
classDiagram

class Pessoa {
    <<abstract>>
    Long id
    String nome
    String endereco
    String telefone
    String cpf
    String email
    String senha
    Perfil perfil
}

class Aluno {
    String matricula
}

class Funcionario {
    String cargo
}

class Categoria {
    Long id
    String nome
}

class Matricula {
    Long id
    Plano plano
    LocalDate dataInicio
    LocalDate dataFim
    Boolean ativa
}

class Aula {
    Long id
    DiaSemana diaSemana
    LocalTime horarioInicio
    LocalTime horarioFim
}

class Pagamento {
    Long id
    BigDecimal valor
    LocalDate vencimento
    StatusPagamento status
}

class Comentario {
    Long id
    String descricao
    LocalDateTime dataComentario
}

Pessoa <|-- Aluno
Pessoa <|-- Funcionario

Aluno "1" --> "N" Matricula

Categoria "1" --> "N" Matricula

Funcionario "1" --> "N" Categoria

Categoria "1" --> "N" Aula

Funcionario "1" --> "N" Aula

Matricula "1" --> "N" Pagamento

Aluno "1" --> "N" Comentario

Categoria "1" --> "N" Comentario
```
