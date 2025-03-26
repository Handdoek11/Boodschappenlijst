package s6;

import a6.i;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import java.util.concurrent.atomic.AtomicReference;
import r6.AbstractC6712d;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6760a implements i, InterfaceC5732b {

    /* renamed from: o, reason: collision with root package name */
    final AtomicReference f43726o = new AtomicReference();

    @Override // d6.InterfaceC5732b
    public final void c() {
        EnumC5814b.a(this.f43726o);
    }

    @Override // a6.i
    public final void d(InterfaceC5732b interfaceC5732b) {
        if (AbstractC6712d.c(this.f43726o, interfaceC5732b, getClass())) {
            e();
        }
    }

    protected void e() {
    }
}
