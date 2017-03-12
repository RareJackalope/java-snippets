package rarejackalope.chapter1.challenge;

public class Queen extends Character
{
	
	public void Queen()
	{
		weapon = new KnifeBehaviour();
	}

	@Override
	public void fight() 
	{
		weapon.useWeapon();
	}
	
	
}
