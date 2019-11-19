/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.Date;

/**
 *
 * @author Lemony
 */
public class SinhVien {

    public SinhVien() {
    }

    public SinhVien(Name tenSv, int maSv, Date dob, String address, String sdt, String gioitinh) {
        this.tenSv = tenSv;
        this.maSv = maSv;
        this.dob = dob;
        this.address = address;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
    }
    Name tenSv;
    int maSv;
    Date dob;
    String address;
    String sdt;
    String gioitinh;
    
    public Object[] toObject(){
        return new Object[]{this.tenSv,this.maSv,this.dob,this.address,this.sdt,this.gioitinh};
    }
}

class Name{

    public Name() {
    }

    public Name(String ho, String ten, String dem) {
        this.ho = ho;
        this.ten = ten;
        this.dem = dem;
    }
    String ho,ten,dem;  
    
}