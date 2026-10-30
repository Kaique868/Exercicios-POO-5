# Questão 1
Os métodos com corpo (``default`` e ``static``) passaram a ser permitidos nas interfaces a partir do Java 8.

* Métodos ``default`` (padrão): Permitem adicionar novas funcionalidades a uma interface existente sem quebrar a compatibilidade com o código antigo. As classes que já implementavam essa interface não são obrigadas a sobrescrever ou implementar o novo método default, pois já recebem a implementação padrão do método automaticamente.
  
* Métodos ``static`` (estáticos): Funcionam como métodos utilitários vinculados diretamente à interface (e não às instâncias das classes que a implementam). Eles ajudam a organizar funções auxiliares ou de conveniência que pertencem ao domínio daquela interface, dispensando a criação de classes utilitárias separadas (como instanciar objetos apenas para usar um método simples).


# Questão 2
As interfaces ajudam a construir sistemas desacoplados e de fácil manutenção ao estabelecerem um contrato de comportamento que as classes devem seguir, permitindo que o código dependa de abstrações em vez de implementações concretas. Dessa forma, elas reduzem o acoplamento entre os diferentes módulos, facilitam a substituição de componentes e tornam a evolução do software mais simples, uma vez que alterar uma implementação interna não afeta as classes que interagem apenas com a interface.

**Exemplo prático:** Em um sistema de e-commerce, se o carrinho de compras depender diretamente de uma classe concreta como ``GatewayCartaoCredito``, adicionar novos meios de pagamento (como Pix ou PayPal) exigirá alterar o código principal de forma invasiva.

Criando uma interface chamada ``ProcessadorPagamento``, as classes específicas (``PagamentoCartao``, ``PagamentoPix``, etc.) passam a implementá-la. Dessa forma, o carrinho interage apenas com a interface, permitindo adicionar novos métodos de pagamento com facilidade e sem modificar a lógica central da aplicação.
