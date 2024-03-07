// Datei: Person.java

/** die Klasse Person verwaltet Personendaten
 * @version 1.0
 * @author Frank Hilgenberg
 */

public class Person // Klassendeklaration der Klasse Person
{
	private String name;	// privates Datenfeld name
	private String vorname;	// privates Datenfeld vorname
	
	/**	die Methode setName() setzt den Namen der Person
	 *	@param n Name der Person
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**	die Methode setVorname() setzt den Vornamen der Person
	 *	@param v Vornameame der Person
	 */
	public void setVorname(String v) {
		vorname = v;
	}
	
	/**	die Methode getName() gibt den Namen der Person zurück
	 *	@return Name der Person vom Typ String.
	 */
	public String getName() {
		return name;
	}
	
	/**	die Methode getvorame() gibt den Voramen der Person zurück
	 *	@return Vorname der Person vom Typ String.
	 */
	public String getVorname() {
			return vorname;
	}
}