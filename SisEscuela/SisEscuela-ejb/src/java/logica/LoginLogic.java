/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import Dao.UsuarioDao;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author gianco
 */
@Stateless
@LocalBean
public class LoginLogic {
    UsuarioDao user = new UsuarioDao();
    public boolean isUser(String _nombre,String _apellido){
        return user.isUser(_nombre, _apellido);
    }
}
