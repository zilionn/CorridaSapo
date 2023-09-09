package view;

import controller.ControllerSapo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String valida = "";
		
		do {
		System.out.println("»»　★ ««");
		System.out.println("𝐃𝐈𝐆𝐈𝐓𝐄 𝐆𝐎");
		System.out.println("»» ★　««");
		valida = scanner.next();
		
			if("go".equals(valida)) {
				System.out.println("───── 𝘐𝘕𝘐𝘊𝘐𝘖 𝘋𝘈 𝘊𝘖𝘙𝘙𝘐𝘋𝘈 ─────");
					for (int i = 0; i < 5; i++) {
						Thread corridinhaDoSapo = new ControllerSapo(i);
						corridinhaDoSapo.start();
					}
			} else { 
				System.out.println("───── 𝘛𝘌𝘕𝘛𝘌 𝘕𝘖𝘝𝘈𝘔𝘌𝘕𝘛𝘌 ─────");
			}
		}while (!"go".equals(valida));
		
		scanner.close();
	}

}