package testejmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author eduardo
 */
public class ServidorMat extends UnicastRemoteObject implements InterfaceServidorMat {

    public ServidorMat() throws RemoteException {
        System.out.println("Novo Servidor instanciado...");
    }

    @Override
    public double soma(double a, double b) throws RemoteException {
        System.out.println(a + b);
        return a + b;
    }

    @Override
    public double subtrai(double a, double b) throws RemoteException {
        System.out.println(a - b);
        return a - b;
    }

    @Override
    public double multiplica(double a, double b) throws RemoteException {
        System.out.println(a * b);
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        System.out.println(a / b);
        return a / b;
    }
}
