package N1;

import N1.a;
import java.io.File;

/* loaded from: classes.dex */
public abstract class d implements a.InterfaceC0073a {

    /* renamed from: a, reason: collision with root package name */
    private final long f4062a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4063b;

    public interface a {
        File a();
    }

    public d(a aVar, long j8) {
        this.f4062a = j8;
        this.f4063b = aVar;
    }

    @Override // N1.a.InterfaceC0073a
    public N1.a a() {
        File a8 = this.f4063b.a();
        if (a8 == null) {
            return null;
        }
        if (a8.isDirectory() || a8.mkdirs()) {
            return e.c(a8, this.f4062a);
        }
        return null;
    }
}
