package Problem0;

import Problem0.services.CarRepairServiceProvider;
import Problem0.services.CleaningProvider;
import Problem0.services.Client;
import Problem0.services.HomeServiceProvider;
import Problem0.services.PaintingProvider;
import Problem0.services.StudentServicesProvider;

public class ApplicationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client("Ali", "Vancouver", "778");
		PaintingProvider provider = new PaintingProvider("David", "Burnaby", "YourBestPainter");
		client.setPaintingProvider(provider);
		provider.receiveService();
		
		CleaningProvider cProvider = new CleaningProvider();
		client.setCleaniningProvider(cProvider);
		cProvider.receiveService();
		
		
		CarRepairServiceProvider carRepairServiceProvider = new CarRepairServiceProvider();
		client.setCarRepairServiceProvider(carRepairServiceProvider);
		carRepairServiceProvider.receiveService();
		
		HomeServiceProvider homeServiceProvider = new HomeServiceProvider();
		client.setHomeServiceProvider(homeServiceProvider);
		homeServiceProvider.receiveCookingService();
		homeServiceProvider.receiveWashingService();
		homeServiceProvider.receiveBabySittingService();
		
		StudentServicesProvider studentServicesProvider = new StudentServicesProvider();
		client.setStudentServicesProvider(studentServicesProvider);
		studentServicesProvider.receiveService();
		
		try {
			
		} catch (Exception esvdsfse) {
			// TODO: handle exception
		}
		
//		String description = "Paint my bedroom";
//		String startDate = "May 2019";
//		String expectedEndDate = "June 2019";
//		String painingColor = "Pink";
//		int size = 1000;
//		String address = "Hastings";
//	
//		
//		PaintingService paintingService = new PaintingService(description, 
//				startDate, 
//				expectedEndDate, 
//				painingColor, 
//				size, 
//				address, client);
//		
//		paintingService.setProvider(provider);
//		
	}

}