
public class AdoptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dawg hippie = new Dawg("hippie", false, 13);
		PuppyDog mistake = new PuppyDog("mistake", false, 4, false);

		System.out.println(hippie.getAdoptionStatus());
		System.out.println(mistake.getAdoptionStatus());
		mistake.increaseAge();
		hippie.increaseAge();
		System.out.println(hippie);
		System.out.println(mistake);
		System.out.println(mistake.toString());
		
		Dawg whatsUp = new Dawg("WhatsUp", false, 1);
		Dawg whatsDown = new Dawg("WhatsUp", false, 1);
		PuppyDog yeah = new PuppyDog("WhatsUp", false, 1, true);
		PuppyDog yeah2 = new PuppyDog("WhatsUp", false, 1, false);
		System.out.println(yeah.equals(yeah2));
	}

}
