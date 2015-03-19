package financeiro;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmLogin extends JDialog {
	private JTextField edtUsuario;
	private JPasswordField edtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin dialog = new frmLogin();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public frmLogin() {
		setBounds(100, 100, 268, 196);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setModal(true);
		
		JLabel lblUsuario = new JLabel("Usuário");
		lblUsuario.setBounds(32, 32, 70, 15);
		getContentPane().add(lblUsuario);
		
		edtUsuario = new JTextField();
		edtUsuario.setFont(new Font("Dialog", Font.PLAIN, 14));
		edtUsuario.setBounds(112, 29, 124, 21);
		getContentPane().add(edtUsuario);
		edtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(32, 84, 70, 15);
		getContentPane().add(lblSenha);
		
		edtSenha = new JPasswordField();
		edtSenha.setFont(new Font("Dialog", Font.PLAIN, 14));
		edtSenha.setBounds(112, 81, 124, 21);
		getContentPane().add(edtSenha);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FuncLogin.Login(edtUsuario.getText(), edtSenha.getText());
			}
		});
		btnOk.setBounds(32, 132, 96, 25);
		getContentPane().add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(140, 132, 96, 25);
		getContentPane().add(btnCancelar);

	}
}
