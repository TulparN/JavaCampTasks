package eTicaretKayıtSistemi.googleRegister;

public class GoogleRegisterManager {

	public void googleRegister(String firstName, String lastName, String email,String password  ) {
		if(!firstName.isEmpty() && !lastName.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
			System.out.println("Google ile kayıt işlemi başarılı : " + firstName);
		}else {
			System.out.println("Bilgilerinizi Kontrol Ediniz.");
		}
	}
}
