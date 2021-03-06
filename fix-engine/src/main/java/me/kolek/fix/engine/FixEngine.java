package me.kolek.fix.engine;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FixEngine extends Remote {
    FixSession getSession(FixSessionId sessionId) throws RemoteException;

    void shutdown() throws RemoteException;
}
