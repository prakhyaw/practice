package packagejava;

public class OrderFoodServiceImpl implements OrderFoodService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer order(Order ord) {
		
		ValidateElements v = new ValidateElements();
		try{
			v.validateName(ord.name);
			v.validateEmailId(ord.emailId);
			v.validateMobileNumber(ord.mobileNo);
			
			JavaBasicMain main = new JavaBasicMain();
			main.orderList.add(ord);
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return null;
	}

}
