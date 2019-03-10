package packagejava;

public class ValidateElements {
	
	public void validateName(String name)
	{
		String regex = "^([a-zA-Z]+ )+[a-zA-Z]+$";
		try
		{
			if(name.matches(regex))
			{
				System.out.println("valid name");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid name");
		}

	}
	
	public void validateEmailId(String emailId)
	{
		String regex = "^[a-zA-Z0-9]+@gmail.com$";
		String regex1 = "^[a-zA-Z0-9]+@infosys.com$";
		try
		{
			if(emailId.matches(regex) || emailId.matches(regex1))
			{
				System.out.println("valid email id");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Email id");
		}
	}
	
	public void validateMobileNumber(Long mobileNumber)
	{
		String mobileNo = mobileNumber.toString();
		String regex = "^[789][0-9]{9}$";
		try
		{
			if(mobileNo.matches(regex))
			{
				System.out.println("valid mobile number");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid mobile number");
		}
	}

	public static void main(String[] args) {
	}

}
