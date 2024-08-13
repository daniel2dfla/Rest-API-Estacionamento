# Rest-API-Estacionamento

#### Status do projeto: em progresso.

## Descrição

O objetivo desta tarefa é desenvolver um sistema de gerenciamento de estacionamento robusto e eficiente. Isso incluirá a realização de um levantamento detalhado de requisitos junto ao cliente, seguido pela definição precisa das especificações técnicas. Essas especificações serão então repassadas à equipe de back-end para implementação, garantindo que todas as funcionalidades essenciais sejam atendidas e que o sistema seja escalável, seguro e de fácil manutenção.

Nesta primeira versão temos os seguintes requisitos a serem desenvolvidos:

#### 1 - Requisitos e configuração

- [X] A API deverá ser configurada com o Timezone do país.
- [X] A API deverá ser configurada com o Locale do país.
- [X] Implementar um sistema de auditoria que registre a data de criação e última modificação dos registros, bem como os usuários responsáveis.
- [X] Estabelecer a conexão com o banco de dados no ambiente de desenvolvimento.

#### 2 - Gerenciamento de Usuários

- [ ] O sistema deve permitir a criação de usuários com email único, que será utilizado como username, e senha de no mínimo 6 caracteres.
- [ ] O usuário deve possuir um perfil que pode ser "administrador" ou "cliente".
- [ ] O administrador autenticado terá permissões para gerenciar todos os usuários, enquanto o cliente só poderá acessar seus próprios dados.
- [ ] A API deve permitir a recuperação de usuários por identificador, alteração de senha (apenas pelo próprio usuário autenticado), e listagem de todos os usuários por administradores autenticados.
- [ ] Todos os recursos devem ser documentados e testados.

#### 3 - Autenticação e Segurança

- [ ] Implementar autenticação baseada em JSON Web Token (JWT).
- [ ] Documentar o sistema de autenticação e realizar testes abrangentes para garantir sua segurança e confiabilidade.

#### 4 - Gerenciamento de Clientes

- [ ] O cadastro de clientes será vinculado a um usuário e exigirá autenticação.
- [ ] Cada cliente poderá ter apenas um cadastro, que incluirá nome completo e CPF único.
- [ ] Administradores terão acesso a todos os cadastros, enquanto clientes poderão acessar apenas seus próprios dados.
- [ ] Todos os recursos devem ser documentados e testados.

#### 5 - Gerenciamento de Vagas

- [ ] Todas as operações relacionadas às vagas serão restritas aos administradores autenticados.
- [ ] Cada vaga deve ter um código único e um status de "livre" ou "ocupada".
- [ ] O sistema deve permitir a localização de vagas pelo código, e todos os recursos devem ser documentados e testados.

#### 6 - Controle de Estacionamentos

- [ ] Apenas clientes cadastrados poderão estacionar, utilizando o CPF como identificação.
- [ ] O registro de entrada deve incluir informações detalhadas do veículo e gerar um recibo único.
- [ ] O registro de saída deve incluir a data, o valor do período estacionado e eventuais descontos.
- [ ] A vaga de estacionamento deve ser vinculada tanto ao cliente quanto ao veículo.
- [ ] O sistema de descontos deve aplicar 30% após 10 estacionamentos completos.
- [ ] Administradores e clientes poderão realizar consultas e operações de check-in e check-out, com base no número do recibo e no CPF.
- [ ] Todos os recursos devem ser documentados e testados.

#### 7 - Cálculo de Custos

- [ ] Definir os custos de estacionamento de acordo com os preços especificados.
    * Primeiros 15 Minutos – R$ 5.00
    * Primeiros 60 Minutos – R$ 9.25
    * A partir dos primeiros 60 Minutos iniciais, inclua no custo de R$ 9.25 a cobrança adicional
de R$ 1.75 para cada faixa de 15 Minutos adicionais aos primeiros 60 minutos
- [ ] Implementar e documentar o processo de cálculo e realizar testes para garantir a precisão.

#### 8 -  Relatórios

- [ ] O cliente poderá gerar um relatório em PDF com a lista de estacionamentos, que estará disponível para download.

### Considerações Finais

- [ ] A documentação detalhada de todos os recursos e testes end-to-end deve ser fornecida para apoiar a equipe de desenvolvimento front-end e garantir a qualidade do sistema como um todo.
