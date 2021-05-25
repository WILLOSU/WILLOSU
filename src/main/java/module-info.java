module br.edu.facthus {
	requires javafx.controls;
	requires javafx.fxml;

	opens br.edu.facthus to javafx.fxml;
	exports br.edu.facthus;
}