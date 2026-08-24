/*

1-Quais as principais caracteristicas do java que são vantagens em detrimento de outra tecnologias?
R: A JVM (Java Virtual Machine) é o diferencial histórico. O bytecode Java roda em qualquer plataforma 
que tenha uma JVM implementada, sem recompilação.Comparativo: Diferente de C/C++, que exige recompilação 
por arquitetura, ou de linguagens como Go (que compila para binários nativos específicos), Java abstrai o 
SO e a arquitetura de hardware completamente. Um arquivo .jar compilado no Windows roda idêntico no Linux, 
macOS, ou mainframe.

O ecossistema Java é um dos mais ricos do mercado:
Spring Boot/Cloud — padrão de facto para microserviços enterprise;
Jakarta EE — especificação formal para aplicações corporativas;
Bibliotecas de mercado — Jackson, MapStruct, Lombok, Mockito, JUnit 5;
Maven/Gradle — gerenciamento de dependências maduro e estável;
Maven Central — um dos maiores repositórios de artefatos do mundo.
Comparativo: Linguagens mais recentes (Kotlin, Rust, Go) têm ecossistemas em crescimento, 
mas ainda menores. Python tem excelente ecossistema para data science, mas para aplicações enterprise 
distribuídas, o stack Spring é incomparável em robustez e padronização.

Java é fortemente tipada com verificação estática rigorosa. O compilador captura uma classe inteira de 
erros antes da execução.
Comparativo: JavaScript e Python são dinamicamente tipadas — erros de tipo surgem em runtime. TypeScript 
adiciona types, mas é um layer sobre JS, sem garantias reais em runtime. Rust e Go também são estaticamente 
tipados, mas Java combina type safety com produtividade (não exige borrow checker como Rust nem manual de 
memória).

2-O que é JVM e qual a sua correlação com o bytecode?
R: A Java Virtual Machine (JVM) é uma máquina virtual de abstração — um processo de runtime que simula um 
computador capaz de executar um conjunto de instruções padronizado.

Bytecode é o código intermediário gerado pelo compilador Java (javac). Não é código-fonte legível por 
humanos (embora descompilável) nem código-máquina nativo. É um conjunto de instruções padronizado e 
independente de arquitetura.

A relação entre JVM e bytecode é, em sua essência, um contrato binário: o bytecode é a linguagem que a 
JVM entende, e a JVM é o único ambiente capaz de executar esse bytecode. Esse acoplamento cria um pipeline 
de execução em três fases que, juntas, explicam por que Java consegue ser portável, segura e performática 
ao mesmo tempo.A primeira fase acontece offline, durante a compilação. O compilador javac recebe o 
código-fonte .java e o traduz para bytecode, armazenado em arquivos .class. É fundamental compreender que 
essa etapa não gera código-máquina nativo — o javac realiza apenas análise léxica, sintática e semântica, 
verificando a consistência de tipos e gerando instruções no conjunto padronizado da JVM. O resultado é um 
bytecode que não conhece nada sobre o sistema operacional, a arquitetura de CPU ou o hardware subjacente. 
Esse é o ponto de indireção que sustenta toda a portabilidade de Java: o mesmo arquivo .class compilado em 
um Windows x86_64 pode ser executado sem qualquer modificação em um Linux ARM64, um macOS ou mesmo um 
mainframe s390x, desde que exista uma implementação da JVM para aquela plataforma. Esse é o mecanismo 
técnico por trás do famoso "Write Once, Run Anywhere".A segunda fase ocorre em runtime, quando a JVM é 
iniciada e precisa carregar o bytecode para a memória. O subsistema responsável por isso é o Class Loader, 
que executa três subetapas sequenciais. Primeiro, o loading lê o arquivo .class e cria uma representação 
interna na Method Area da JVM. Em seguida, durante o linking, ocorre a verificação do bytecode pelo 
Bytecode Verifier — uma barreira de segurança que valida a integridade do código antes de qualquer 
execução. O verificador checa se a operand stack está balanceada (isto é, se instruções não tentam 
consumir mais valores do que foram empilhados), se os tipos são consistentes (evitando, por exemplo, 
que um int seja usado como uma referência a objeto), se o acesso a campos e métodos respeita os 
modificadores de visibilidade como private e protected, e se os desvios de fluxo não pulam para o meio 
de uma instrução, o que poderia corromper a execução. Por fim, a resolução substitui referências 
simbólicas (nomes de classes, métodos e campos em formato textual) por referências diretas na memória. 
A última subetapa, a inicialização, executa blocos static {} e inicializa campos estáticos. Vale destacar 
que o Bytecode Verifier é uma camada de defesa que linguagens compiladas nativamente como C e C++ 
simplesmente não possuem — em Java, uma classe inteira de vulnerabilidades relacionadas a overflow de 
stack, acesso indevido a memória e quebra de encapsulamento é eliminada antes mesmo da primeira instrução 
ser executada.A terceira fase é onde a mágica da performance acontece. A JVM não se limita a interpretar 
o bytecode linha por linha — ela usa uma estratégia híbrida que combina interpretação imediata com 
compilação JIT (Just-In-Time). Quando a JVM inicia, o interpreter começa a executar o bytecode desde o 
primeiro instante, o que garante um startup relativamente rápido. Simultaneamente, um profiler embutido 
monitora a execução e identifica quais métodos e loops são invocados com maior frequência — os chamados 
hotspots. Quando um método atinge um limiar de execução (por padrão, aproximadamente dez mil invocações, 
configurável via -XX:CompileThreshold), o JIT Compiler é acionado. Ele compila o bytecode daquele método 
para código-máquina nativo da arquitetura em uso, aplicando uma série de otimizações sofisticadas. Entre 
elas, destaca-se a escape analysis, que identifica objetos que não escapam do escopo do método em que 
foram criados e os aloca diretamente na stack em vez do heap, eliminando a pressão sobre o Garbage 
Collector. O method inlining copia o corpo de métodos pequenos diretamente no ponto de chamada, eliminando 
o overhead de invocação. O loop unrolling expande iterações de loops para reduzir o custo de branches de 
controle. A dead code elimination remove instruções cujo resultado não é observável, e o constant folding 
resolve expressões com operandos constantes já em tempo de compilação. O código nativo resultante é 
armazenado em uma área chamada Code Cache, de modo que chamadas subsequentes ao mesmo método pulam a 
interpretação e executam diretamente o código otimizado.

*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Paciente p1 = new Paciente();
        p1.setNome("Guilherme Leo");
        p1.setCpf("123.456.789-00");
        p1.setTelefone("(11) 91234-5678");
        p1.setGenero("Masculino");
        p1.setIdade(23);

        Medico m1 = new Medico();
        m1.setNome("Laura Araujo");
        m1.setCrm("123456-SP");
        m1.setTelefone("(11) 91234-5678");
        m1.setEspecialidade("Cardiologia");
        m1.setSenha("med123");

        Recepcionista r1 = new Recepcionista();
        r1.setNome("Mariana Lopes");
        r1.setCpf("987.654.321-11");
        r1.setTelefone("(11) 95555-4444");
        r1.setSenha("rec456");

        Agenda a1 = new Agenda();
        a1.setData("20/08/2026");
        a1.setHora("14:00");
        a1.setMedico(m1);
        a1.setPaciente(p1);

        Consulta c1 = new Consulta();
        c1.setData("20/08/2026");
        c1.setHora("14:00");
        c1.setMedico(m1);
        c1.setPaciente(p1);
        c1.setMotivo("Check-up de rotina");
        c1.setHistorico("Sem queixas anteriores");

        Receita rec1 = new Receita();
        rec1.setConsulta(c1);
        rec1.setData("20/08/2026");
        rec1.setDescritivo("Tomar vitamina D 1x ao dia.");

        Exame e1 = new Exame();
        e1.setConsulta(c1);
        e1.setData("20/08/2026");
        e1.setDescritivo("Hemograma completo");

        p1.mostrar();
        m1.mostrar();
        r1.mostrar();
        a1.mostrar();
        c1.mostrar();
        rec1.mostrar();
        e1.mostrar();

    }
}
