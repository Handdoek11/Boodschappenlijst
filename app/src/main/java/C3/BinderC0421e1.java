package C3;

import X2.InterfaceC0755c;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: C3.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC0421e1 extends Q1 {

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f948s;

    /* renamed from: t, reason: collision with root package name */
    private final WeakReference f949t;

    BinderC0421e1(Map map, Object obj, InterfaceC0755c interfaceC0755c) {
        super(interfaceC0755c);
        this.f948s = new WeakReference(map);
        this.f949t = new WeakReference(obj);
    }

    @Override // C3.AbstractBinderC0407a, C3.Y0
    public final void j4(Status status) {
        Map map = (Map) this.f948s.get();
        Object obj = this.f949t.get();
        if (!status.m0().E0() && map != null && obj != null) {
            synchronized (map) {
                try {
                    g2 g2Var = (g2) map.remove(obj);
                    if (g2Var != null) {
                        g2Var.t();
                    }
                } finally {
                }
            }
        }
        D0(status);
    }
}
