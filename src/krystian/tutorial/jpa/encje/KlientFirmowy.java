package krystian.tutorial.jpa.encje;
import javax.persistence.*;
@Entity
@Table(name="klient_firmowy")
@PrimaryKeyJoinColumn(name="klient_id",referencedColumnName="id")

public class KlientFirmowy extends Klient {
@Column(name="nazwa_firmy",length=100)
private String nazwaFirmy;
@Column(name="nip",length=20)
private String NIP;
public String getNazwaFirmy() {
	return nazwaFirmy;
}
public void setNazwaFirmy(String nazwaFirmy) {
	this.nazwaFirmy = nazwaFirmy;
}
public String getNIP() {
	return NIP;
}
public void setNIP(String NIP) {
	NIP = NIP;
}
}
