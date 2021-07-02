package lista1;

public class lista1Tarefa7 {

	public static void main(String[] args) {
		canner leia = new Scanner(System.in);

        double a, b, c, d, e, f, x, y;

        System.out.println("Digita um número para a:");
        a = leia.nextDouble();
        System.out.println("Digita um número para b:");
        b = leia.nextDouble();
        System.out.println("Digita um número para c:");
        c = leia.nextDouble();
        System.out.println("Digita um número para d:");
        d = leia.nextDouble();
        System.out.println("Digita um número para e:");
        e = leia.nextDouble();
        System.out.println("Digita um número para f:");
        f = leia.nextDouble();

        x= ((ce)-(bf)) / ((ae)-(bd));
        y= ((af)-(cd)) / ((ae)-(bd));

        System.out.printf("Considerando que x=ce-bf/ae-bd e y=af-cd/ae-bd, o resultado de x é: %.2f e o resultado de y é: %f.2",x,y);


	}

}
