# Sistema de Controle de Gastos e Inventário para Igreja

Este projeto é um sistema web para a gestão financeira e de inventário de uma igreja. Ele permite o controle de receitas, despesas, estoque e patrimônio, com foco em uma gestão eficiente e transparente. Desenvolvido com uma arquitetura hexagonal, o sistema é modular e fácil de manter.

## Visão Geral

O sistema é composto por funcionalidades para gerenciar as receitas, despesas, estoque e patrimônio da igreja. Ele também permite a geração de relatórios financeiros detalhados e comparativos em diferentes períodos. A autenticação e autorização são implementadas para garantir que apenas usuários com permissões adequadas possam acessar e gerenciar os dados.

## Funcionalidades Principais

### 1. Gestão de Receitas
- **Doações**: Registro de contribuições voluntárias dos fiéis.
- **Dízimos**: Gerenciamento de contribuições regulares.
- **Eventos**: Controle de receitas provenientes de rifas, sorteios e festas da igreja.
- **Ofertas**: Registro de contribuições esporádicas.

### 2. Gestão de Despesas
- **Gastos Mensais Obrigatórios**: Controle de despesas como água, luz e telefone.
- **Gastos de Bens de Consumo**: Registro de compras de produtos como alimentos e materiais de limpeza.
- **Despesas Pontuais**: Gestão da aquisição de bens duráveis.

### 3. Gestão de Estoque e Patrimônio
- **Estoque**: Controle de itens consumíveis.
- **Patrimônio**: Registro de bens duráveis, incluindo armazenamento digital de notas fiscais.

### 4. Relatórios Financeiros
- Geração de relatórios em períodos mensais, bimestrais, trimestrais, semestrais e anuais.
- Comparativos financeiros para análise de tendências e previsões.

### 5. Controle de Acesso
- **Coordenador**: Acesso total ao sistema.
- **Secretário**: Acesso total, exceto cadastro de coordenadores.
- **Tesoureiro**: Inserção e edição de dados financeiros.
- **Fiel e Padre**: Apenas visualização.

## Tecnologias Utilizadas

- **Backend**: Spring Boot, Jakarta EE
- **Frontend**: React.js
- **Banco de Dados**: PostgreSQL
- **Autenticação e Autorização**: Spring Security com JWT
- **Arquitetura**: Arquitetura Hexagonal

## Pré-requisitos

- **Java 17**
- **PostgreSQL 8.2**
- **Maven**
- **Node.js** ou **React** (ainda a definir para o frontend)

## Configuração e Execução

### Passos para configurar o banco de dados:

1. **Criar o banco de dados e as tabelas:**
    ```bash
    psql -U postgres -c "CREATE DATABASE controle_gastos;"
    psql -U postgres -d controle_gastos -f src/main/resources/sql/create_tables.sql
    ```

2. **Popular o banco de dados:**
    ```bash
    psql -U postgres -d controle_gastos -f src/main/resources/sql/populate_db.sql
    ```

3. **Configurar as propriedades do banco de dados no arquivo `application.yml` ou `application.properties`:**
    ```yaml
    spring:
      datasource:
        url: jdbc:postgresql://localhost:5432/controle_gastos
        username: postgres
        password: your_password
      jpa:
        hibernate:
          ddl-auto: update
        show-sql: true
    ```

### Executando o Backend:

1. **Clone o repositório:**
    ```bash
    git clone https://github.com/your-repo/controle-gastos-igreja.git
    cd controle-gastos-igreja
    ```

2. **Construa o projeto com Maven:**
    ```bash
    mvn clean install
    ```

3. **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

### Executando o Frontend:

1. **Navegue até a pasta do frontend:**
    ```bash
    cd frontend
    ```

2. **Instale as dependências do Node.js:**
    ```bash
    npm install
    ```

3. **Execute o frontend:**
    ```bash
    npm start
    ```

## Testando a API

Utilize o [Postman](https://www.postman.com/downloads/) para testar os endpoints da API. Abaixo estão exemplos de requisições:

### Autenticação

- **Login:**
    - URL: `POST /api/auth/login`
    - Body:
      ```json
      {
        "username": "admin",
        "password": "admin"
      }
      ```

### Gerenciamento de Receitas

- **Criar uma nova receita:**
    - URL: `POST /api/receitas`
    - Body:
      ```json
      {
        "tipo": "Doação",
        "valor": 100,
        "descricao": "Doação mensal",
        "data": "2024-08-20"
      }
      ```

### Gerenciamento de Despesas

- **Registrar uma nova despesa:**
    - URL: `POST /api/despesas`
    - Body:
      ```json
      {
        "tipo": "Gasto Mensal",
        "valor": 200,
        "descricao": "Conta de luz",
        "data": "2024-08-20"
      }
      ```

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests. Certifique-se de seguir as boas práticas de desenvolvimento e garantir que os testes estejam passando.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Desenvolvido com ❤️ por [Pedro Henrique Oliveira Souza Paiva](https://github.com/PedroOSPaiva)
