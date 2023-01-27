package americanas.com.br.letscode;

import java.util.Scanner;

public class IphoneFactory implements Iphone{

    @Override
    public void exibirDetalhes() {
        Scanner sc = new Scanner(System.in);
        imprimirMenu();
        TypeIphoneEnum typeIphoneEnum = TypeIphoneEnum.IPHONE_X;
        int op = sc.nextInt();

        if (op == 1 ) {
            typeIphoneEnum = TypeIphoneEnum.IPHONE_X;
        } else if (op == 2) {
            typeIphoneEnum = TypeIphoneEnum.IPHONE_9;
        } else if (op == 3) {
            typeIphoneEnum = TypeIphoneEnum.IPHONE_13_MINI;
        } else {
            System.out.println("Operação inválida");
        }

        switch (typeIphoneEnum) {
            case IPHONE_X:
                IphoneType iPhone_x = new IphoneType("Ios 16", "6 GB", "64 GB", "6.1'", "A14", "12mp");
                System.out.println("Sistema Operacional: " + iPhone_x.getSistemaOperacional());
                System.out.println("Memória Ram: " + iPhone_x.getMemoriaRam());
                System.out.println("Memória Rom: " + iPhone_x.getMemoriaRom());
                System.out.println("Tela: " + iPhone_x.getTela());
                System.out.println("Chip: " + iPhone_x.getChip());
                System.out.println("Câmera: " + iPhone_x.getCamera());
                break;
            case IPHONE_9:
                IphoneType iPhone_9 = new IphoneType("Ios 15", "4 GB", "32 GB", "6.1'", "A14", "10mp");
                System.out.println("Sistema Operacional: " + iPhone_9.getSistemaOperacional());
                System.out.println("Memória Ram: " + iPhone_9.getMemoriaRam());
                System.out.println("Memória Rom: " + iPhone_9.getMemoriaRom());
                System.out.println("Tela: " + iPhone_9.getTela());
                System.out.println("Chip: " + iPhone_9.getChip());
                System.out.println("Câmera: " + iPhone_9.getCamera());
                break;
            case IPHONE_13_MINI:
                IphoneType iPhone_13_mini = new IphoneType("Ios 17", "12 GB", "128 GB", "6.1'", "A17", "15mp");
                System.out.println("Sistema Operacional: " + iPhone_13_mini.getSistemaOperacional());
                System.out.println("Memória Ram: " + iPhone_13_mini.getMemoriaRam());
                System.out.println("Memória Rom: " + iPhone_13_mini.getMemoriaRom());
                System.out.println("Tela: " + iPhone_13_mini.getTela());
                System.out.println("Chip: " + iPhone_13_mini.getChip());
                System.out.println("Câmera: " + iPhone_13_mini.getCamera());
                break;
        }

    }


    public static void imprimirMenu() {
        System.out.println("----- Bem vindo a Fábrica de Iphones -----");
        System.out.println("----- MENU -----");
        System.out.println(" 1 - Iphone_x");
        System.out.println(" 2 - Iphone_9");
        System.out.println(" 3 - Iphone_13_mini");
        System.out.println(" Digite a opção desejada: ");
    }


}
