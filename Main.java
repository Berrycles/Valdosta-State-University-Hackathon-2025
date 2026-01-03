package application;
	
import java.math.BigDecimal;
import java.util.List;
import java.util.Queue;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Main extends Application {
	protected Label lbl;
	
	protected Label lbl2;
	protected TextField txfProperties;
	protected Button createEmployee;
	protected TextArea txaMessage;
	
	protected Label lbl3;
	protected TextField txfIdSearch;
	protected Button findEmployeeWithId;
	protected TextArea txaMessage2;
	
	protected Label lbl4;
	protected TextField txfNameSearch;
	protected Button findEmployeeWithName;
	protected TextArea txaMessage3;
	
	protected Label lbl5;
	protected TextField assignId1;
	protected Button assignTask1;
	protected TextArea txaTask1;
	
	protected Label lb6;
	
	protected Label lbl7;
	protected TextField txfLogIn;
	protected Button viewTasks;
	protected TextArea txaTasks2;
	
	protected Button finishTask;
	
//	protected Label lbl6;
//	protected TextField assignId2;
//	protected Button assignTask2;
//	protected TextArea txaTask2;
//	
//	protected Label lbl7;
//	protected TextField assignId3;
//	protected Button assignTask3;
//	protected TextArea txaTask3;
//	protected Button btnHelloWorld4;
//	protected Button openEmployeeGUIButton;
	
	private EmployeeManager employeeManager = new EmployeeManager();
	
	@Override
	
	public void start(Stage primaryStage) {
		try {
			// Create controls
			lbl = new Label("Administrative Application");
			
			lbl2 = new Label("Create New Employee");
			txfProperties = new TextField();
			txfProperties.setPromptText(
		            "Enter: id,name,address,salary,dateOfHire,dateOfBirth,department,role"
		        );
			createEmployee = new Button("Create Employee");
			txaMessage = new TextArea();
			txaMessage.setPrefHeight(100);
			txaMessage.setPrefWidth(200);
			
			lbl3 = new Label("Find Employee with ID");
			txfIdSearch = new TextField();
			txfIdSearch.setPromptText(
		            "Enter: id"
		        );
			findEmployeeWithId = new Button("Find Employee");
			txaMessage2 = new TextArea();
			txaMessage2.setPrefHeight(100);
			txaMessage2.setPrefWidth(200);
			
			lbl4 = new Label("Find Employee with Name");
			txfNameSearch = new TextField();
			txfNameSearch.setPromptText(
		            "Enter: Name"
		        );
			findEmployeeWithName = new Button("Find Employee");
			txaMessage3 = new TextArea();
			txaMessage3.setPrefHeight(100);
			txaMessage3.setPrefWidth(200);
			
			lbl5 = new Label("Assign by Id");
			assignId1 = new TextField();
			assignId1.setPromptText(
		            "Enter: id"
		        );
			assignTask1 = new Button("Assign Task");
			txaTask1 = new TextArea();
			txaTask1.setPrefHeight(100);
			txaTask1.setPrefWidth(200);
			
			lb6 = new Label("Employee Application");
			
			lbl7 = new Label("Find tasks");
			txfLogIn = new TextField();
			txfLogIn.setPromptText(
		            "Enter: id"
		        );
			viewTasks = new Button("Find tasks");
			txaTasks2 = new TextArea();
			txaTasks2.setPrefHeight(100);
			txaTasks2.setPrefWidth(200);
			
			finishTask= new Button("Finish task");
			
//			lbl6 = new Label("Assign by Id");
//			assignId2 = new TextField();
//			assignId2.setPromptText(
//		            "Enter: id"
//		        );
//			assignTask2 = new Button("Assign Task");
//			txaTask2 = new TextArea();
//			txaTask2.setPrefHeight(100);
//			txaTask2.setPrefWidth(200);
//			
//			lbl7 = new Label("Assign by Id");
//			assignId3 = new TextField();
//			assignId3.setPromptText(
//		            "Enter: id"
//		        );
//			assignTask3 = new Button("Assign Task");
//			txaTask3 = new TextArea();
//			txaTask3.setPrefHeight(100);
//			txaTask3.setPrefWidth(200);
			
			//the controls for each section are grouped together
			
			// In your UI setup:
			

			// Add to your layout
			
			

			// Create container for controls
			GridPane root = new GridPane();

			// Add controls to container
			root.add(lbl, 1, 0);
			
			root.add(lbl2, 0, 1);
			root.add(txfProperties, 0, 2);
			root.add(createEmployee, 0, 3);
			root.add(txaMessage, 0, 4);
			
			root.add(lbl3, 1, 1);
			root.add(txfIdSearch, 1, 2);
			root.add(findEmployeeWithId, 1, 3);
			root.add(txaMessage2, 1, 4);
			
			root.add(lbl4, 2, 1);
			root.add(txfNameSearch, 2, 2);
			root.add(findEmployeeWithName, 2, 3);
			root.add(txaMessage3, 2, 4);
			
			root.add(lbl5, 1, 5);
			root.add(assignId1, 1, 6);
			root.add(assignTask1, 1, 7);
			root.add(txaTask1, 1, 8);
			
			root.add(lb6, 4, 0);
			root.add(lbl7, 4, 1);
			root.add(txfLogIn, 4, 2);
			root.add(viewTasks, 4, 3);
			root.add(txaTasks2, 4, 4);
			
			root.add(finishTask, 4, 5);
			
//			root.add(lbl6, 1, 5);
//			root.add(assignId2, 1, 6);
//			root.add(assignTask2, 1, 7);
//			root.add(txaTask2, 1, 8);
//			
//			root.add(lbl7, 2, 1);
//			root.add(assignId3, 2, 2);
//			root.add(assignTask3, 2, 3);
//			root.add(txaTask3, 2, 4);
			
			createEmployee.setOnAction(new CreateEmployeeEventHandler());
			findEmployeeWithId.setOnAction(new SearchByIdEventHandler());
			findEmployeeWithName.setOnAction(new SearchByNameEventHandler());
			assignTask1.setOnAction(new AssignTaskEventHandler());
			viewTasks.setOnAction(new ViewTasksEventHandler());
			finishTask.setOnAction(new FinishTaskEventHandler());
			
//			openEmployeeGUIButton = new Button("Open Employee View");
//			layout.getChildren().add(openEmployeeGUIButton);
//			openEmployeeGUIButton.setOnAction(new OpenEmployeeGUIEventHandler());
			// Set the size of window (pixels)
			Scene scene = new Scene(root,300,250);

			// Set the title for the window
			primaryStage.setTitle("Hello World");

			// Code to display the Gui

			

//			root.setCenter(lbl);
//			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Inner class for creating an employee
    private class CreateEmployeeEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                String input = txfProperties.getText().trim();
                String[] parts = input.split(",");
                if (parts.length != 8) {
                	txaMessage.setText("Error: Input must have 8 comma-separated values.");
                    return;
                }

                int id = Integer.parseInt(parts[0].trim());
                
                if (employeeManager.employeeExists(id)) {
                	txaMessage.setText("Error: Employee with ID " + id + " already exists.");
                    return;
                }
                
                String name = parts[1].trim();
                String address = parts[2].trim();
                BigDecimal salary = new BigDecimal(parts[3].trim());
                String dateOfHire = parts[4].trim();
                String dateOfBirth = parts[5].trim();
                String department = parts[6].trim();
                String role = parts[7].trim();

                Employee emp = new Employee(id, name, address, salary, dateOfHire, dateOfBirth, department, role);
                employeeManager.addEmployee(emp);
                txaMessage.setText("Employee added:\n" + emp);
            } catch (Exception ex) {
            	txaMessage.setText("Error: " + ex.getMessage());
            }
        }
    }
    
    // Inner class for searching by ID
    private class SearchByIdEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                int id = Integer.parseInt(txfIdSearch.getText().trim());
                Employee emp = employeeManager.findById(id);
                if (emp != null) {
                	txaMessage2.setText(emp.toString());
                } else {
                	txaMessage2.setText("Employee with ID " + id + " not found.");
                }
            } catch (Exception ex) {
            	txaMessage2.setText("Error: " + ex.getMessage());
            }
        }
    }
    
 // Inner class for searching by name
    private class SearchByNameEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                String name = txfNameSearch.getText().trim();
                List<Employee> matches = employeeManager.findAllByName(name);
                if (matches.isEmpty()) {
                	txaMessage3.setText("No employees found with name '" + name + "'.");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Found ").append(matches.size()).append(" employee(s) with name '").append(name).append("':\n\n");
                    for (Employee emp : matches) {
                        sb.append(emp.toString()).append("\n\n");
                    }
                    txaMessage3.setText(sb.toString());
                }
            } catch (Exception ex) {
            	txaMessage3.setText("Error: " + ex.getMessage());
            }
        }
    }
    
    private class AssignTaskEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                int id = Integer.parseInt(assignId1.getText().trim());
                String task = txaTask1.getText().trim();
                if (task.isEmpty()) {
                    txaTask1.setText("Error: Task description cannot be empty.");
                    return;
                }

                Employee emp = employeeManager.findById(id);
                if (emp == null) {
                    txaTask1.setText("Error: Employee with ID " + id + " not found.");
                    return;
                }

                emp.addTask(task);
                txaTask1.setText("Task assigned successfully to " + emp.getName() + ":\n" + task);
            } catch (NumberFormatException ex) {
                txaTask1.setText("Error: Invalid employee ID.");
            } catch (Exception ex) {
                txaTask1.setText("Error: " + ex.getMessage());
            }
        }
    }

    private class ViewTasksEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                int id = Integer.parseInt(txfLogIn.getText().trim());
                Employee emp = employeeManager.findById(id);
                if (emp != null) {
                    Queue<String> tasks = emp.getTasks();
                    if (tasks.isEmpty()) {
                        txaTasks2.setText("No tasks found for this employee");
                    } else {
                        StringBuilder taskList = new StringBuilder();
                        int taskNumber = 1;
                        for (String task : tasks) {
                            taskList.append(taskNumber++).append(". ").append(task).append("\n");
                        }
                        txaTasks2.setText(taskList.toString());
                    }
                } else {
                    txaTasks2.setText("Employee with ID " + id + " not found.");
                }
            } catch (Exception ex) {
                txaTasks2.setText("Error: " + ex.getMessage());
            }
        }
    }
    
    
    
    private class FinishTaskEventHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            try {
                int id = Integer.parseInt(txfLogIn.getText().trim());
                Employee emp = employeeManager.findById(id);
                if (emp != null) {
                    Queue<String> tasks = emp.getTasks();
                    if (tasks.isEmpty()) {
                        txaTasks2.setText("No tasks to finish");
                        txaTask1.setText("Employee ID " + id + " has no tasks to complete");
                    } else {
                        String finishedTask = tasks.poll(); // Remove the first task from the queue
                        txaTasks2.setText("Task completed: " + finishedTask);
                        txaTask1.setText("Employee ID " + id + " completed task: " + finishedTask);
                    }
                } else {
                    txaTasks2.setText("Employee with ID " + id + " not found.");
                    txaTask1.setText("Employee with ID " + id + " not found.");
                }
            } catch (Exception ex) {
                txaTasks2.setText("Error: " + ex.getMessage());
                txaTask1.setText("Error: " + ex.getMessage());
            }
        }
    }
    
    
    


	
	public static void main(String[] args) {
		launch(args);
	}
}
