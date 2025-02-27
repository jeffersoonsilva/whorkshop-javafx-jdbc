module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	exports gui;
	opens gui to javafx.fxml;

	requires javafx.base;
	opens model.entities to javafx.base;
	

}
