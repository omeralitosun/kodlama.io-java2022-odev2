package overriding;

public class OgretmenKrediManager extends BaseKrediManager{

	public double hesapla(double tutar) {
		System.out.println("OgretmenKrediManager hesapland─▒:");
		return tutar*1.5;
	}

}
