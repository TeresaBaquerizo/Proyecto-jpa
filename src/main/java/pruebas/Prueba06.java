
package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import daos.RolDao;
import daos.RollDaoImplementado;

import java.util.List;
import model.Rol;

public class Prueba06 {

	public static void main(String[] args) {

		RolDao dao=new RollDaoImplementado();
		
		Rol rol =new Rol();
		rol.setRolName("asistente");
		rol.setRolStatus(1);
		
		dao.create(rol);
		
		List<Rol> rolList =dao.findAll();
        
		for(Rol r:rolList) {
			System.out.println(r.getIdrol());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
		}
		
	}

}
