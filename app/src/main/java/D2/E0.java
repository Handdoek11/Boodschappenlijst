package D2;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1144a;

    /* renamed from: b, reason: collision with root package name */
    private final D0 f1145b;

    public E0(D0 d02) {
        String str;
        this.f1145b = d02;
        try {
            str = d02.b();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            str = null;
        }
        this.f1144a = str;
    }

    public final String toString() {
        return this.f1144a;
    }
}
