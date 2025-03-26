package C3;

import X2.InterfaceC0755c;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: C3.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class BinderC0424f1 extends Q1 {

    /* renamed from: s, reason: collision with root package name */
    private final WeakReference f957s;

    /* renamed from: t, reason: collision with root package name */
    private final WeakReference f958t;

    BinderC0424f1(Map map, Object obj, InterfaceC0755c interfaceC0755c) {
        super(interfaceC0755c);
        this.f957s = new WeakReference(map);
        this.f958t = new WeakReference(obj);
    }

    @Override // C3.AbstractBinderC0407a, C3.Y0
    public final void j4(Status status) {
        Map map = (Map) this.f957s.get();
        Object obj = this.f958t.get();
        if (status.m0().B0() == 4002 && map != null && obj != null) {
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
