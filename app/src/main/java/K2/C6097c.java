package k2;

import android.content.Context;
import t2.InterfaceC6791a;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6097c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38496a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6791a f38497b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6791a f38498c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38499d;

    C6097c(Context context, InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f38496a = context;
        if (interfaceC6791a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f38497b = interfaceC6791a;
        if (interfaceC6791a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f38498c = interfaceC6791a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f38499d = str;
    }

    @Override // k2.h
    public Context b() {
        return this.f38496a;
    }

    @Override // k2.h
    public String c() {
        return this.f38499d;
    }

    @Override // k2.h
    public InterfaceC6791a d() {
        return this.f38498c;
    }

    @Override // k2.h
    public InterfaceC6791a e() {
        return this.f38497b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f38496a.equals(hVar.b()) && this.f38497b.equals(hVar.e()) && this.f38498c.equals(hVar.d()) && this.f38499d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f38496a.hashCode() ^ 1000003) * 1000003) ^ this.f38497b.hashCode()) * 1000003) ^ this.f38498c.hashCode()) * 1000003) ^ this.f38499d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f38496a + ", wallClock=" + this.f38497b + ", monotonicClock=" + this.f38498c + ", backendName=" + this.f38499d + "}";
    }
}
