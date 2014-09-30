import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;


public class X1 {

	protected Shell shell;
	private Text fieldSuaCt1;
	private Text fieldSuaCt2;
	private Text fieldSuaCt3;
	private Text fieldTombo;
	private Text fieldOpCt1;
	private Text fieldOpCt2;
	private Text fieldOpCt3;
	private Mesa mesa;
	private Mesa bckupMesa;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			X1 window = new X1();
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
		this.mesa      = new Mesa();
		this.bckupMesa = new Mesa();
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Mesa 1 x 1");

		Button btnSair = new Button(shell, SWT.NONE);
		btnSair.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Principal pcp = new Principal();
				shell.close();
				pcp.open();

			}
		});
		btnSair.setBounds(359, 0, 75, 25);
		btnSair.setText("Sair");

		fieldSuaCt1 = new Text(shell, SWT.BORDER);
		fieldSuaCt1.setBounds(10, 193, 76, 21);

		fieldSuaCt2 = new Text(shell, SWT.BORDER);
		fieldSuaCt2.setBounds(171, 193, 76, 21);

		fieldSuaCt3 = new Text(shell, SWT.BORDER);
		fieldSuaCt3.setBounds(330, 193, 76, 21);

		Label lblSuaCt1 = new Label(shell, SWT.NONE);
		lblSuaCt1.setBounds(10, 172, 110, 15);
		lblSuaCt1.setText("Carta 1");

		Label lblSuaCt2 = new Label(shell, SWT.NONE);
		lblSuaCt2.setBounds(173, 172, 104, 15);
		lblSuaCt2.setText("Carta 2");

		Label lblSuaCt3 = new Label(shell, SWT.NONE);
		lblSuaCt3.setBounds(330, 172, 104, 15);
		lblSuaCt3.setText("Carta 3");

		Label lblSuaMo = new Label(shell, SWT.NONE);
		lblSuaMo.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblSuaMo.setBounds(10, 153, 55, 15);
		lblSuaMo.setText("Sua m\u00E3o:");

		Label lblTombo = new Label(shell, SWT.NONE);
		lblTombo.setText("Tombo/Vira:");
		lblTombo.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblTombo.setBounds(10, 91, 87, 21);

		fieldTombo = new Text(shell, SWT.BORDER);
		fieldTombo.setBounds(10, 118, 76, 21);

		Label lblOponente = new Label(shell, SWT.NONE);
		lblOponente.setText("M\u00E3o do Marreco:");
		lblOponente.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblOponente.setBounds(10, 10, 110, 21);

		Label lblOpCt1 = new Label(shell, SWT.NONE);
		lblOpCt1.setText("Carta 1");
		lblOpCt1.setBounds(10, 31, 55, 15);

		Label lblOpCt2 = new Label(shell, SWT.NONE);
		lblOpCt2.setText("Carta 2");
		lblOpCt2.setBounds(173, 31, 55, 15);

		Label lblOpCt3 = new Label(shell, SWT.NONE);
		lblOpCt3.setText("Carta 3");
		lblOpCt3.setBounds(330, 31, 55, 15);

		fieldOpCt1 = new Text(shell, SWT.BORDER);
		fieldOpCt1.setBounds(10, 52, 76, 21);

		fieldOpCt2 = new Text(shell, SWT.BORDER);
		fieldOpCt2.setBounds(171, 52, 76, 21);

		fieldOpCt3 = new Text(shell, SWT.BORDER);
		fieldOpCt3.setBounds(330, 52, 76, 21);

		Button btnMao = new Button(shell, SWT.RADIO);
		btnMao.setSelection(true);
		btnMao.setBounds(171, 118, 90, 16);
		btnMao.setText("M\u00E3o");
		
		Button btnPe = new Button(shell, SWT.RADIO);
		btnPe.setSelection(false);
		btnPe.setBounds(171, 140, 90, 16);
		btnPe.setText("P\u00E9");
	
		Label lblOrdem = new Label(shell, SWT.NONE);
		lblOrdem.setText("Ordem:");
		lblOrdem.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblOrdem.setBounds(171, 91, 87, 21);

		Button btnAnalisar = new Button(shell, SWT.NONE);
		btnAnalisar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try{
					if(mesa.rodada==0){
						Carta ct = mesa.baralho.cartas.get(fieldSuaCt1.getText());
						if(ct == null){
							throw new Exception("Sua Carta 1 está no formato errado, Olhe a ajuda para maiores informações");
						}
						mesa.baralho.pickCarta(ct.getCarta());
						mesa.setSuaCt1(ct.getCarta());
						
						ct = mesa.baralho.cartas.get(fieldSuaCt2.getText());
						if(ct == null){
							throw new Exception("Sua Carta 2 está no formato errado, Olhe a ajuda para maiores informações");
						}else if(ct.isPicked()){
							throw new Exception("Sua Carta 2 está repetida, só um baralho é permitido Patrão!");
						}
						mesa.baralho.pickCarta(ct.getCarta());
						mesa.setSuaCt2(ct.getCarta());

						ct = mesa.baralho.cartas.get(fieldSuaCt3.getText());
						if(ct == null){
							throw new Exception("Sua Carta 3 está no formato errado, Olhe a ajuda para maiores informações");
						}else if(ct.isPicked()){
							throw new Exception("Sua Carta 3 está repetida, só um baralho é permitido Patrão!");
						}
						mesa.baralho.pickCarta(ct.getCarta());
						mesa.setSuaCt3(ct.getCarta());

						ct = mesa.baralho.cartas.get(fieldTombo.getText());
						if(ct == null){
							throw new Exception("Carta Tombo está no formato errado, Olhe a ajuda para maiores informações");
						}else if(ct.isPicked()){
							throw new Exception("O Tombo está repetido, só um baralho é permitido Patrão!");
						}
						mesa.baralho.pickCarta(ct.getCarta());
						mesa.setTombo(ct.getCarta());
						mesa.baralho.corrigiManilhas(ct.getCarta());

						if(btnMao.getSelection()){ 
							System.out.println("--Mao--");
							if(!fieldOpCt1.getText().equals("")){
								throw new Exception("Se você é mão não tem como saber a carta do oponente ainda, ladrãozinho!");
							}	
						}else{
							System.out.println("--Pe--");
							if (fieldOpCt1.getText().equals("")){
								throw new Exception("Você é pé então informe a carta do adversário!");
							}
							ct = mesa.baralho.cartas.get(fieldOpCt1.getText());
							if(ct == null){
								throw new Exception("Carta 1 do Oponente está no formato errado, Olhe a ajuda para maiores informações");
							}else if(ct.isPicked()){
								throw new Exception("Carta 1 do Oponente está repetida, só um baralho é permitido Patrão!");
							}
							mesa.baralho.pickCarta(ct.getCarta());
							mesa.setOpCt1(ct.getCarta());
							fieldOpCt1.setEditable(false);
						}

						if((!fieldOpCt3.getText().equals("") || !fieldOpCt2.getText().equals("")) && fieldOpCt1.getText().equals("")){
							throw new Exception("Coloque as cartas do Oponente na ordem que foram lançadas");
						}
						mesa.ordenaMao();
						fieldSuaCt1.setText(mesa.suaCt1.carta);
						fieldSuaCt2.setText(mesa.suaCt2.carta);
						fieldSuaCt3.setText(mesa.suaCt3.carta);
						lblSuaCt1.setText("Carta Mais Alta");
						lblSuaCt2.setText("Carta Media");
						lblSuaCt3.setText("Carta Mais Baixa");
						fieldSuaCt1.setEditable(false);
						fieldSuaCt2.setEditable(false);
						fieldSuaCt3.setEditable(false);
						fieldTombo.setEditable(false);
						mesa.rodada++;
						bckupMesa = mesa;
					}else if(mesa.rodada == 1){
						Carta ct;
						if(btnMao.getSelection()){ 
							if(!fieldOpCt2.getText().equals("")){
								throw new Exception("Se você é mão não tem como saber a carta do oponente ainda, ladrãozinho!");
							}	
						}
						
						if(btnPe.getSelection()){ 
							if (!fieldOpCt2.getText().equals("")){
										
								ct = mesa.baralho.cartas.get(fieldOpCt2.getText());
								if(ct == null){
									throw new Exception("Carta 2 do Oponente está no formato errado, Olhe a ajuda para maiores informações");
								}else if(ct.isPicked()){
									throw new Exception("Carta 2 do Oponente está repetida, só um baralho é permitido Patrão!");
								}
								mesa.baralho.pickCarta(ct.getCarta());
								mesa.setOpCt2(ct.getCarta());
								
							}
							fieldOpCt2.setEditable(false);
						}
						
						if (!fieldOpCt3.getText().equals("")){
							throw new Exception("Não tem como você saber a carta 3 do oponente ainda!");
						}
						
						mesa.rodada++;
						bckupMesa = mesa;
					}else if(mesa.rodada == 2){
						Carta ct;
						if(btnMao.getSelection()){ 
							if(!fieldOpCt3.getText().equals("")){
								throw new Exception("Se você é mão não tem como saber a carta do oponente ainda, ladrãozinho!");
							}	
						}
						
						if(btnPe.getSelection()){ 
							if (!fieldOpCt3.getText().equals("")){
														
								ct = mesa.baralho.cartas.get(fieldOpCt3.getText());
								if(ct == null){
									throw new Exception("Carta 3 do Oponente está no formato errado, Olhe a ajuda para maiores informações");
								}else if(ct.isPicked()){
									throw new Exception("Carta 3 do Oponente está repetida, só um baralho é permitido Patrão!");
								}
								mesa.baralho.pickCarta(ct.getCarta());
								mesa.setOpCt3(ct.getCarta());
								
							}
							fieldOpCt3.setEditable(false);
						}
						
						mesa.rodada++;
						bckupMesa = mesa;
					}
				}catch(Exception ex){
					MessageDialog.openError(shell, "Error", ex.getMessage());
					//X1 xis = new X1();
					//shell.close();
					//xis.open();
					mesa = new Mesa();
					return;
				}
			}
		});

		btnAnalisar.setBounds(330, 114, 75, 25);
		btnAnalisar.setText("Analisar!!");
		
		Button btnReiniciarMesa = new Button(shell, SWT.NONE);
		btnReiniciarMesa.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				X1 xis = new X1();
				shell.close();
				xis.open();
			}
		});
		btnReiniciarMesa.setText("Reiniciar Mesa");
		btnReiniciarMesa.setBounds(257, 0, 96, 25);
	}
}
