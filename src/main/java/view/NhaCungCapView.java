package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NhaCungCapView extends JFrame {
    public JTextField txtID, txtTen, txtSdt, txtDiaChi, txtEmail, txtTimKiem;
    public JButton btnThem, btnSua, btnXoa, btnLamMoi;
    public JTable tblNCC;
    public DefaultTableModel tableModel;

    public NhaCungCapView() {
        setTitle("Quản lý Nhà Cung Cấp");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header màu xanh Teal cho NCC khác với Khách hàng
        JPanel pnlHeader = new JPanel();
        pnlHeader.setBackground(new Color(0, 150, 136));
        JLabel lblTitle = new JLabel("QUẢN LÝ NHÀ CUNG CẤP");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblTitle.setForeground(Color.WHITE);
        pnlHeader.add(lblTitle);
        add(pnlHeader, BorderLayout.NORTH);

        JPanel pnlMain = new JPanel(new BorderLayout());
        
        // --- LEFT: FORM ---
        JPanel pnlLeft = new JPanel();
        pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
        pnlLeft.setPreferredSize(new Dimension(300, 0));
        pnlLeft.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtID = new JTextField(); txtID.setEnabled(false);
        txtTen = new JTextField(); txtSdt = new JTextField();
        txtDiaChi = new JTextField(); txtEmail = new JTextField();

        pnlLeft.add(new JLabel("ID NCC:")); pnlLeft.add(txtID);
        pnlLeft.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlLeft.add(new JLabel("Tên NCC:")); pnlLeft.add(txtTen);
        pnlLeft.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlLeft.add(new JLabel("SĐT:")); pnlLeft.add(txtSdt);
        pnlLeft.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlLeft.add(new JLabel("Địa chỉ:")); pnlLeft.add(txtDiaChi);
        pnlLeft.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlLeft.add(new JLabel("Email:")); pnlLeft.add(txtEmail);

        JPanel pnlButtons = new JPanel(new GridLayout(2, 2, 5, 5));
        btnThem = new JButton("Thêm"); btnSua = new JButton("Sửa");
        btnXoa = new JButton("Xóa"); btnLamMoi = new JButton("Làm mới");
        pnlButtons.add(btnThem); pnlButtons.add(btnSua);
        pnlButtons.add(btnXoa); pnlButtons.add(btnLamMoi);
        pnlLeft.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlLeft.add(pnlButtons);

        pnlMain.add(pnlLeft, BorderLayout.WEST);

        // --- RIGHT: SEARCH & TABLE ---
        JPanel pnlRight = new JPanel(new BorderLayout());
        JPanel pnlSearch = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlSearch.add(new JLabel("Tìm NCC (Tên/Địa chỉ):"));
        txtTimKiem = new JTextField(25);
        pnlSearch.add(txtTimKiem);
        pnlRight.add(pnlSearch, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new String[]{"ID", "Tên NCC", "SĐT", "Địa chỉ", "Email"}, 0);
        tblNCC = new JTable(tableModel);
        pnlRight.add(new JScrollPane(tblNCC), BorderLayout.CENTER);

        pnlMain.add(pnlRight, BorderLayout.CENTER);
        add(pnlMain, BorderLayout.CENTER);
    }
}