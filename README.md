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
- **Fiel**: Apenas visualização.

## Tecnologias Utilizadas

- **Backend**: Spring Boot, Jakarta
- **Frontend**: A definir (React.js, Vue.js ou Angular)
- **Banco de Dados**: PostgreSQL
- **Autenticação e Autorização**: Spring Security com JWT
- **Arquitetura**: Arquitetura Hexagonal

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests. Certifique-se de seguir as boas práticas de desenvolvimento e garantir que os testes estejam passando.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Desenvolvido com ❤️ por [Pedro Henrique Oliveira Souza Paiva](https://github.com/PedroOSPaiva)
