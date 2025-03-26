package s1;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private UUID f42707a;

    /* renamed from: b, reason: collision with root package name */
    private A1.p f42708b;

    /* renamed from: c, reason: collision with root package name */
    private Set f42709c;

    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        A1.p f42712c;

        /* renamed from: e, reason: collision with root package name */
        Class f42714e;

        /* renamed from: a, reason: collision with root package name */
        boolean f42710a = false;

        /* renamed from: d, reason: collision with root package name */
        Set f42713d = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        UUID f42711b = UUID.randomUUID();

        a(Class cls) {
            this.f42714e = cls;
            this.f42712c = new A1.p(this.f42711b.toString(), cls.getName());
            a(cls.getName());
        }

        public final a a(String str) {
            this.f42713d.add(str);
            return d();
        }

        public final u b() {
            u c8 = c();
            C6722b c6722b = this.f42712c.f104j;
            boolean z7 = (Build.VERSION.SDK_INT >= 24 && c6722b.e()) || c6722b.f() || c6722b.g() || c6722b.h();
            if (this.f42712c.f111q && z7) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f42711b = UUID.randomUUID();
            A1.p pVar = new A1.p(this.f42712c);
            this.f42712c = pVar;
            pVar.f95a = this.f42711b.toString();
            return c8;
        }

        abstract u c();

        abstract a d();

        public final a e(C6722b c6722b) {
            this.f42712c.f104j = c6722b;
            return d();
        }

        public final a f(androidx.work.b bVar) {
            this.f42712c.f99e = bVar;
            return d();
        }
    }

    protected u(UUID uuid, A1.p pVar, Set set) {
        this.f42707a = uuid;
        this.f42708b = pVar;
        this.f42709c = set;
    }

    public String a() {
        return this.f42707a.toString();
    }

    public Set b() {
        return this.f42709c;
    }

    public A1.p c() {
        return this.f42708b;
    }
}
