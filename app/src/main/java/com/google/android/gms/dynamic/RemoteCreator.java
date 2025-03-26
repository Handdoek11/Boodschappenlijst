package com.google.android.gms.dynamic;

import Z2.r;
import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.AbstractC1110i;

/* loaded from: classes.dex */
public abstract class RemoteCreator {

    /* renamed from: a, reason: collision with root package name */
    private final String f13440a;

    /* renamed from: b, reason: collision with root package name */
    private Object f13441b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    protected RemoteCreator(String str) {
        this.f13440a = str;
    }

    protected abstract Object a(IBinder iBinder);

    protected final Object b(Context context) {
        if (this.f13441b == null) {
            r.l(context);
            Context remoteContext = AbstractC1110i.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f13441b = a((IBinder) remoteContext.getClassLoader().loadClass(this.f13440a).newInstance());
            } catch (ClassNotFoundException e8) {
                throw new RemoteCreatorException("Could not load creator class.", e8);
            } catch (IllegalAccessException e9) {
                throw new RemoteCreatorException("Could not access creator.", e9);
            } catch (InstantiationException e10) {
                throw new RemoteCreatorException("Could not instantiate creator.", e10);
            }
        }
        return this.f13441b;
    }
}
