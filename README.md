# TrabalhoFinalPSC

## Funcionalidades do Sistema de Gerenciamento de Doações:

### Receber Doações:

- Interface com campos para entrada de informações da doação (tipo, quantidade, data).
- Validação dos dados inseridos.
- Armazenamento das informações em banco de dados ou arquivo de texto.

### Calcular Total de Doações:

- Função para somar todas as doações recebidas.
- Apresentação do total em uma interface clara e fácil de entender.

### Armazenar Informações de Doações:

- Criação de banco de dados ou arquivo de texto para armazenar as informações das doações.
- Estrutura de dados otimizada para consultas e relatórios futuros.

### Outras Funcionalidades Opcionais:

- Relatórios de doações por tipo, data ou outro critério.
- Interface de busca para localizar doações específicas.
- Exportação de dados para análise externa.

A Inteligência Artificial (IA) foi fundamental na decomposição do problema em requisitos funcionais. Embora útil na geração de ideias, é necessário analisar criticamente as sugestões para garantir a consistência e a precisão dos requisitos.

## Crítica à IA

Utilizando a bibliografia abaixo, foi possível analisar de forma crítica o uso da IA na resolução deste problema, chegando à conclusão de que a intervenção humana foi crucial para ajustar e refinar o sistema, garantindo que todos os aspectos do projeto fossem abordados de maneira completa e eficaz.

## Bibliografia

Pressman, R. S. (2014). Software Engineering: A Practitioner's Approach. McGraw-Hill.

## Diagrama de Classes

### Classes:

- **Doacao:**
    - Propriedades: tipo, quantidade, data
    - Métodos: getters e setters para as propriedades

- **SistemaDoacoes:**
    - Propriedades: lista de doações, total de doações
    - Métodos:
        - receberDoacao(doacao): adiciona uma doação à lista e atualiza o total
        - calcularTotalDoacoes(): calcula e atualiza o total de doações
        - armazenarDoacoes(): salva as informações das doações em banco de dados ou arquivo de texto

### Relacionamentos:

- **Doacao** é composta por uma lista de objetos **Doacao**.
- **SistemaDoacoes** contém uma lista de objetos **Doacao**.

## Exemplo de Descrição Textual:

O sistema é composto pelas classes **Doacao** e **SistemaDoacoes**. A classe **Doacao** representa uma doação individual, com propriedades para tipo, quantidade e data. A classe **SistemaDoacoes** gerencia uma lista de doações e calcula o total de doações recebidas.

Quando uma nova doação é recebida, ela é passada para o método **receberDoacao** da classe **SistemaDoacoes**, que adiciona a doação à lista e atualiza o total. O método **calcularTotalDoacoes** pode ser chamado a qualquer momento para recalcular o total de doações.

As informações das doações são armazenadas usando o método **armazenarDoacoes**, que salva os dados em um banco de dados ou arquivo de texto. Isso permite que as informações sejam recuperadas e analisadas posteriormente.

## Programação com IA

A programação com IA, como a revisão de código assistida, facilita o desenvolvimento de software de alta qualidade. As IAs analisam o código, encontram erros e oferecem sugestões para melhorias.

### Exemplo

O código Java fornecido trata de exceções quando as informações de doação são gravadas em um arquivo de texto. Uma IA tem a capacidade de analisar o código e propor melhorias para o tratamento de exceções e a geração de logs de erros.

### Os Benefícios

Os programadores podem:

- Encontrar e corrigir erros rapidamente.
- Criar métodos mais eficientes para o registro de erros e o tratamento de exceções.
- Criar um código mais seguro, confiável e limpo.

Por fim, a programação com inteligência artificial permite que os programadores criem software de melhor e maior eficiência.
