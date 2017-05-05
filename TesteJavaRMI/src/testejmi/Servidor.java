package testejmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author eduardo
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            Registry r = LocateRegistry.createRegistry(1234);
            
            ServidorMat s = new ServidorMat();
            
            System.out.println("Iniciando servidor...");
            
            r.rebind("servmat", s);
            
            System.out.println("Servidor ativo.");
        } catch (Exception e) {
            System.out.println("Ocorreu um problema no arranque do servidor.\n" + e.toString());
        }
    }
}
