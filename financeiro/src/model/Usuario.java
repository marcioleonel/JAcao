package model;

public class Usuario {

	public int id_usuario;
	public String nm_usuario;
	public String nm_senha;
	
	@SuppressWarnings("unused")
	private int getId_usuario() {
		return id_usuario;
	}
	
	private void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	private String getNm_usuario() {
		return nm_usuario;
	}
	
	private void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}
	
	private String getNm_senha() {
		return nm_senha;
	}
	
	private void setNm_senha(String nm_senha) {
		this.nm_senha = nm_senha;
	}
	
}
