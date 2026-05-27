package edu.renato.segundasemana;
public class MinhaClasse {
  public static void main(String [] args)  {

    String primeiroNome = "Renato";
    String segundoNome = "Vegh";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    //return primeiroNome.concat(" ").concat(segundoNome);

    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

  }

  }
