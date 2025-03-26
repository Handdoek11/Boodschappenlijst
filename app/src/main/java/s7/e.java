package s7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes2.dex */
public class e implements q7.a {

    /* renamed from: o, reason: collision with root package name */
    private final String f43734o;

    /* renamed from: s, reason: collision with root package name */
    private volatile q7.a f43735s;

    /* renamed from: t, reason: collision with root package name */
    private Boolean f43736t;

    /* renamed from: u, reason: collision with root package name */
    private Method f43737u;

    /* renamed from: v, reason: collision with root package name */
    private r7.a f43738v;

    /* renamed from: w, reason: collision with root package name */
    private Queue f43739w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f43740x;

    public e(String str, Queue queue, boolean z7) {
        this.f43734o = str;
        this.f43739w = queue;
        this.f43740x = z7;
    }

    private q7.a d() {
        if (this.f43738v == null) {
            this.f43738v = new r7.a(this, this.f43739w);
        }
        return this.f43738v;
    }

    @Override // q7.a
    public void a(String str) {
        c().a(str);
    }

    @Override // q7.a
    public void b(String str) {
        c().b(str);
    }

    q7.a c() {
        return this.f43735s != null ? this.f43735s : this.f43740x ? b.f43733o : d();
    }

    public boolean e() {
        Boolean bool = this.f43736t;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f43737u = this.f43735s.getClass().getMethod("log", r7.c.class);
            this.f43736t = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f43736t = Boolean.FALSE;
        }
        return this.f43736t.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f43734o.equals(((e) obj).f43734o);
    }

    public boolean f() {
        return this.f43735s instanceof b;
    }

    public boolean g() {
        return this.f43735s == null;
    }

    @Override // q7.a
    public String getName() {
        return this.f43734o;
    }

    public void h(r7.c cVar) {
        if (e()) {
            try {
                this.f43737u.invoke(this.f43735s, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public int hashCode() {
        return this.f43734o.hashCode();
    }

    public void i(q7.a aVar) {
        this.f43735s = aVar;
    }
}
