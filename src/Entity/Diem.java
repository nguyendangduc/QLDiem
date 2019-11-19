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
public class Diem {
    int masinhvien,diemlan1,diemlan2,mamonhoc;

    public Diem(int masinhvien, int diemlan1, int diemlan2, int mamonhoc) {
        this.masinhvien = masinhvien;
        this.diemlan1 = diemlan1;
        this.diemlan2 = diemlan2;
        this.mamonhoc = mamonhoc;
    }

    public Object[] toObject(){
        return new Object[]{this.masinhvien,this.diemlan1,this.diemlan2,this.mamonhoc};
    }
   
}
