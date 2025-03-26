package S;

import I6.p;
import J6.AbstractC0650j;
import J6.s;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f5069a;

    /* renamed from: b, reason: collision with root package name */
    private final p f5070b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5071c;

    static final class a extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final a f5072o = new a();

        a() {
            super(2);
        }

        @Override // I6.p
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public n(String str, p pVar) {
        this.f5069a = str;
        this.f5070b = pVar;
    }

    public final String a() {
        return this.f5069a;
    }

    public final Object b(Object obj, Object obj2) {
        return this.f5070b.invoke(obj, obj2);
    }

    public final void c(o oVar, Q6.j jVar, Object obj) {
        oVar.b(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f5069a;
    }

    public /* synthetic */ n(String str, p pVar, int i8, AbstractC0650j abstractC0650j) {
        this(str, (i8 & 2) != 0 ? a.f5072o : pVar);
    }

    public n(String str, boolean z7) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f5071c = z7;
    }

    public n(String str, boolean z7, p pVar) {
        this(str, pVar);
        this.f5071c = z7;
    }
}
