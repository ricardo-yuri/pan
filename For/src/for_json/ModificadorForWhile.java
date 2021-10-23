package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificadorForWhile {
	
	public static void main(String[] args) {
		
		//FOR UTIL SE CONHECE O TAMANHO DO ARRAY
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		// USE UM FORLOOP PARA IMPRIMIR "CONSEGUI" 5 VEZES E O NUMERO DA TENTATIVA NA FRENTE
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Consegui" + i);
		}
		
		//while para quando queremos
		String example = "2021.10.10";
		Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
		Matcher matcher = pattern.matcher(example);
		// verifies full match
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		//WHILE PEGANDO SO NUMEROS
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("hello1234goodboy789very2345");
		while (m.find()) {
			System.out.println(m.group());
		}
		
		String text = "John speak  and John writes about that,\"\r\n"
				+ "				+ \" and John think 2021.10.10 about everything.\r\n";
		
		String nominho = "(John)";
		
		Pattern partternNominho = Pattern.compile(nominho);
		
		Matcher matcherNominho = partternNominho.matcher(text);
		
		while(matcherNominho.find()) {
			System.out.println("found: " + matcherNominho.group());
		}

		
	}

}
