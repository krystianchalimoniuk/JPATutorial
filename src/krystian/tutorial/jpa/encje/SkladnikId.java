package krystian.tutorial.jpa.encje;

import java.io.Serializable;

public class SkladnikId implements Serializable {
private int produktId;
private int zamowienieId;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + produktId;
	result = prime * result + zamowienieId;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SkladnikId other = (SkladnikId) obj;
	if (produktId != other.produktId)
		return false;
	if (zamowienieId != other.zamowienieId)
		return false;
	return true;
}

}
