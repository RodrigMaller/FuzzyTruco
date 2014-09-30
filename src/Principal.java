import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;


public class Principal {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Principal window = new Principal();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Assistente para Truqueiros Iniciantes");
		
		Label lblQualOTipo = new Label(shell, SWT.NONE);
		lblQualOTipo.setFont(SWTResourceManager.getFont("Times New Roman", 15, SWT.BOLD));
		lblQualOTipo.setBounds(96, 34, 244, 23);
		lblQualOTipo.setText("Qual o tipo da mesa patr\u00E3o?");
		
		//Botao 1 x 1
		Button btx1 = new Button(shell, SWT.NONE);
		btx1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				X1 x1 = new X1();
				shell.close();
				x1.open();				
			}
		});
		btx1.setBounds(161, 86, 110, 38);
		btx1.setText("1 X 1");
		
		
		//Botao 2 x 2
		Button btx2 = new Button(shell, SWT.NONE);
		btx2.setText("2 x 2");
		btx2.setBounds(161, 161, 110, 38);

	}
}