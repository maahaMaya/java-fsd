 package camera_rental_app;

public class RentDetail {
	public int cameraId;
	public String customerId;
	public int cameraQunatity;
	public int cameraPricePerDay;
	
	public RentDetail(int cameraId, String customerId, int cameraQunatity, int cameraPricePerDay) {
		this.cameraId = cameraId;
		this.customerId = customerId;
		this.cameraQunatity = cameraQunatity;
		this.cameraPricePerDay = cameraPricePerDay;
	}
}
