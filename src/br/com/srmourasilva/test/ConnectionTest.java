package br.com.srmourasilva.test;

import br.com.srmourasilva.modhostbinding.Connection;

public class ConnectionTest {
	public static void main(String[] args) {
		Connection connection = new Connection();
		String retorno = connection.send("Teste");
	}
}
