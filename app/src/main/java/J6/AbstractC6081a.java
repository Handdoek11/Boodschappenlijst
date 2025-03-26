package j6;

import a6.i;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import g6.EnumC5814b;
import i6.InterfaceC5876a;
import t6.AbstractC6805a;

/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6081a implements i, InterfaceC5876a {

    /* renamed from: o, reason: collision with root package name */
    protected final i f38347o;

    /* renamed from: s, reason: collision with root package name */
    protected InterfaceC5732b f38348s;

    /* renamed from: t, reason: collision with root package name */
    protected InterfaceC5876a f38349t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f38350u;

    /* renamed from: v, reason: collision with root package name */
    protected int f38351v;

    public AbstractC6081a(i iVar) {
        this.f38347o = iVar;
    }

    @Override // a6.i
    public void a() {
        if (this.f38350u) {
            return;
        }
        this.f38350u = true;
        this.f38347o.a();
    }

    @Override // d6.InterfaceC5732b
    public void c() {
        this.f38348s.c();
    }

    @Override // i6.InterfaceC5880e
    public void clear() {
        this.f38349t.clear();
    }

    @Override // a6.i
    public final void d(InterfaceC5732b interfaceC5732b) {
        if (EnumC5814b.l(this.f38348s, interfaceC5732b)) {
            this.f38348s = interfaceC5732b;
            if (interfaceC5732b instanceof InterfaceC5876a) {
                this.f38349t = (InterfaceC5876a) interfaceC5732b;
            }
            if (h()) {
                this.f38347o.d(this);
                e();
            }
        }
    }

    @Override // i6.InterfaceC5880e
    public final boolean g(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    protected boolean h() {
        return true;
    }

    @Override // i6.InterfaceC5880e
    public boolean isEmpty() {
        return this.f38349t.isEmpty();
    }

    protected final void j(Throwable th) {
        AbstractC5751a.b(th);
        this.f38348s.c();
        onError(th);
    }

    protected final int k(int i8) {
        InterfaceC5876a interfaceC5876a = this.f38349t;
        if (interfaceC5876a == null || (i8 & 4) != 0) {
            return 0;
        }
        int i9 = interfaceC5876a.i(i8);
        if (i9 != 0) {
            this.f38351v = i9;
        }
        return i9;
    }

    @Override // a6.i
    public void onError(Throwable th) {
        if (this.f38350u) {
            AbstractC6805a.m(th);
        } else {
            this.f38350u = true;
            this.f38347o.onError(th);
        }
    }

    protected void e() {
    }
}
