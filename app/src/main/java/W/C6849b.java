package w;

import J6.AbstractC0650j;
import java.util.Map;
import java.util.Set;
import v.InterfaceC6820a;
import v.InterfaceC6821b;
import y6.AbstractC6975c;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6849b extends AbstractC6975c implements Map, K6.a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f44163u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f44164v = 8;

    /* renamed from: w, reason: collision with root package name */
    private static final C6849b f44165w = new C6849b(C6857j.f44174d.a(), 0);

    /* renamed from: s, reason: collision with root package name */
    private final C6857j f44166s;

    /* renamed from: t, reason: collision with root package name */
    private final int f44167t;

    /* renamed from: w.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public C6849b(C6857j c6857j, int i8) {
        this.f44166s = c6857j;
        this.f44167t = i8;
    }

    private final InterfaceC6821b j() {
        return new C6851d(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f44166s.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // y6.AbstractC6975c
    public final Set d() {
        return j();
    }

    @Override // y6.AbstractC6975c
    public int f() {
        return this.f44167t;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f44166s.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // y6.AbstractC6975c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC6821b e() {
        return new C6853f(this);
    }

    public final C6857j l() {
        return this.f44166s;
    }

    @Override // y6.AbstractC6975c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public InterfaceC6820a g() {
        return new C6855h(this);
    }
}
