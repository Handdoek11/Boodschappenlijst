package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static I6.l f8252a = a.f8253o;

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0.q b(int i8) {
        return i8 != 0 ? i8 != 1 ? c0.q.Ltr : c0.q.Rtl : c0.q.Ltr;
    }

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f8253o = new a();

        a() {
            super(1);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            androidx.appcompat.app.E.a(obj);
            b(null);
            return null;
        }

        public final X.a b(X.a aVar) {
            return aVar;
        }
    }
}
