package testejmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author eduardo
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1234);
            
            InterfaceServidorMat s = (InterfaceServidorMat) r.lookup("servmat");
            
            System.out.println(s.soma(4, 6))
                    ;
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
}
