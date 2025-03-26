package androidx.compose.foundation.layout;

import B.a;
import B.e;
import I6.l;
import J6.s;
import androidx.appcompat.app.E;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.platform.y;
import androidx.compose.ui.platform.z;
import x6.C6916E;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final FillElement f8070a;

    /* renamed from: b, reason: collision with root package name */
    private static final FillElement f8071b;

    /* renamed from: c, reason: collision with root package name */
    private static final FillElement f8072c;

    /* renamed from: d, reason: collision with root package name */
    private static final WrapContentElement f8073d;

    /* renamed from: e, reason: collision with root package name */
    private static final WrapContentElement f8074e;

    /* renamed from: f, reason: collision with root package name */
    private static final WrapContentElement f8075f;

    /* renamed from: g, reason: collision with root package name */
    private static final WrapContentElement f8076g;

    /* renamed from: h, reason: collision with root package name */
    private static final WrapContentElement f8077h;

    /* renamed from: i, reason: collision with root package name */
    private static final WrapContentElement f8078i;

    public static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f8079o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f8) {
            super(1);
            this.f8079o = f8;
        }

        public final void b(z zVar) {
            throw null;
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            E.a(obj);
            b(null);
            return C6916E.f44463a;
        }
    }

    static {
        FillElement.a aVar = FillElement.f8041e;
        f8070a = aVar.c(1.0f);
        f8071b = aVar.a(1.0f);
        f8072c = aVar.b(1.0f);
        WrapContentElement.a aVar2 = WrapContentElement.f8057g;
        a.C0003a c0003a = B.a.f251a;
        f8073d = aVar2.c(c0003a.b(), false);
        f8074e = aVar2.c(c0003a.d(), false);
        f8075f = aVar2.a(c0003a.c(), false);
        f8076g = aVar2.a(c0003a.e(), false);
        f8077h = aVar2.b(c0003a.a(), false);
        f8078i = aVar2.b(c0003a.f(), false);
    }

    public static final e a(e eVar, float f8) {
        return eVar.a(f8 == 1.0f ? f8070a : FillElement.f8041e.c(f8));
    }

    public static /* synthetic */ e b(e eVar, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        return a(eVar, f8);
    }

    public static final e c(e eVar, float f8) {
        return eVar.a(new SizeElement(0.0f, f8, 0.0f, f8, true, y.b() ? new a(f8) : y.a(), 5, null));
    }
}
