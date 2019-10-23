package com.exercise19pilasandcolas.app;

import java.util.Stack;

public class PilasandColas {

	public static void main(String[] args)
	{
		//Variable declaration
		String cad = "A significado de fortaleza qué es fortaleza: se conoce como fortaleza a la fuerza, vigor, firmeza, resistencia. en la doctrina cristiana, fortaleza es la tercera virtud cardinal que trata de vencer el temor y eludir la temeridad. no todos los seres humanos poseen esta virtud, pero quienes la contemplan demuestran firmeza en las dificultades que se van presentando a lo largo de la vida y constancia por buscar el bien. asimismo, son capaces de afrontar los problemas con valentía sin dejar a un lado la razón que le permite obrar bajo ciertos principios.";
		
		Stack<Character> letters = new Stack<Character>();
		char[] lettersArray = cad.toCharArray();
		
		for(Character c: lettersArray)
		{
			if(Character.toUpperCase(c)=='A')
			{
				letters.push(c);
			}
		}
		while(!letters.isEmpty())
		{
			System.out.println(letters.pop());
		}
		/*for(Character c : letters)
		{
			System.out.println(letters.pop());
		}
		*/

	}

}
