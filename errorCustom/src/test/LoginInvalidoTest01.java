package test;

import dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Lucas";
        String senhaDB = "Lssj";
        System.out.print("Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválida.");
        }

        System.out.println("Usuario Logado com sucesso");
    }
}
