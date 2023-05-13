package camera_rental_app;

public class CameraDetail {
	public int cameraId;
	public String customerId;
	public String cameraBrand;
	public String cameraModel;
	public int cameraQunatity;
	public int cameraPricePerDay;

	public CameraDetail(int cameraId, String customerId, String cameraBrand, String cameraModel, int cameraQunatity,
			int cameraPricePerDay) {
		this.cameraId = cameraId;
		this.customerId = customerId;
		this.cameraBrand = cameraBrand;
		this.cameraModel = cameraModel;
		this.cameraQunatity = cameraQunatity;
		this.cameraPricePerDay = cameraPricePerDay;
	}
}
