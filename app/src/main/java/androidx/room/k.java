package androidx.room;

import g1.c;
import java.io.File;

/* loaded from: classes.dex */
class k implements c.InterfaceC0258c {

    /* renamed from: a, reason: collision with root package name */
    private final String f11404a;

    /* renamed from: b, reason: collision with root package name */
    private final File f11405b;

    /* renamed from: c, reason: collision with root package name */
    private final c.InterfaceC0258c f11406c;

    k(String str, File file, c.InterfaceC0258c interfaceC0258c) {
        this.f11404a = str;
        this.f11405b = file;
        this.f11406c = interfaceC0258c;
    }

    @Override // g1.c.InterfaceC0258c
    public g1.c a(c.b bVar) {
        return new j(bVar.f35999a, this.f11404a, this.f11405b, bVar.f36001c.f35998a, this.f11406c.a(bVar));
    }
}
