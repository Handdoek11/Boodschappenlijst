package J1;

import d2.C5700b;
import java.security.MessageDigest;
import q.C6397a;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    private final C6397a f3477b = new C5700b();

    private static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        for (int i8 = 0; i8 < this.f3477b.size(); i8++) {
            f((g) this.f3477b.g(i8), this.f3477b.k(i8), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f3477b.containsKey(gVar) ? this.f3477b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f3477b.h(hVar.f3477b);
    }

    public h e(g gVar, Object obj) {
        this.f3477b.put(gVar, obj);
        return this;
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f3477b.equals(((h) obj).f3477b);
        }
        return false;
    }

    @Override // J1.e
    public int hashCode() {
        return this.f3477b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f3477b + '}';
    }
}
