package C3;

import X2.InterfaceC0755c;

/* loaded from: classes2.dex */
abstract class Q1 extends AbstractBinderC0407a {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC0755c f901o;

    public Q1(InterfaceC0755c interfaceC0755c) {
        this.f901o = interfaceC0755c;
    }

    public final void D0(Object obj) {
        InterfaceC0755c interfaceC0755c = this.f901o;
        if (interfaceC0755c != null) {
            interfaceC0755c.a(obj);
            this.f901o = null;
        }
    }
}
