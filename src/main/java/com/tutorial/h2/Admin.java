/*
 * package com.tutorial.h2;
 * 
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.Id;
 * 
 * @Entity public class Admin implements Serializable {
 * 
 * @Id
 * 
 * @GeneratedValue private Long idAdmin;
 * 
 * @Column(unique = true) private String nni;
 * 
 * @Column(unique = true) private String login; private String password; private
 * String nom; private String prenom; private String email;
 * 
 * public Admin() { super(); // TODO Auto-generated constructor stub }
 * 
 * public Admin( String nni, String login, String password, String nom, String
 * prenom, String email) {
 * 
 * 
 * super(); this.nni = nni; this.login = login; this.password = password;
 * this.nom = nom; this.prenom = prenom; this.email = email; }
 * 
 * public Long getIdAdmin() { return idAdmin; }
 * 
 * public void setIdAdmin(Long idAdmin) { this.idAdmin = idAdmin; }
 * 
 * public String getNni() { return nni; }
 * 
 * public void setNni(String nni) { this.nni = nni; }
 * 
 * public String getLogin() { return login; }
 * 
 * public void setLogin(String login) { this.login = login; }
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * public String getNom() { return nom; }
 * 
 * public void setNom(String nom) { this.nom = nom; }
 * 
 * public String getPrenom() { return prenom; }
 * 
 * public void setPrenom(String prenom) { this.prenom = prenom; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; } }
 */