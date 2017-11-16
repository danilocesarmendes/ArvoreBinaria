package br.com.danilocesarmendes.s2it;

/**
 * 
 * @author Danilo Mendes
 */
public class ManipulationNumber {

	public static Integer gerarC(Integer a_, Integer b_) {

		Integer valor = null;
		String a = a_.toString();
		String b = b_.toString();
		
		if (a != null && b != null) {

			StringBuilder c = new StringBuilder();
			System.out.println("Valores de Entrada: " + a + " - " + b);
			int i = 0;
			int j = 0;

			loop: for (; i <= a.length();) {
				System.out.println(i);
				int proxi = i + 1;
				if (proxi <= a.length()) {
					c.append(a.substring(i, proxi)).toString();
				}
				i++;

				for (; j <= b.length();) {
					System.out.println(j);
					int proxj = j + 1;
					if (proxj <= b.length()) {
						c.append(b.substring(j, proxj)).toString();
					}
					j++;

					continue loop;
				}
			}
			try {
				valor = Integer.valueOf(c.toString());
				if (valor < 1000000) {
					System.out.println("Valor de Saída: " + c);
				} else {
					valor = -1;
					System.out.println("Número maior que 1.000.000:" + valor);
				}
			} catch (Exception e) {
				valor = -1;
				System.out.println("Ocorreu um erro na aplicação: " + e + " o valor de c é: " + valor);
			}
		}
		return valor;
	}

	public static void executa(Integer a, Integer b) {
		if (a.toString().length() > b.toString().length()) {
			gerarC(a, b);
		} else {
			gerarC(b, a);
		}
	}

	public static void main(String[] args) {
		executa(24, 1999);
	}

}