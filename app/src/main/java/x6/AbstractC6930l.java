package x6;

import J6.AbstractC0650j;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6930l {

    /* renamed from: x6.l$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44479a;

        static {
            int[] iArr = new int[EnumC6932n.values().length];
            try {
                iArr[EnumC6932n.f44480o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6932n.f44481s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6932n.f44482t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44479a = iArr;
        }
    }

    public static InterfaceC6928j a(I6.a aVar) {
        J6.r.e(aVar, "initializer");
        AbstractC0650j abstractC0650j = null;
        return new s(aVar, abstractC0650j, 2, abstractC0650j);
    }

    public static InterfaceC6928j b(EnumC6932n enumC6932n, I6.a aVar) {
        J6.r.e(enumC6932n, "mode");
        J6.r.e(aVar, "initializer");
        int i8 = a.f44479a[enumC6932n.ordinal()];
        int i9 = 2;
        if (i8 == 1) {
            AbstractC0650j abstractC0650j = null;
            return new s(aVar, abstractC0650j, i9, abstractC0650j);
        }
        if (i8 == 2) {
            return new r(aVar);
        }
        if (i8 == 3) {
            return new C6917F(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
