import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.*;


public class Calculadora extends JFrame implements ActionListener
{
    
 private JButton btnsuma,btnresta,btnmulti,btndiv,btnBorrar,btnsalir;
 private JTextField valor1,valor2,camporesultado;
 JLabel label1,label2,label3;
 
 public Calculadora()
 {
   super("Calculadora");
   Componentes();
   setSize(380,150);
   setLocationRelativeTo(null);
   setVisible(true);
 }

  
 public void Componentes()
 {   
   Container contenedor = getContentPane();
   contenedor.setLayout( new FlowLayout());
   label1 = new JLabel("N 1");
   contenedor.add(label1);
   valor1 = new JTextField(6);
   contenedor.add(valor1);
   label2 = new JLabel("N 2");
   contenedor.add(label2);
   valor2 = new JTextField(6);
   contenedor.add(valor2);
   btnsuma = new JButton("+");
   contenedor.add(btnsuma);
   btnsuma.addActionListener(this);
   btnresta = new JButton("-");
   contenedor.add(btnresta);
   btnresta.addActionListener(this);
   btnmulti = new JButton("x");
   contenedor.add(btnmulti);
   btnmulti.addActionListener(this);
   btndiv = new JButton("/");
   btndiv.addActionListener(this);
   contenedor.add(btndiv);
   label3 = new JLabel("RESULTADO:");
   contenedor.add(label3);
   camporesultado = new JTextField(10);
   contenedor.add(camporesultado);
   btnBorrar = new JButton("Borrar");
   contenedor.add(btnBorrar);
   btnBorrar.addActionListener(this);
   btnsalir=new JButton("Salir");
   btnsalir.setBackground(Color.green);
   contenedor.add(btnsalir);
   btnsalir.addActionListener(this);
 }
  
 public void actionPerformed(ActionEvent e) 
 {
   double  num1,num2,resu;
   String resultado;
   if (e.getSource()==btnsuma)
   {
      if(valor1.getText().equals("") || valor2.getText().equals(""))
      {
         JOptionPane.showMessageDialog(null, "Los datos están incompletos",
         "Error",JOptionPane.ERROR_MESSAGE); 
      }
      else
      {
         num1=Double.parseDouble(valor1.getText());
         num2=Double.parseDouble(valor2.getText());
         resu=num1+num2;
         resultado=String.valueOf(resu);
         camporesultado.setText(resultado);
      }          
   }
   if (e.getSource()==btnresta)
   {
      if(valor1.getText().equals("") || valor2.getText().equals(""))
      {
         JOptionPane.showMessageDialog(null, "Los datos están incompletos",
         "Error",JOptionPane.ERROR_MESSAGE); 
      }
      else
      {
         num1=Double.parseDouble(valor1.getText());
         num2=Double.parseDouble(valor2.getText());
         resu=num1-num2;
         resultado=String.valueOf(resu);
         camporesultado.setText(resultado);
       }          
   } 
   if (e.getSource()==btnmulti)
   {
      if(valor1.getText().equals("") || valor2.getText().equals(""))
      {
         JOptionPane.showMessageDialog(null, "Los datos están incompletos",
         "Error",JOptionPane.ERROR_MESSAGE); 
      }
      else
      {
         num1=Double.parseDouble(valor1.getText());
         num2=Double.parseDouble(valor2.getText());
         resu=num1*num2;
         resultado=String.valueOf(resu);
         camporesultado.setText(resultado);
      }          
   }
   if (e.getSource()==btndiv)
   {
      if(valor1.getText().equals("") || valor2.getText().equals(""))
      {
         JOptionPane.showMessageDialog(null, "Los datos están Incompletos",
         "Error",JOptionPane.ERROR_MESSAGE);
      }
      else
      {
         num1=Double.parseDouble(valor1.getText());
         num2=Double.parseDouble(valor2.getText());
         try
         {
            resu=num1/num2;
            resultado=String.valueOf(resu);
            camporesultado.setText(resultado);
         }
         catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "División entre cero",
            "Error",JOptionPane.ERROR_MESSAGE);
          }
           
      }  
   }  
        
   if (e.getSource()==btnBorrar)
   {
      valor1.setText("");
      valor2.setText("");
      camporesultado.setText("");
   } 
   if(e.getSource()==btnsalir)
   {
      System.exit(0);   
   }
 }
     
 public static void main(String[] args) 
 {
   JFrame.setDefaultLookAndFeelDecorated(true);
   Calculadora calc = new Calculadora();
   calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }    
}