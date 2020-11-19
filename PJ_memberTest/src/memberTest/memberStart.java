package memberTest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class memberStart extends JFrame implements ActionListener {

	//����
	JPanel North = new JPanel(new BorderLayout());
		
	//����
		JPanel lblPane = new JPanel(new GridLayout(6,1));
			JLabel numLbl = new JLabel("��ȣ");
			JLabel nameLbl = new JLabel("�̸�");
			JLabel telLbl = new JLabel("����ó");
			JLabel emailLbl = new JLabel("�̸���");
			JLabel addrLbel = new JLabel("�ּ�");
			JLabel writedatelLbl = new JLabel("�����");
			
	//�� �Է� ������Ʈ	
		JPanel tfPane = new JPanel(new GridLayout(6,1));
			JTextField numTf = new JTextField(5);			JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JTextField nameTf = new JTextField(10);			JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JTextField telTf = new JTextField(15);			JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JTextField emailTf = new JTextField(30);		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JTextField addrTf = new JTextField(40);			JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			JTextField writedateTf = new JTextField(20);	JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	//ȸ�����
			String title[] = {"��ȣ", "�̸�", "����ó","�̸���", "�ּ�", "�����"};
			DefaultTableModel model = new DefaultTableModel(title ,0);
			JTable table = new JTable(model);
			JScrollPane sp = new JScrollPane(table);
			
	//�޴�
		JPanel menuPane = new JPanel();
			JButton allListBtn = new JButton("��ü���");
			JButton addBtn = new JButton("�߰�");
			JButton editBtn = new JButton("����");
			JButton delBtn = new JButton("����");
			JButton clearBtn = new JButton("�����");
			JButton excelOpenBtn = new JButton("������ ����");
			JButton excelSaveBtn = new JButton("������ �����ϱ�");
			JButton endBtn = new JButton("����");
		
	
			
			
	public memberStart() {
		super("ȸ�������ý���");
	
	//��
		North.add(BorderLayout.WEST, lblPane);// ���� �߿� ���ʿ� �г� ����
			lblPane.add(numLbl);lblPane.add(nameLbl);lblPane.add(telLbl);
			lblPane.add(emailLbl);lblPane.add(addrLbel);lblPane.add(writedatelLbl);
		
	//�� �Է� ���۳�Ʈ
		North.add(BorderLayout.CENTER, tfPane); // ���� �߿��� �߾ӿ� ����
		p1.add(numTf); 		tfPane.add(p1);
		p2.add(nameTf);		tfPane.add(p2);
		p3.add(telTf);		tfPane.add(p3);
		p4.add(emailTf);	tfPane.add(p4);
		p5.add(addrTf);		tfPane.add(p5);
		p6.add(writedateTf);tfPane.add(p6);
		
	add(BorderLayout.NORTH,North);	
	
	
//	�޴�, ȸ������Ʈ
	JPanel cPane = new JPanel(new BorderLayout());


		
		menuPane.add(allListBtn); menuPane.add(addBtn); menuPane.add(editBtn); menuPane.add(delBtn); 
		menuPane.add(clearBtn);menuPane.add(excelOpenBtn); menuPane.add(excelSaveBtn); menuPane.add(endBtn); 
		
		cPane.add(menuPane,BorderLayout.NORTH);
		cPane.add(sp);
		
		add(cPane);
		
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
		
//	��ü���ڵ� �߰�
		getAllRecord();

		
		
	//JTable�̺�Ʈ ����ϱ�
		table.addMouseListener(new MouseAdapter() {

			public void mouseReleased(MouseEvent me) {
				if(me.getButton() == 1) {//���콺�� ���ʹ�ư Ŭ���� ����
					int row = table.getSelectedRow();//���缱�õ� ���� index 
					numTf.setText(String.valueOf((Integer)model.getValueAt(row, 0)));
					nameTf.setText((String)model.getValueAt(row,1));
					telTf.setText((String)model.getValueAt(row, 2));
					emailTf.setText((String)model.getValueAt(row, 3));
					addrTf.setText((String)model.getValueAt(row, 4));
					writedateTf.setText((String)model.getValueAt(row,5));
				}		
			}		
		});
	

		
		
	//�޴� �̺�Ʈ ���
	addBtn.addActionListener(this);
	editBtn.addActionListener(this);
	delBtn.addActionListener(this);
	clearBtn.addActionListener(this);
	endBtn.addActionListener(this);
	excelSaveBtn.addActionListener(this);
	excelOpenBtn.addActionListener(this);
	allListBtn.addActionListener(this);
		
}
	
	

//	���ڵ� ��ü �����Ͽ� JTable�� �߰��ϱ�
	public void getAllRecord() {
		//JTable���̺� �ִ� ���ڵ� �����
		model.setRowCount(0);
		
		//DAO ��ü����
	
		MemberDAO dao = MemberDAO.getInstance();
		List<MemberVO> list = dao.getAllMember();
		
		for(int i=0; i<list.size(); i++) {
			MemberVO vo = list.get(i);
			vo.print();
			Object[] record = {vo.getNum(), vo.getUsername(), vo.getTel(), vo.getEmail(), vo.getAddr(), vo.getWritedate()};
			model.addRow(record);
			
		}
	}
	
	
	
//	���� ���ڿ������
	public void formClear() {
		numTf.setText("");
		nameTf.setText("");
		telTf.setText("");
		emailTf.setText("");
		addrTf.setText("");
		writedateTf.setText("");
	}
	
	
//	���� ���ڵ带 �����ͺ��̽��� �߰�
	public void memberinsert() {
		MemberVO vo = new MemberVO();
		vo.setNum(Integer.parseInt(numTf.getText()));
		vo.setUsername(nameTf.getText());
		vo.setTel(telTf.getText());
		vo.setEmail(emailTf.getText());
		vo.setAddr(addrTf.getText());
	
		
		
//	�������Է�����Ȯ��
		if(vo.getNum() == 0) {
			JOptionPane.showMessageDialog(this, "��ȣ�� �Է��ϼ���...");	
		}else if(vo.getUsername()==null || vo.getUsername().equals("")) {
			JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���...");	
		}else if(vo.getTel() == null || vo.getTel().equals("")) {
			JOptionPane.showMessageDialog(this, "����ó�� �Է��ϼ���...");	
		}else {
			MemberDAO dao = new MemberDAO();
			int result = dao.insertRecord(vo);
				
				if(result>0) {//�߰��Ǿ�����
					JOptionPane.showConfirmDialog(this,"ȸ���� ��ϵǾ����ϴ�.");	
					getAllRecord();
				}else {//�߰� ���н�
					JOptionPane.showConfirmDialog(this," ȸ������� �����Ͽ����ϴ�.");

			
			}
		}
	}
	
//	ȸ����������
	public void memberEdit() {
		MemberVO vo = new MemberVO();
		vo.setNum(Integer.parseInt(numTf.getText()));
		vo.setUsername(nameTf.getText());
		vo.setTel(telTf.getText());
		vo.setEmail(emailTf.getText());
		vo.setAddr(addrTf.getText());
		if(vo.getNum()<=0) {
			JOptionPane.showMessageDialog(this,"��ȣ�� �ݵ�� �־�� �մϴ�.");
					
		}else if(vo.getUsername() == null || vo.getUsername().equals("")) {
			JOptionPane.showConfirmDialog(this,"�̸��� �ݵ�� �־�� �մϴ�.");
			
		}else if(vo.getTel()==null || vo.getTel().equals("")) {
			JOptionPane.showMessageDialog(this, "����ó�� �ݵ�� �־�� �մϴ�.");
		}else {
			MemberDAO dao = MemberDAO.getInstance();
			int result = dao.updateRecord(vo);
			if(result>0) { //������
				JOptionPane.showMessageDialog(this, "ȸ�������� �����Ǿ����ϴ�.");
				getAllRecord();
				formClear();
			}else {//��������
				JOptionPane.showMessageDialog(this, "ȸ������ ���� ����");
				
			}
		}
	}
	
//	ȸ������
	public void memberDelete() {
		int okNo = JOptionPane.showConfirmDialog(this, "ȸ�������Ͻðڽ��ϱ�?","ȸ������Ȯ��",JOptionPane.YES_NO_CANCEL_OPTION);
		if(okNo == JOptionPane.OK_OPTION) {
			MemberDAO dao = MemberDAO.getInstance();
			int result = dao.deleteRecord(Integer.parseInt(numTf.getText()));
			if(result>0) {
				JOptionPane.showMessageDialog(this, "ȸ���� �����Ǿ����ϴ�.");
				getAllRecord();
				formClear();
			}else {
				JOptionPane.showMessageDialog(this, "ȸ������ �����Ͽ����ϴ�.");
			
				
			}
		}
	}
	
//	������ JTable������ �����ϱ�
	public void setExcelSave() {
		JFileChooser fc = new JFileChooser();
		
		int state = fc.showSaveDialog(this);
		if(state == 0) { //�����ư�� ����������
			
			//��ũ��
			HSSFWorkbook book = new HSSFWorkbook();
			//��Ʈ
			HSSFSheet sheet = book.createSheet("ȸ�����");
			//����
			HSSFRow r = sheet.createRow(0);
			r.createCell(0).setCellValue("��ȣ");
			r.createCell(1).setCellValue("�̸�");
			r.createCell(2).setCellValue("����ó");
			r.createCell(3).setCellValue("�̸���");
			r.createCell(4).setCellValue("�ּ�");
			r.createCell(5).setCellValue("�����");
			
			//��
			int rowCount = table.getRowCount();//JTable�� �ִ� ���ڵ� �� ���ϱ�
			for(int row=0; row<rowCount; row++) {//0~7
				HSSFRow r1 = sheet.createRow(row+1);

				//��
				int columnCount = table.getColumnCount();//���� �ҷ�����
					for(int col=0; col<columnCount; col++) {	//0~5
						if(col == 0) { //����
							r1.createCell(col).setCellValue((Integer)model.getValueAt(row, col));
						}else {//����
							r1.createCell(col).setCellValue((String)model.getValueAt(row, col));
					}
				}	
			}

			//��ũ���� ���Ͽ� ����
			try {
			File f = fc.getSelectedFile();
			FileOutputStream fos = new FileOutputStream(f);
			
			book.write(fos);
			fos.close();
			book.close();
			JOptionPane.showMessageDialog(this, "������ ���Ⱑ �Ϸ�Ǿ����ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "������ ���Ⱑ �����Ͽ����ϴ�.");
			}
		}
	}
	
// ���������� �о� JTable������� ǥ���ϱ�
	public void setExcelLoan() {
		JFileChooser fc = new JFileChooser();
		int state = fc.showOpenDialog(this);
		if(state==0) {
			try {
				File f = fc.getSelectedFile();
				FileInputStream fis = new FileInputStream(f);
				POIFSFileSystem poi = new POIFSFileSystem(fis);
				
//				��ũ��
				HSSFWorkbook book = new HSSFWorkbook(poi);
//				��Ʈ
				HSSFSheet sheet = book.getSheet("ȸ�����");
				
//				JTable�� ���� ���� ���ֱ�
				
				model.setRowCount(0);
//				��
				int rowCount = sheet.getPhysicalNumberOfRows();
				for(int r=1; r<rowCount; r++) {
					HSSFRow row = sheet.getRow(r);
					
					//��
					int cellCount = row.getPhysicalNumberOfCells();//���� ��
					Object data[] = new Object[cellCount];
					
					for(int c=0; c<cellCount;c++) {
						
						if(c==0) {//����
							data[c] = row.getCell(c).getNumericCellValue();
							
							
						}else {//����
							data[c] = row.getCell(c).getRichStringCellValue();

						}		
					}
					model.addRow(data);
				
				}
				poi.close();
				fis.close();
		}catch(Exception e) {
			e.printStackTrace();

			}
		}
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		Object event = ae.getSource();
		if(event == clearBtn) { //���� ���ڿ��� �����
				formClear();
		}else if(event == addBtn) {//���� ���ڵ带 �����ͺ��̽��� �߰�
				memberinsert();	
		}else if(event == editBtn) {//��� ����
				memberEdit();	
		}else if(event == delBtn) {//��� �����
				memberDelete();
		}else if(event == excelSaveBtn) {//���� �����ϱ�
				setExcelSave();
		}else if(event == excelOpenBtn) {//���� ����
				setExcelLoan();
		}else if(event == endBtn) {//����
				System.exit(0);
		}else if(event == allListBtn) {
				getAllRecord();
		
		
		}
	}
	public static void main(String[] args) {	
		new memberStart();
	}
}
