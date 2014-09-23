package com.FuzzyTruco;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.custom.SashForm;

public class TelaInicial {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaInicial window = new TelaInicial();
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
		shell.setMinimumSize(new Point(800, 600));
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		shell.setSize(800, 600);
		shell.setText("FuzzyTruco");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					TelaAuxilio telaAuxilio = new TelaAuxilio();
					telaAuxilio.open();
				}
				catch (Exception exc) {
					MessageDialog.open(MessageDialog.ERROR, shell, "Error", "Erro ao entrar na tela de Auxilio", 0);
				}
			}
		});
		btnNewButton.setBounds(350, 264, 75, 25);
		btnNewButton.setText("Auxilio");
		
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(163, 10, 267, 200);
		
		SashForm sashForm = new SashForm(shell, SWT.NONE);
		sashForm.setBounds(36, 10, 121, 198);

	}
}
