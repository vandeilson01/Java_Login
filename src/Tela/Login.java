package Tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagem/icone_usuario.jpg")));
		setTitle("Sign in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ButtonOk = new JButton("Ok");
		ButtonOk.setFont(new Font("Tahoma", Font.BOLD, 15));
		ButtonOk.setForeground(Color.WHITE);
		ButtonOk.setBackground(Color.BLUE);
		ButtonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtLogin.getText().equals("marta")||txtLogin.getText().equals("Marta")&&txtSenha.getText().equals("1234")){
					JOptionPane.showMessageDialog(null, "Bem vindo", "Messagem", JOptionPane.WARNING_MESSAGE);
					TelaPrincipal tela = new TelaPrincipal();
					tela.setVisible(true);
					
				}else{
					JOptionPane.showMessageDialog(null, "Acesso negado", "Messagem", JOptionPane.WARNING_MESSAGE);

				}
				
			}
		});
		ButtonOk.setBounds(196, 252, 89, 23);
		contentPane.add(ButtonOk);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(136, 163, 219, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel LabelNome = new JLabel("Login");
		LabelNome.setBounds(135, 148, 46, 14);
		contentPane.add(LabelNome);
		
		JLabel LabelMensagem = new JLabel("Senha");
		LabelMensagem.setBounds(136, 204, 89, 14);
		contentPane.add(LabelMensagem);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(136, 219, 219, 20);
		contentPane.add(txtSenha);
		
		JLabel ImagePitagoras = new JLabel("");
		ImagePitagoras.setHorizontalAlignment(SwingConstants.CENTER);
		ImagePitagoras.setIcon(new ImageIcon(Login.class.getResource("/imagem/pitagoras1.png")));
		ImagePitagoras.setBounds(10, 11, 447, 126);
		contentPane.add(ImagePitagoras);
	}
}
