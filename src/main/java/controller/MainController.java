/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.DanhmucView;
import view.DonviView;
import view.MainView;
import view.SanphamView;

/**
 *
 * @author DELL
 */
public class MainController {

    private MainView view;

    public MainController(MainView view) {
        this.view = view;

        addEvents();
    }

    private void addEvents() {

       view.menuDanhMuc.addActionListener(e -> {
        DanhmucView dv = new DanhmucView();
        new DanhmucController(dv);
        dv.setVisible(true);
    });
       view.menuDonVi.addActionListener(e -> {
    DonviView dv = new DonviView();
    new DonviController(dv);
});
       view.menuSanPham.addActionListener(e -> {
           SanphamView sp = new SanphamView();
           new SanphamController(sp);
           
       });

        //view.menuSanPham.addActionListener(e -> new SanPhamView());
        //view.menuDonVi.addActionListener(e -> new DonViView());
        // Các form khác tạo sau → gắn tiếp vào đây
    }
}
