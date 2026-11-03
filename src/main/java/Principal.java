
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Variáveis   
        Scanner leitor = new Scanner(System.in);
        String nomes[] = new String[100];
        int idades[] = new int[100];
        int N = 0;
        //Menu
        int opcao1;
        do {
            System.out.println(">>>>>>>>>>>>>Cadastro de aluno<<<<<<<<<<<");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Consultar alunos");
            System.out.println("9 - Sair");
            System.out.println("Digite um opcao:");
            opcao1 = Integer.parseInt(leitor.nextLine());
            switch (opcao1) {
                case 1:
                    System.out.println("Cadastrar aluno");
                    if (N < 100) {
                        System.out.println("Digite o nome do aluno:");
                        String nome = leitor.nextLine();
                        System.out.println("Digite a idade do aluno:");
                        int idade = Integer.parseInt(leitor.nextLine());
                        nomes[N] = nome;
                        idades[N] = idade;
                        N = N + 1;
                        System.out.println("Aluno cadastrado com sucesso!");
                    } else {
                        System.out.println("Cadastro cheio!");
                    }
                    break;
                case 2:
                    System.out.println("Listar aluno");
                    for (int i = 0; i < N; i++) {
                        System.out.println("Nome:" + nomes[i] + " Idades:" + idades[i]);
                    }
                    break;
                case 3:
                    //Inicio do submenu 3
                    System.out.println("########3 - Consultar aluno########");
                    int opcao2;
                    do {
                        System.out.println("1 - Por nome");
                        System.out.println("2 - Por Idade");
                        System.out.println("9 - Voltar ao menu principal");
                        System.out.println("Digite um opcao:");
                        opcao2 = Integer.parseInt(leitor.nextLine());
                        switch (opcao2) {
                            case 1: {
                                System.out.println("Consultar por nome");
                                System.out.println("Digite o nome a ser pesquisado:");
                                String nomePesquisa = leitor.nextLine();
                                boolean flag = false;
                                for (int i = 0; i < N; i++) {
                                    if ((nomes[i].equalsIgnoreCase(nomePesquisa))==true) {
                                        System.out.println("Achei o aluno com o nome:" + nomes[i] + " e idade " + idades[i]);
                                        flag = true;
                                    }
                                }
                                if (flag == false) {
                                    System.out.println("Nenhum aluno encontrado com o nome " + nomePesquisa);
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("Consultar por idade");
                                System.out.println("Digite a idade a ser pesquisado:");
                                int idadePesquisa = Integer.parseInt(leitor.nextLine());
                                boolean flag = false;
                                for (int i = 0; i < N; i++) {
                                    if ((idades[i] == idadePesquisa)==true) {
                                        System.out.println("Achei o aluno com o nome:" + nomes[i] + " e idade " + idades[i]);
                                        flag = true;
                                    }
                                }
                                if (flag == false) {
                                    System.out.println("Nenhum aluno encontrado com a idade " + idadePesquisa);
                                }
                            }
                            break;
                            case 9:
                                System.out.println("Saindo da consulta");
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    } while (opcao2 != 9);
                    //Fim do submenu 3
                    break;
                case 9:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao1 != 9);
    }
}
