
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrame extends JFrame{
    private Tigo tigo;
    
    public MenuFrame(Tigo tigo){
        this.tigo=tigo;
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        JPanel menu=new JPanel(new GridBagLayout());
        GridBagConstraints grid = new GridBagConstraints();
        
        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;
        
        
        JButton AgregarPlan =new JButton("Agregar Plan");
        JButton PagoPlan =new JButton("Pago Plan");
        JButton AgregarAmigo =new JButton("Agregar Amigo");
        JButton Listar =new JButton("Listar");
        
        
        
        
        AgregarPlan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                AgregarPlanFrame frame = new AgregarPlanFrame(tigo);
                frame.setVisible(true);
            }
            
            
            
        });
        
        PagoPlan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                PagoPlanFrame frame=new PagoPlanFrame(tigo);
                frame.setVisible(true);
            }
            
            
            
        });
        
        AgregarAmigo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                AmigoFrame frame = new AmigoFrame(tigo);
                frame.setVisible(true);
            }
            
            
            
        });
        
        Listar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                ListarFrame frame = new ListarFrame(tigo);
                frame.setVisible(true);
            }
            
            
            
        });
        
        
        
        menu.add(AgregarPlan, grid);
        menu.add(PagoPlan, grid);
        menu.add(AgregarAmigo, grid);
        menu.add(Listar, grid);
        
        add(menu);
        setVisible(true);
        
        
    }
}
      