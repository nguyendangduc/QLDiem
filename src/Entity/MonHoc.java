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
public class MonHoc {
    int mamonhoc,sotin;
    String tenmon;

    public MonHoc(int mamonhoc, int sotin, String tenmon) {
        this.mamonhoc = mamonhoc;
        this.sotin = sotin;
        this.tenmon = tenmon;
    }
    public Object[] toObject(){
        return new Object[]{this.mamonhoc,this.tenmon,this.sotin};
    }
    
}
