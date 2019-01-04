package krystian.tutorial.jpa.encje;



import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="klient_prywatny")
@PrimaryKeyJoinColumn(name="klient_id",referencedColumnName="id")
public class KlientPrywatny extends Klient {
@Column(name="data_urodzenia")
@Temporal(TemporalType.DATE)
private Date dataUrodzenia;
public KlientPrywatny(){};
public Date getDataUrodzenia() {
	return dataUrodzenia;
}

public void setDataUrodzenia(String imie, String nazwisko,Date dataUrodzenia) {
	this.dataUrodzenia = dataUrodzenia;
}
}
