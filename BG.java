import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
 
public class BG extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	int x,y,z;
	JSlider slider_1;
	JSlider slider_2;
	JSlider slider_3;
	
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	

	
	Color custom_color;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BG frame = new BG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * labels 1,2,3.
		 */
	
		 label_1 = new JLabel("0");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(303, 39, 85, 50);
		contentPane.add(label_1);
		
		 label_2 = new JLabel("0");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(303, 110, 85, 50);
		contentPane.add(label_2);
		
		 label_3 = new JLabel("0");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(303, 185, 85, 50);
		contentPane.add(label_3);
		
		/**
		 * sliders 1,2,3.
		 */
		
		 slider_1 = new JSlider();
		 slider_1.addChangeListener(new ChangeListener() {
		 	public void stateChanged(ChangeEvent e) {
		 		
				int x=slider_1.getValue();
				label_1.setText(String.valueOf(x));
				
				custom_color = new Color(x,y,z);
				contentPane.setBackground(custom_color);
				
		 	}
		 });
		 
		slider_1.setValue(0);
		slider_1.setMinorTickSpacing(5);
		slider_1.setMajorTickSpacing(10);
		slider_1.setPaintLabels(true);
		slider_1.setPaintTicks(true);
		slider_1.setBounds(28, 39, 251, 50);
		contentPane.add(slider_1);
		
		 slider_2 = new JSlider();
		 slider_2.addChangeListener(new ChangeListener() {
		 	public void stateChanged(ChangeEvent e) {
		 		
		 		int y=slider_2.getValue();
				label_2.setText(String.valueOf(y));
				
				custom_color = new Color(x,y,z);
				contentPane.setBackground(custom_color);
				
		 	}
		 });

		slider_2.setValue(0);
		slider_2.setPaintTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setMinorTickSpacing(5);
		slider_2.setMajorTickSpacing(10);
		slider_2.setBounds(28, 110, 251, 50);
		contentPane.add(slider_2);
		
		 slider_3 = new JSlider();
		 slider_3.addChangeListener(new ChangeListener() {
		 	public void stateChanged(ChangeEvent e) {
				
				int z=slider_3.getValue();
				label_3.setText(String.valueOf(z));
				
				custom_color = new Color(x,y,z);
				contentPane.setBackground(custom_color);
				
		 	}
		 });

		slider_3.setValue(0);
		slider_3.setPaintTicks(true);
		slider_3.setPaintLabels(true);
		slider_3.setMinorTickSpacing(5);
		slider_3.setMajorTickSpacing(10);
		slider_3.setBounds(28, 185, 251, 50);
		contentPane.add(slider_3);
	}	
}

