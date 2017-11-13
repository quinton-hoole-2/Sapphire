/*
 * RMI stub class
 * for class ActivationGroup
 * Compatible with stub protocol version 1.2
 *
 * Generated by DRL RMI Compiler (rmic).
 *
 * DO NOT EDIT!!!
 * Contents subject to change without notice!
 */
package harmony_java.rmi.activation;

import org.apache.harmony.rmi.internal.nls.Messages;

import harmony_java.rmi.MarshalledObject;
import harmony_java.rmi.Remote;
import harmony_java.rmi.RemoteException;
import harmony_java.rmi.UnexpectedException;
import harmony_java.rmi.server.RemoteRef;
import harmony_java.rmi.server.RemoteStub;


public final class ActivationGroup_Stub extends RemoteStub
        implements ActivationInstantiator, Remote {

    private static final long serialVersionUID = 2;

    private static java.lang.reflect.Method $method_newInstance_0;

    static {
        try {
            $method_newInstance_0 = ActivationInstantiator.class.getMethod("newInstance", new java.lang.Class[] {ActivationID.class, ActivationDesc.class}); //$NON-NLS-1$
        } catch (java.lang.NoSuchMethodException e) {
            // rmi.0B=Stub class initialization failed: ActivationGroup_Stub
            throw new java.lang.NoSuchMethodError(Messages.getString("rmi.0B")); //$NON-NLS-1$
        }
    }

    public ActivationGroup_Stub(RemoteRef ref) {
        super(ref);
    }

    // Implementation of newInstance(ActivationID, ActivationDesc)
    public MarshalledObject newInstance(ActivationID $param_ActivationID_1, ActivationDesc $param_ActivationDesc_2)
            throws ActivationException, RemoteException {
        try {
            java.lang.Object $result = ref.invoke(this, $method_newInstance_0, new java.lang.Object[] {$param_ActivationID_1, $param_ActivationDesc_2}, -5274445189091581345L);
            return ((MarshalledObject) $result);
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (RemoteException e) {
            throw e;
        } catch (ActivationException e) {
            throw e;
        } catch (java.lang.Exception e) {
            // rmi.0C=Undeclared checked exception
            throw new UnexpectedException(Messages.getString("rmi.0C"), e); //$NON-NLS-1$
        }
    }
}
