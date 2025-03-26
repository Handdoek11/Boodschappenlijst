package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f13173a;

    /* renamed from: b, reason: collision with root package name */
    private final V2.l f13174b;

    h(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f13173a = new Messenger(iBinder);
            this.f13174b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f13174b = new V2.l(iBinder);
            this.f13173a = null;
        }
    }

    final void a(Message message) {
        Messenger messenger = this.f13173a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        V2.l lVar = this.f13174b;
        if (lVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        lVar.b(message);
    }
}
