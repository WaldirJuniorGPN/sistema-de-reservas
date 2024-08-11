# Sistema de Reserva e Avaliação de Restaurantes

Este projeto é um sistema para gerenciamento de reservas e avaliações de restaurantes. Ele foi desenvolvido utilizando o Spring Boot, seguindo os princípios de Clean Architecture para garantir modularidade e fácil manutenção.

## Stack Tecnológica

- **Java 17**: Linguagem de programação principal.
- **Spring Boot 3.3.2**: Framework principal para criação do backend.
- **Spring Web**: Utilizado para construir APIs RESTful.
- **Spring Data JPA**: Facilita a persistência de dados em bancos de dados relacionais, utilizando Hibernate sob o capô.
- **Spring Boot DevTools**: Ferramenta de desenvolvimento para agilizar o processo de desenvolvimento com recursos como reinicialização automática.
- **Lombok**: Biblioteca para reduzir o código boilerplate como getters, setters, construtores, etc.
- **MySQL Driver**: Driver JDBC para conexão com banco de dados MySQL.
- **Validation**: Validação de beans utilizando Hibernate Validator.
- **Java Mail Sender**: Utilizado para envio de e-mails no sistema.

## Arquitetura

Este projeto segue a **Clean Architecture** proposta por Robert C. Martin. A arquitetura é dividida nas seguintes camadas:

- **Entities (Regras de Negócio da Empresa)**: Classes que representam os objetos do domínio, como `Restaurante`, `Reserva`, e `Avaliacao`. Essas classes residem na camada central e são independentes de frameworks e tecnologias externas.
- **Use Cases (Regras de Negócio da Aplicação)**: Classes que implementam a lógica de negócio específica para cada caso de uso, como `CadastrarRestaurante`, `FazerReserva`, etc. Eles orquestram a comunicação entre as entidades e os adaptadores.
- **Interface Adapters (Adaptadores de Interface)**: Camada que adapta as entradas e saídas do sistema para os casos de uso e entidades. Inclui os controladores (`RestauranteController`, `ReservaController`) e repositórios (`RestauranteRepository`).
- **Frameworks & Drivers**: Implementação concreta de tecnologias externas, como banco de dados, frameworks web, bibliotecas de envio de e-mail, etc.

## Configuração do Projeto

### Pré-requisitos

- **Java 17** ou superior instalado.
- **Maven** instalado para gerenciamento de dependências.
- **MySQL** ou outro banco de dados relacional compatível.

### Configuração do Banco de Dados

Certifique-se de ter um banco de dados MySQL configurado e rodando. As configurações do banco de dados estão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/restaurante_db
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Ajuste a URL, nome de usuário e senha de acordo com sua configuração local.

### Compilação e Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-de-reserva.git
   cd sistema-de-reserva
   ```

2. Compile o projeto utilizando Maven:
   ```bash
   mvn clean install
   ```

3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

O servidor estará disponível em `http://localhost:8080`.

### Endpoints Principais

- **POST /restaurantes**: Cadastro de um novo restaurante.
- **GET /restaurantes**: Lista todos os restaurantes cadastrados.
- **POST /reservas**: Criação de uma nova reserva.
- **POST /avaliacoes**: Adicionar uma avaliação para um restaurante.

### Testes

Os testes unitários e de integração podem ser executados com o comando:

```bash
mvn test
```

## Ferramentas de Desenvolvimento

- **Spring Boot DevTools**: Utilizado para reinicialização automática durante o desenvolvimento.
- **Lombok**: Reduz o código boilerplate com anotações como `@Getter`, `@Setter`, `@AllArgsConstructor`, etc.

## Contribuições

Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias e correções.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
