/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Lemony
 */
public class Lop {
    int maKhoa,maLop,maHeDaoTao;
    String tenLop;

    public Lop(int maKhoa, int maLop, int maHeDaoTao, String tenLop) {
        this.maKhoa = maKhoa;
        this.maLop = maLop;
        this.maHeDaoTao = maHeDaoTao;
        this.tenLop = tenLop;
    }

    /**
     *
     * @return
     */
    public Object[] toObject(){
        return new Object[]{this.maLop,this.maKhoa,this.tenLop,this.maHeDaoTao};
    }
}
