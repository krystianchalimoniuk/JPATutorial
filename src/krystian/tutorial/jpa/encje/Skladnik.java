package krystian.tutorial.jpa.encje;
import javax.persistence.*;
@Entity
@Table(name="skladnik")
@IdClass(SkladnikId.class)
public class Skladnik {
@Id
@Column(name="produkt_id",insertable=false,updatable=false)
private int produktId;

@Id
@Column(name="zamowienie_id",insertable=false,updatable=false)
private int zamowienieId;

@Column(name="ilosc")
private int ilosc;
@ManyToOne
@PrimaryKeyJoinColumn(name="produkt_id",referencedColumnName="id")
private Produkt produkt;
@ManyToOne
@PrimaryKeyJoinColumn(name="zamowienie_id",referencedColumnName="id")
private Zamowienie zamowienie;
public int getIlosc() {
	return ilosc;
}
public void setIlosc(int ilosc) {
	this.ilosc = ilosc;
}
public Produkt getProdukt() {
	return produkt;
}
public void setProdukt(Produkt produkt) {
	this.produkt = produkt;
}
public Zamowienie getZamowienie() {
	return zamowienie;
}
public void setZamowienie(Zamowienie zamowienie) {
	this.zamowienie = zamowienie;
}

}
