package overriding;

public class OgretmenKrediManager extends BaseKrediManager{

	public double hesapla(double tutar) {
		System.out.println("OgretmenKrediManager hesaplandı:");
		return tutar*1.5;
	}

}
