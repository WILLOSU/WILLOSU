package br.edu.facthus;

import java.io.IOException;

import br.edu.facthus.model.Corretor;
import br.edu.facthus.model.Imovel;
import br.edu.facthus.model.Pessoa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Scene scene;

	@Override
	public void start(Stage primaryStage) throws IOException {
		scene = new Scene(loadFXML("main"), 640, 480);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = 
				new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	
	public static void main(String[] args) {
		launch(args);
		
		/*
		Pessoa p1 = new Pessoa("Fulano da Silva", 
				"123.456.789-10",
				"(34) 3333-2222");
		Corretor c1 = new Corretor("Cicrano de Souza",
				"987.654.321-00",
				"(34) 3333-3333",
				"1234",
				0.05);
		
		Imovel i1 = new Imovel("AP12345", 600, p1);
		i1.setAlugado(true);
		i1.setCorretor(c1);
		
		System.out.printf("Imóvel: %s\n"
				+ "Proprietário: %s\n"
				+ "Corretor: %s\n",
				i1.getRegistro(),
				i1.getProprietario().getNome(),
				i1.getCorretor().getNome());
				*/
		
		
	}

}
