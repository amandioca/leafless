package leafless;

public class UsuarioHolder {

	private static Usuario usuario;

	public static Usuario getUsuario() {
		return usuario;
	}

	public static void setUsuario(Usuario usuario) {
		UsuarioHolder.usuario = usuario;
	}
}
