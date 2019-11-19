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
public class Khoa {
    int maKhoa;
    String tenKhoa,diaChi;

    public Khoa(int maKhoa, String tenKhoa, String diaChi) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.diaChi = diaChi;
    }
    public Object[] toObject(){
        return new Object[]{this.maKhoa,this.tenKhoa,this.diaChi};
    }
}
