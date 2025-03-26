package S;

import I6.p;
import J6.s;
import x6.InterfaceC6925g;

/* loaded from: classes.dex */
public final class l extends s implements p {

    /* renamed from: o, reason: collision with root package name */
    public static final l f5067o = new l();

    public l() {
        super(2);
    }

    @Override // I6.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a invoke(a aVar, a aVar2) {
        String b8;
        InterfaceC6925g a8;
        if (aVar == null || (b8 = aVar.b()) == null) {
            b8 = aVar2.b();
        }
        if (aVar == null || (a8 = aVar.a()) == null) {
            a8 = aVar2.a();
        }
        return new a(b8, a8);
    }
}
