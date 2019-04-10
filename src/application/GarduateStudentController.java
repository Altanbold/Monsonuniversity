package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GarduateStudentController implements Initializable {

  
	private TableView<GarduateStudentModel> table;
	private TableColumn<GarduateStudentModel,String> col_number;
	private TableColumn<GarduateStudentModel,String> col_fname;
	private TableColumn<GarduateStudentModel,String> col_mname;
	private TableColumn<GarduateStudentModel,String> col_lname;
	private TableColumn<GarduateStudentModel,String> col_majid;
	private TableColumn<GarduateStudentModel,String> col_minid;
	
	ObservableList<GarduateStudentModel> oblist =  FXCollections.observableArrayList();


	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.err.println("ssdsds");
		Connection con=DBConnection.getConnection();
		try {
			ResultSet rs=con.createStatement().executeQuery("Select * from undergraduateregistrations");
			while(rs.next()) {
				oblist.add(new GarduateStudentModel(rs.getString("StudentNumber"),rs.getString("FirstName"),rs.getString("MiddleName"),rs.getString("LastName"),rs.getString("MajorID"),rs.getString("MinorID")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		col_number.setCellValueFactory(new PropertyValueFactory<>("studentnumber"));
		col_fname.setCellValueFactory(new PropertyValueFactory<>("fname"));
		col_mname.setCellValueFactory(new PropertyValueFactory<>("mname"));
		col_lname.setCellValueFactory(new PropertyValueFactory<>("lname"));
		col_majid.setCellValueFactory(new PropertyValueFactory<>("majid"));
		col_minid.setCellValueFactory(new PropertyValueFactory<>("minid"));
		
		table.setItems(oblist);
	}

}
