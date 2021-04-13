/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum2;

/**
 *
 * @author acer
 */
public class rental extends Vcdr {
    String aktor,sutradara, kategori;
    
    rental(String aktor, String sutradara, String kategori, String judul, String publisher, int stok){
        super(judul,publisher,stok);
        this.aktor=aktor;
        this.sutradara=sutradara;
        this.kategori=kategori;
    }
    rental(){
        
    }
}

