package androidx.compose.foundation.layout;

import B.e;
import I6.l;
import J6.s;
import androidx.appcompat.app.E;
import androidx.compose.ui.platform.z;
import c0.i;
import x6.C6916E;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    static final class C0143a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f8066o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ float f8067s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f8068t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ float f8069u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0143a(float f8, float f9, float f10, float f11) {
            super(1);
            this.f8066o = f8;
            this.f8067s = f9;
            this.f8068t = f10;
            this.f8069u = f11;
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

    public static final e a(e eVar, float f8, float f9, float f10, float f11) {
        return eVar.a(new PaddingElement(f8, f9, f10, f11, true, new C0143a(f8, f9, f10, f11), null));
    }

    public static /* synthetic */ e b(e eVar, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = i.c(0);
        }
        if ((i8 & 2) != 0) {
            f9 = i.c(0);
        }
        if ((i8 & 4) != 0) {
            f10 = i.c(0);
        }
        if ((i8 & 8) != 0) {
            f11 = i.c(0);
        }
        return a(eVar, f8, f9, f10, f11);
    }
}
