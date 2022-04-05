/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
abstract class Base {
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;
    
    abstract void addData();
    abstract void updateData();
    abstract void deleteData();
}
