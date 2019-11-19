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
public class HeDaoTao {
    int maHe;
    String tenHe;

    public HeDaoTao(int maHe, String tenHe) {
        this.maHe = maHe;
        this.tenHe = tenHe;
    }
    public Object[] toObject(){
        return new Object[]{this.maHe,this.tenHe};
    }
}
