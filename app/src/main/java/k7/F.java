package k7;

import i7.j;
import i7.k;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class F extends C6151s0 {

    /* renamed from: m, reason: collision with root package name */
    private final i7.j f38603m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC6928j f38604n;

    static final class a extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f38605o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f38606s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ F f38607t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, F f8) {
            super(0);
            this.f38605o = i8;
            this.f38606s = str;
            this.f38607t = f8;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i7.f[] invoke() {
            int i8 = this.f38605o;
            i7.f[] fVarArr = new i7.f[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                fVarArr[i9] = i7.i.d(this.f38606s + '.' + this.f38607t.h(i9), k.d.f36739a, new i7.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, int i8) {
        super(str, null, i8, 2, null);
        J6.r.e(str, "name");
        this.f38603m = j.b.f36735a;
        this.f38604n = AbstractC6929k.a(new a(i8, str, this));
    }

    private final i7.f[] t() {
        return (i7.f[]) this.f38604n.getValue();
    }

    @Override // k7.C6151s0, i7.f
    public i7.j e() {
        return this.f38603m;
    }

    @Override // k7.C6151s0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i7.f)) {
            return false;
        }
        i7.f fVar = (i7.f) obj;
        return fVar.e() == j.b.f36735a && J6.r.a(a(), fVar.a()) && J6.r.a(AbstractC6148q0.a(this), AbstractC6148q0.a(fVar));
    }

    @Override // k7.C6151s0
    public int hashCode() {
        int hashCode = a().hashCode();
        int i8 = 1;
        for (String str : i7.h.b(this)) {
            int i9 = i8 * 31;
            i8 = i9 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i8;
    }

    @Override // k7.C6151s0, i7.f
    public i7.f k(int i8) {
        return t()[i8];
    }

    @Override // k7.C6151s0
    public String toString() {
        return AbstractC6987o.I(i7.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
