
package ltc_project_4_by_hugo_queiros;

import java.util.Scanner;


public class LTC_Project_4_by_Hugo_Queiros {


    public static void escreveLista(HashNode lista) {
        while (lista != null) {
            System.out.println(lista);
            lista = lista.getProximo();
        }
    }
    
    public HashNode eliminaElemento(HashNode primeiro, int elimina_id) {
        HashNode p = primeiro;
        if (p != null) {
            if (p.getElemento().getAluno_id() == elimina_id) {
                primeiro = primeiro.getProximo();
            }
            while (p != null) {
                if (p.getProximo() == null) {
                    break;
                }
                if (p.getProximo().getElemento().getAluno_id() == elimina_id) {
                    p.setProximo(p.getProximo().getProximo());
                    break;
                } else {
                    p = p.getProximo();
                }
            }
        }
        return primeiro;
    }
    
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int escolha, numero, nota, elimina_id, pesquisa_id;
        String curso, nome;
        HashNode primeiro = null, proximo = null;
        do {
            System.out.println("________MENU DE OPÇÕES________ ");
            System.out.println("1- Inserir dados Aluno ");
            System.out.println("2- Eliminar dados Aluno");
            System.out.println("3- Pesquisar Aluno ");
            System.out.println("4- Pauta da Turma ");
            System.out.println("5- Sair ");
            System.out.println("\nOpção Pretendida: ");
            escolha = leitura.nextInt();
            switch (escolha) {

                case 1:
                    leitura.nextLine();
                    System.out.println("Insira o nome do aluno: ");
                    nome = leitura.nextLine();
                    System.out.println("Insira o número do aluno: ");
                    numero = leitura.nextInt();
                    leitura.nextLine();
                    System.out.println("Insira o curso: ");
                    curso = leitura.nextLine();
                    System.out.println("Insira a nota do aluno: ");
                    nota = leitura.nextInt();
                    if (nota < 0 || nota > 20) {
                        System.out.println("Nota Inválida");
                    } else {
                        Aluno aluno = new Aluno();
                        aluno.setAluno_id(numero);
                        aluno.setNome(nome);
                        aluno.setCurso(curso);
                        aluno.setNota(nota);
                        HashNode nod = new HashNode(aluno, null);
                        System.out.println(nod);
                        nod.setProximo(proximo);
                        nod = primeiro;
                        System.out.println("Dados submetidos com sucesso\n");
                    }
                    break;

                case 2:
                    System.out.println("Digite o número do Aluno ao qual pretende eliminar os dados: ");
                    elimina_id = leitura.nextInt();
                    primeiro = eliminaElemento(primeiro, elimina_id);
                    break;

                case 3:
                    System.out.println("Digite o número do Aluno pelo qual pretende pesquisar: ");
                    pesquisa_id = leitura.nextInt();
                    for (int i : classificacao.keySet()) {
                        if (i == pesquisa_id) {
                            System.out.println(classificacao.get(i));
                        } 
                        else {
                            System.out.println("Não há nenhum aluno correspondente a esse número");
                        }
                    }

                    break;*/

                case 4:
                    escreveLista(proximo);
                    break;

                default:
                    System.out.println("Programa terminado");
                    break;
            }
        } while (escolha != 4);
    
    
}
}
