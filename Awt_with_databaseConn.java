package examples;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.MenuItem;
import java.awt.Menu;
import java.awt.MenuBar;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class Awt_with_databaseConn {
	
	TextField t;
	Label l1;
	Label display;
	int per_kg;
	Awt_with_databaseConn(){
		Frame f = new Frame();
		 t = new TextField();
		 l1=new Label("kg required");
		 display = new Label();
		 t.setBounds(200,200,220,50);
		 l1.setBounds(20,200,200,50);
		 display.setBounds(200,250,200,150);
		MenuBar mb = new MenuBar();
		Menu veg = new Menu("Available Vegetables");
		Menu fru = new Menu("Available Fruits");
		MenuItem apple = new MenuItem("Apple");
		MenuItem gauva = new MenuItem("Gauva");
		MenuItem orange = new MenuItem("Orange");
		MenuItem banana = new MenuItem("Banana");
		MenuItem onion = new MenuItem("Onion");
		MenuItem tomato = new MenuItem("Tomato");
		MenuItem drumstick = new MenuItem("Drumstick");
		MenuItem bottlegaurd = new MenuItem("BottleGaurd");
		
		fru.add(apple);
		fru.add(gauva);
		fru.add(orange);
		fru.add(banana);
		veg.add(onion);
		veg.add(tomato);
		veg.add(drumstick);
		veg.add(bottlegaurd);
		
		
		mb.add(veg);
		mb.add(fru);
		f.setMenuBar(mb);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.dispose();	
			}
		});
		
		apple.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
				f.add(t);
                f.add(l1);
                f.add(display);   
        		per_kg = 10;
			}
		});
		
		gauva.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
				f.add(t);
                f.add(l1);
                f.add(display);
        		
        		per_kg = 5;
			}
		});
		
		orange.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
				f.add(t);
                f.add(l1);
                f.add(display);
        		
        		per_kg = 20;
			}
		});
		
		banana.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
				f.add(t);
                f.add(l1);
                f.add(display);
        		
        		per_kg = 20;
			}
		});
		
		onion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
				f.add(t);
                f.add(l1);
                f.add(display);
        	   
        		per_kg = 60;
			}
		});
		
		tomato.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
				f.add(t);
                f.add(l1);
                f.add(display);
        		 
        		per_kg = 50;
			}
		});
		
		drumstick.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
				f.add(t);
                f.add(l1);
                f.add(display);
        		
        		per_kg = 25;
			}
		});
		
		bottlegaurd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent es){
				t.setText("");
				display.setText("");
                f.add(t);
                f.add(l1);
                f.add(display);
        		
        		per_kg = 12;
			}
		});
				
		t.addTextListener(new TextListener(){
			public void textValueChanged(TextEvent e){
				try{
					
				display.setText("Per kg cost = " + per_kg +" Total cost = " + Integer.toString(Integer.parseInt(t.getText())*per_kg));
				}
				catch(NumberFormatException e1){
				  display.setText("Enter only integer value");
				}
				catch(Exception e2){
					display.setText(e2.toString());
				}
			}
		});
		
		
	}
 
	public static void main(String[] args){
		new Awt_with_databaseConn();
	}
}
