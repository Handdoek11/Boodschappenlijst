package l7;

import J6.H;
import i7.f;
import java.util.List;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;

/* loaded from: classes2.dex */
public abstract class k {

    public static final class a implements i7.f {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6928j f38864a;

        a(I6.a aVar) {
            this.f38864a = AbstractC6929k.a(aVar);
        }

        private final i7.f b() {
            return (i7.f) this.f38864a.getValue();
        }

        @Override // i7.f
        public String a() {
            return b().a();
        }

        @Override // i7.f
        public boolean c() {
            return f.a.c(this);
        }

        @Override // i7.f
        public int d(String str) {
            J6.r.e(str, "name");
            return b().d(str);
        }

        @Override // i7.f
        public i7.j e() {
            return b().e();
        }

        @Override // i7.f
        public List f() {
            return f.a.a(this);
        }

        @Override // i7.f
        public int g() {
            return b().g();
        }

        @Override // i7.f
        public String h(int i8) {
            return b().h(i8);
        }

        @Override // i7.f
        public boolean i() {
            return f.a.b(this);
        }

        @Override // i7.f
        public List j(int i8) {
            return b().j(i8);
        }

        @Override // i7.f
        public i7.f k(int i8) {
            return b().k(i8);
        }

        @Override // i7.f
        public boolean l(int i8) {
            return b().l(i8);
        }
    }

    public static final g d(j7.e eVar) {
        J6.r.e(eVar, "<this>");
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + H.b(eVar.getClass()));
    }

    public static final l e(j7.f fVar) {
        J6.r.e(fVar, "<this>");
        l lVar = fVar instanceof l ? (l) fVar : null;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + H.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i7.f f(I6.a aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(j7.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(j7.f fVar) {
        e(fVar);
    }
}
