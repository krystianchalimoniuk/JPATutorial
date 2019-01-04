package krystian.tutorial.jpa.encje;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="zamowienie")
public class Zamowienie {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="data")
@Temporal(TemporalType.DATE)
private Date data;
@Column(name="adres")
private String adres;
@ManyToOne
@JoinColumn(name="klient",nullable=false)
private Klient klient;
@OneToMany(mappedBy="zamowienie")
List<Skladnik> skladniki;

public List<Skladnik> getSkladniki() {
	return skladniki;
}
public void setSkladniki(List<Skladnik> skladniki) {
	this.skladniki = skladniki;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public String getAdres() {
	return adres;
}
public void setAdres(String adres) {
	this.adres = adres;
}
public Klient getKlient() {
	return klient;
}
public void setKlient(Klient klient) {
	this.klient = klient;
}

}
