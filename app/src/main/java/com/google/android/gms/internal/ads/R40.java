package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class R40 {
    public static void a(AtomicReference atomicReference, Q40 q40) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            q40.a(obj);
        } catch (RemoteException e8) {
            H2.p.i("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            H2.p.h("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }
}
