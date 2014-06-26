package ro.inf.p2.project;



public class DameStein extends SpielStein{


	public DameStein(int posX, int posY, int farbe)
	{
		super(posX, posY, farbe);
	}
	public DameStein(ISpielFigur figur) {
		super(figur.gibPosX(), figur.gibPosX(), figur.gibFarbe() );
	}


	
	
	public boolean gueltigeBewegung( int posX, int posY)
	{
		int diffX = Math.abs(posX-this.gibPosX());
		int diffY = Math.abs(posY-this.gibPosY());

		// Bewegung ist l�nger als ein Sprung
		if(diffX > 2)	return false;
		if(diffY > 2)	return false;
		
		// Dame erh�lt zus�tzliche Bewegungsrichtungen
		// -> unabh�ngig von der Farbe
		if( !super.validiereRichtungsVektorSchwarz(diffX, diffY) ||
			!super.validiereRichtungsVektorWeiss(diffX, diffY))
		{
				return false;		// Bew. nicht m�glich
		}
		
		return true;
	}
	
	
	
}
