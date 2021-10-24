# design-patterns-study

Projeto com exemplos práticos de padrões de projetos, baseado no curso ["Padrões de Projeto em JAVA na Prática"](https://www.udemy.com/course/padroes-de-projeto-em-java-na-pratica/).

## Creational Design Patterns
- **Factory Method**
    
    **Problemas:**
    
    - Como posso escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface?
    - Como deixar o meu código desacoplado das classes concretas?
    
    **Solução:**
    
    - Estrair a lógica de criação dos objetos para um Factory Method;
    - Invocar o Factory method para receber uma instância qualquer que implemente uma determinada interface;
    
    > *Um padrão que define uma interface para criar um objeto,m mas permite às classes decidirem qual classe instanciar. O Factory Method permite a uma classe deferir a instanciação para subclasses. - GOF*
    > 
    
- **Abstract Factory**
    
    **Problemas:**
    
    - Como posso escrever um código, onde as classes instanciadas possam variar dentro de uma mesma interface?
    - Como garantir que um conjunto de objetos relacinados (ou dependentes) possam ser criados mantendo um contexto único?
    
    **Solução:**
    
    - Extrair a lógica de criação dos objetos para um Abstract Factory;
    - Criar uma implementação do Abstract Facory para cada contexto, garantindo que todos os objetos criados estejam relacionados;
    
    > *Prover uma interface para criar famílias de objetos relacionados ou dependentes, sem especificar suas classes concretas. - GOF*
    > 
- **Singleton**
    
    **Problemas:**
    
    - Como posso garantir que uma classe tenha apenas uma instância?
    - Como fazer com que essa instância única possa ser acessível globalmente?
    
    **Solução:**
    
    - Esconder o construtor dessa classe;
    - Definir um ponto de criação estático que retorne uma instância única;
    
    > *Garantir que uma classe só tenha uma única instância, e que prover um ponto de  acesso global a ela. - GOF*
    > 
- **Builder**
    
    **Problemas:**
    
    - Como uma classe pode criar diferentes representações de um mesmo objeto complexo?
    
    **Solução:**
    
    - Delegar a criação do objeto para um builder ao invés de instanciar o objeto contreto diretamente;
    - Dividir a criação do objeto em partes...
    - Encapsular a criação e montagem dessas partes em um builder separado;
    
    > Separar a construção de um objeto complexo de sua representação para que o mesmo processo de construção possa criar representações diferentes*. - GOF*
    > 
- **Prototype**
    
    **Problemas:**
    
    - Como posso criar um objeto novo, aproveitando o estado previamente existente de outro objeto?
    
    **Solução:**
    
    - Definir um Prototype que retorna a cópia de si mesmo.
    
    > *Especificar os tipos de objetos a serem criados usando uma instância como protótipo e criar novos objetos ao copiar este protótipo.*
    >

## Structural Design Patterns

- **Adapter**
    
    **Problemas:**
    
    - Como uma classe pode ser reusada mesmo que não tenha a interface requisitada pelo cliente?
    - Como classes de interfaces incompatíveis podem trabalhar juntas?
    
    **Solução:**
    
    - Definir uma classes Adapter, que converta a interface de uma classe em outra que o cliente necessite.
    
    > *Converter a interface de uma classe em outra interface esperada pelos clientes. Adapter permite a comunicação entre classes que não poderiam trabalhar juntas devida a incompatibilidade de suas interfaces. - GOF*
    > 
    
- **Bridge**
    
    **Problemas:**
    
    - Como é possível fazer com que a abstração e a implementação possam variar independentemente?
    - Como está implementação pode variar em tempo de execução?
    
    **Solução:**
    
    - Definir um conjunto hierárquico para ambos os lados: abstração e implementação;
    - Em tempo de execução será possível escolher a classe concreta para a abstração e para a implementação ... ...que são compatíveis graças às interfaces.
    
    > *Desacoplar uma abstração de sua implementação para que os dois possam variar idependentemente. - GOF*
    > 
    
- **Composite**
    
    **Problemas:**
    
    - Como seria possível criar uma estrutura onde uma unidade e um conjunto delas possam ser tratadas de forma transparente, sem diferenças?
    
    **Solução:**
    
    - Definir uma composição que possa comportar tanto um elemento apenas, e também um conjunto desses mesmos elementos.
    
    > *Compor objetos em estruturas de árvore para representar hierarquias todo-parte. Composite permite que clientes tratem objetos individuais e composições de objetos de maneira uniforme. - GOF*
    > 
    
- **Decorator**
    
    **Problemas:**
    
    - Como posso adicionar funcionalidades dinamicamente em um objeto?
    
    **Solução:**
    
    - Com Objetos Decorators é possível adicionar novas responsabilidades para um objeto.
    
    > *Anexar responsabilidades adicionais a um objeto dinamicamente. Decorators oferecem uma alternativa flexível ao uso de herança para estender uma funcionalidade. - GOF*
    > 
    
- **Facade**
    
    **Problemas:**
    
    - Como posso simplificar o acesso a um sistema complexo utilizando uma interface simples?
    - Como reduzir a complexidade interna de um sistema para o cliente?
    
    **Solução:**
    
    - Definir uma fachada que provisiona uma interface única para um conjunto de interfaces de um sistema.
    
    > *Oferecer uma interface única para um conjunto de interfaces de um subsistema. Facade define uma interface de nível mais elevado, que torna o subsistema mais fácil de usar. - GOF*
    > 
    
- **Flyweight**
    
    **Problemas:**
    
    - Como posso trabalhar com uma grande quantidade de objetos na memória de uma forma mais eficiente?
    
    **Solução:**
    
    - Dividir o objeto entre valores intrínsecos e extrínsecos;
    - Criar um Flyweight que armazene os valores intrínsecos;
    - Os clients irão compartilhar estes flyweights, adicionando valores extrínsecos pontualmente.
    
    > *Usar compartilhamento para suportar grande quantidade de objetos refinados eficientemente. - GOF*
    > 
    
- **Mediator**
    
    **Problemas:**
    
    - Como posso reduzir o acoplamento entre objetos que precisam se comunicar?
    - Como posso deixar a interação entre objetos mais dinâmica?
    
    **Solução:**
    
    - Utilizar uma estrutura de mediator para encapsular a forma em que os objetos se comunicarão;
    - Os objetos não precisam se conhecer, pois toda a interação será realizada através do mediator;
    
    > *Definir um objeto que encapsula como um conjunto de objetos interagem. Mediator promove acoplamento fraco ao manter objetos que não se referem um ao outro explicitamento, permitindo variar sua interação de forma independente. - GOF*
    > 
    
- **Proxy**
    
    **Problemas:**
    
    - Como posso controlar o acesso a algum objeto?
    - Como posso adicionar funcionalidades durante o acesso a algum objeto?
    
    **Solução:**
    
    - Utilizar uma estrutura de proxy para atuar como se fosse um outro objeto;
    - Utilizando o proxy como forma de acessar o objeto real. Será possível controlar o seu acesso;
    
    > *Prover um substituto ou ponto através do qual um objeto possa controlar o acesso a outro. - GOF*
    >


## Behavioural Design Patterns
- **Chain of Responsability**
    
    **Problemas:**
    
    - Como posso evitar o acoplamento entre o remetente de uma solicitação e seu receptor?
    - Como permitir que mais que um objeto possa atender alguma requisição?
    
    **Solução:**
    
    - Definir uma cadeia de objetos onde cada um poderá responder àquela solicitação ou enviar para o próximo objeto tratá-la;
    - Quem faz a solicitação não precisa saber o tamanho da cadeia, ou mesmo como (por quem) ela será resolvida.
    
    > *Evita acoplar o remetente de uma requisição ao seu destinatário ao dar a mais de um objeto a chance de servir a requisição. Compõe os objetos em cascata e passa a requisição pela corrente até que um objeto a sirva. - GOF*
    > 
    
- **Memento**
    
    **Problemas:**
    
    - Como um objeto pode capturar seu estado interno para poder ser restaurado posteriormente?
    
    **Solução:**
    
    - Definir uma estrutura de memento onde cada estado poderá ser salvo e restaurado quando necessário;
    
    > *Sem violar o encapsulamento, capturar e externalizar o estado interno de um objeto para que o objeto possa ter esse estado restaurado posteriormente. - GOF*
    > 
    
- **Command**
    
    **Problemas:**
    
    - Como posso representar uma requisição dentro de um objeto?
    - Preciso fazer uma requisição mas não sei como ela será resolvida ou até mesmo quem irá respondê-la?
    
    **Solução:**
    
    - Encapsular a requisição em um objeto command separado;
    - O comando não tem os detalhes de quem e como será resolvido;
    
    > *Encapsular uma requisição como um objeto, permitindo que clientes parametrizem diferentes requisições, filas ou requisições de log, e suportar operações reversíveis. - GOF*
    > 
    
- **Iterator**
    
    **Problemas:**
    
    - Como posso navegar através de uma coleção de objetos sem a necessidade de conhecer os detalhes desta estrutura?
    
    **Solução:**
    
    - Encapsular a lógica de navegação entre os elementos desta coleção de uma estrutura de iterator;
    
    > *Prover uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor sua representação interna. - GOF*
    > 
    
- **Observer**
    
    **Problemas:**
    
    - Como posso modelar um relacionamento 1-n sem deixar todos eles acoplados?
    - Como um objeto pode notificar outros objetos quando necessário?
    
    **Solução:**
    
    - Criar uma estrutura de Observer para que ele possa notificar todos os objetos que solicitarem ser avisados quando um determinado evento ocorra;
    
    > *Definir uma dependência um-para-muitos entre objetos para que quando um objeto mudar de estado, todos os seus dependentes sejam notificados e atualizados automaticamente. - GOF*
    > 
    
- **State**
    
    **Problemas:**
    
    - Como posso alterar o comportamento de um objeto quando seu estado interno muda?
    - Como permitir que novos comportamentos sejam adicionados e integrados com os demais?
    
    **Solução:**
    
    - Modelar os comportamentos possíveis através de states;
    - Definir como serão realizadas as mudanças de estados;
    - Cada state irá tomar controle da execução de acordo com o estado interno do objeto.
    
    > *Permitir a um objeto alterar o seu comportamento quando o seu estado interno mudar. O objeto irá aparentar mudar de classe. - GOF*
    > 
    
- **Strategy**
    
    **Problemas:**
    
    - Como uma classe pode utilizar um algoritmo definido dinamicamente?
    - Como posso selecionar e trocar uma lógica em tempo de execução?
    
    **Solução:**
    
    - Encapsular os algoritmos possíveis para o mesmo problema em uma estrutura de Strategy;
    - O cliente irá delegar a execução para estas estratégias ao invés de possuir toda a lógica internamente;
    
    > *Definir uma família de algoritmos, encapsular cada um, e fazê-los intercambiáveis. Strategy permite que algoritmos mudem independentemente entre clientes que os utilizam. - GOF*
    > 
    
- **Template Method**
    
    **Problemas:**
    
    - Como posso unir partes de um código que não varia com partes variáveis?
    - Como posso alterar certos pontos do código mantendo uma estrutura geral?
    
    **Solução:**
    
    - Definir uma abstração com todos os pontos que podem ser variados;
    - Criar um template que contenha as partes fixas e possua pontos de chamadas para as partes variáveis;
    
    > *Definir o esqueleto de um algoritmo dentro de uma operação, deixando alguns passos a serem preenchidos pelas subclasses. Template Method permite que suas subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura. - GOF*
    >