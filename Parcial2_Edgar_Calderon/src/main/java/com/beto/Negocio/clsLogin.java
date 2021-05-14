package com.beto.Negocio;

import com.beto.Entidades.Login;

public class clsLogin {

	public int acceso(Login log) {
		int acceso = 0;
		if (log.getUser().equals("beto") && log.getPass().equals("123")) {
			acceso = 1;
		} else {

		}
		return acceso;
	}
}
